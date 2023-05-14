/**
 *Clase que crea el panel del expendedor
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

import Elementos.*;
import Tarea_1.*;

public class PanelExpendedor extends JPanel {
    /**
     * definimos un deposito de productos, un expendedor, moneda, numero de productos, vuelto y un comprador
     */
    private DepProductos pd;
    private Expendedor exp;
    private Moneda moneda;
    private int numproducto;
    private Producto producto;
    private DepVuelto vuelto;
    private DepMonedas md;
    private Comprador c;

    /**
     * el metodo constructor genera un panel expendedor, tomando un expendedor exp, un depVuelto vuelto y un deposito
     * de productos pd
     */
    public PanelExpendedor(){
        this.setLayout(null);

        exp=new Expendedor(24,900,100);
        md=new DepMonedas();

        vuelto=new DepVuelto();
        vuelto.setBounds(0,0,700,720);
        this.add(vuelto);

        pd=new DepProductos();
        pd.setBounds(0,0,700,720);
        this.add(pd);
    }

    /**
     * mover mueve un numero de producto en el panel expendedor
     */
    public void mover(){
        pd.mover(numproducto);
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
     * numProducto define el numero de productos
     * @param num es el numero de productos
     */
    public void numProducto(int num){
        numproducto=num;
    }

    /**
     * comprarProducto compra un producto del expendedor con una moneda. Si el producto es no nulo, se calcula el vuelto
     * segun su precio y ademas se imprime su numero de serie. De lo contrario, se devuelve la moneda que se ingresó.
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
     * getvuelto obtiene y grafica el vuelto y su valor
     */
    public void getVuelto(){vuelto.entregarVuelto(0,"",1);}

    /**
     * getproduct retira un producto de el deposito de productos
     */
    public void getProducto(){
        pd.retirarProducto();
    }
    public void reset(){
        moneda=null;
        producto=null;
    }

    /**
     * paint se encarga de pintar el panel expendedor
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
}