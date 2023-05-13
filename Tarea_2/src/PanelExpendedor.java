import javax.swing.*;
import java.awt.*;
import Tarea_1.*;
public class PanelExpendedor extends JPanel {
    private DepProductos pd;
    private Expendedor exp;
    private Moneda moneda;
    private int numproducto;
    private Producto producto;

    public PanelExpendedor(){
        this.setLayout(null);
        exp=new Expendedor(24,600,900);

        pd=new DepProductos();
        pd.setBounds(0,0,700,720);
        this.add(pd);
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
        g.fillRect(0, 0, 20, 650);
    }
    public void mover(){
        pd.mover(numproducto);
    }
    public void Moneda(int num){
        if(num==1){
            moneda=new Moneda100();
            System.out.println(moneda.getValor());
            System.out.println(moneda.getSerie());
        }
        if(num==2){
            moneda=new Moneda500();
            System.out.println(moneda.getValor());
            System.out.println(moneda.getSerie());
        }
        if(num==3){
            moneda=new Moneda1000();
            System.out.println(moneda.getValor());
            System.out.println(moneda.getSerie());
        }
        comprarProducto(moneda,numproducto,exp);
    }
    public void numProducto(int num){
        numproducto=num;
    }
    public void comprarProducto(Moneda m, int num, Expendedor exp){
        Comprador c=new Comprador(m,num,exp);
        producto=c.getDatos();
    }
    public Producto Producto(){
        return producto;
    }
    public void getProducto(){
        pd.retirarProducto();
    }
}