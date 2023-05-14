import javax.swing.*;
import java.awt.*;

import Elementos.DepVuelto;
import Tarea_1.*;

public class PanelExpendedor extends JPanel {
    private DepProductos pd;
    private Expendedor exp;
    private Moneda moneda;
    private int numproducto;
    private Producto producto;
    private DepVuelto vuelto;
    private Comprador c;
    public PanelExpendedor(){
        this.setLayout(null);

        exp=new Expendedor(24,100,1500);

        vuelto=new DepVuelto();
        vuelto.setBounds(0,0,700,720);
        this.add(vuelto);

        pd=new DepProductos();
        pd.setBounds(0,0,700,720);
        this.add(pd);
    }
    public void mover(){
        pd.mover(numproducto);
    }

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
        System.out.println("Numero de serie de moneda = "+moneda.getSerie());
        comprarProducto(moneda,numproducto,exp);
    }
    public void numProducto(int num){
        numproducto=num;
    }


    public void comprarProducto(Moneda m, int num, Expendedor exp){
        c=new Comprador(m,num,exp);
        producto=c.Prodcuto();
        if(producto!=null){
            mover();
            vuelto.entregarVuelto(c.cuantoVuelto()/100,"100");
            System.out.println("Numero de serie de bebida = "+producto.getSerie());
        }
        else{
            if(moneda.getValor()==100){
                vuelto.entregarVuelto(1,"100");
            }
            else if(moneda.getValor()==500){
                vuelto.entregarVuelto(1,"500");
            }
            else if(moneda.getValor()==1000){
                vuelto.entregarVuelto(1,"1000");
            }
        }
    }

    public Producto producto(){
        return producto;
    }
    public Comprador getComprador(){
        return c;
    }

    public void getVuelto(){
        vuelto.entregarVuelto(0,"");
    }
    public void getProducto(){
        pd.retirarProducto();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 125, 500, 10);
        g.fillRect(0, 250, 500, 10);
        g.fillRect(0, 375, 500, 10);
        g.fillRect(0, 500, 500, 10);
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 500, 20);
        g.fillRect(0,650,500,20);
        g.fillRect(0, 520, 500, 20);
        g.fillRect(0, 0, 20, 650);
        g.fillRect(220, 540, 20, 110);
        g.fillRect(480, 540, 20, 110);
    }

}