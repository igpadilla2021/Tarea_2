package Grafic; /**
 *Clase que crea el panel del expendedor
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Elementos.*;
import Grafic.DepProductos;
import Grafic.PanelPrincipal;
import Tarea_1.*;

public class PanelExpendedor extends JPanel implements MouseListener {
    /**
     * definimos un deposito de productos,un expendedor(tarea_1), un panel principal, moneda, numero de producto,
     * vuelto, un deposito de un solo producto, un depostio de monedas y un comprador
     */
    private DepProductos pd;
    private Expendedor exp;
    private Moneda moneda;
    private int numproducto;
    private Producto producto;
    private DepVuelto vuelto;
    private DepMonedas md;
    private Comprador c;
    private PanelPrincipal pp;

    /**
     * el metodo constructor genera un panel principal, un expendedor exp(tarea_1), un depVuelto vuelto y un deposito
     * de productos pd
     */
    public PanelExpendedor(PanelPrincipal pp){
        this.setLayout(null);
        this.pp=pp;

        exp=new Expendedor(24,0,1100);
        md=new DepMonedas();

        vuelto=new DepVuelto();
        vuelto.setBounds(0,0,700,720);
        this.add(vuelto);

        pd=new DepProductos();
        pd.setBounds(0,0,700,720);
        this.add(pd);

        this.addMouseListener(this);
    }

    /**
     * numProducto define el numero de productos
     * @param num es el numero de productos
     */
    public void numProducto(int num){
        numproducto=num;
    }

    /**
     * Moneda define las monedas que se pueden utilizar, 100, 500 y 1000 pesos. Tambien se hace un print para saber el
     * numero de serie de la moneda.
     * @param num es un int para seleccionar el tipo de moneda que se quiere utilizar.
     */
    public void Moneda(int num){
        if(num==1){
            moneda=new Moneda100();
        }
        if(num==2){
            moneda=new Moneda500();
        }
        if(num==3){
            moneda=new Moneda1000();
        }
        comprarProducto(moneda,numproducto,exp);
    }

    /**
     * comprarProducto compra un producto del expendedor con una moneda. Si el producto es no nulo, se almacena
     * la moneda usada dentro del expendedor, se mueve el producto, se calcula el vuelto segun su precio y ademas se
     * imprime su numero de serie. De lo contrario, se devuelve la moneda que se ingresó.
     * @param m es la moneda ocupada para comprar
     * @param num es el numero de producto
     * @param exp es el expendedor que se ocupa
     */
    public void comprarProducto(Moneda m, int num, Expendedor exp){
        c=new Comprador(m,num,exp);
        producto=c.Prodcuto();
        if(producto!=null){
            md.add(moneda);
            mover();
            vuelto.entregarVuelto(c.cuantoVuelto()/100,"100",1);
        }
        else{
            if(moneda.getValor()==100){
                vuelto.entregarVuelto(1,"100",1);
            }
            else if(moneda.getValor()==500){
                vuelto.entregarVuelto(1,"500",2);
            }
            else if(moneda.getValor()==1000){
                vuelto.entregarVuelto(1,"1000",3);
            }
        }
    }

    /**
     * mover llama a mover un producto en el panel expendedor
     */
    public void mover(){
        pd.mover(numproducto);
    }

    /**
     * getproduct retira un producto de el deposito de productos
     */
    public void getProducto(){
        pd.retirarProducto();
    }

    /**
     * getvuelto obtiene y grafica el vuelto y su valor
     */
    public void getVuelto(){vuelto.entregarVuelto(0,"",1);}

    /**
     * Producto define un producto
     * @return retorna el producto
     */
    public Producto producto(){
        return producto;
    }

    /**
     * define un comprador
     * @return retorna un comprador c
     */
    public Comprador getComprador(){
        return c;
    }

    /**
     * reset establece moneda y producto en null para iniciar un nuevo proceso de compra
     */
    public void reset(){
        moneda=null;
        producto=null;
    }

    /**
     * llenarDeposito llama a rellenar los depositos que se encuentren vacios
     */
    public void llenarDeposito(int num){
        exp.llenarDeposito(num);
        pd.llenarDepostio(num);
    }

    /**
     * paint se encarga de pintar el panel expendedor, el diseño grafico de este, ademas del numero de serie de la
     * moneda y/o producto siempre que este sea distinto de null
     * @param g es el "pincel" que pinta el panel
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 125, 500, 10);
        g.fillRect(0, 250, 500, 10);
        g.fillRect(0, 375, 500, 10);
        g.fillRect(0, 500, 500, 10);
        g.setColor(new Color(173,216,230));
        g.fillRect(350,20,150,70);
        g.setColor(Color.darkGray);
        if(null != moneda){
            g.drawString("N° MONEDA ="+moneda.getSerie(),355,45);
        }
        if(producto!=null){
            g.drawString("N° PRODUCTO ="+producto.getSerie(),355,65);
        }
        g.drawRect(350,20,150,70);
        g.fillRect(0, 0, 500, 20);
        g.fillRect(0,650,500,20);
        g.fillRect(0, 520, 500, 20);
        g.fillRect(0, 0, 20, 650);
        g.fillRect(220, 540, 20, 110);
        g.fillRect(480, 540, 20, 110);
    }
    public void mouseClicked(MouseEvent me) {;}
    public void mousePressed(MouseEvent me) {
        for(int t=0; t<4 ;t=t+1){
            if(pd.cuantasQuedan(t)==0){
                llenarDeposito(t);
                pp.repaint();
            }
        }
    }
    public void mouseReleased(MouseEvent me) {;}
    public void mouseEntered(MouseEvent me) {;}
    public void mouseExited(MouseEvent me) {;}
}