/**
 *Clase que define el deposito de productos
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import Elementos.*;
import Tarea_1.*;

import javax.swing.*;
import java.awt.*;
public class DepProductos extends JPanel {
    private DepCoca coca;
    private DepSprite sprite;
    private DepSnickers snickers;
    private DepSuper8 super8;
    public DepProductos(){
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));

        coca=new DepCoca();
        coca.setBounds(0,0,1080,720);
        this.add(coca);

        sprite=new DepSprite();
        sprite.setBounds(0,0,1080,720);
        this.add(sprite,BorderLayout.CENTER);

        snickers=new DepSnickers();
        snickers.setBounds(0,0,1080,720);
        this.add(snickers,BorderLayout.CENTER);

        super8=new DepSuper8();
        super8.setBounds(0,0,1080,720);
        this.add(super8,BorderLayout.CENTER);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
    public void mover(int num){
        if(num==1){
            coca.moverProducto();
        }
        if(num==2){
            sprite.moverProducto();
        }
        if(num==3){
            snickers.moverProducto();
        }
        if(num==4){
            super8.moverProducto();
        }
    }
    public void retirarProducto(){
        coca.vaciarDeposito();
        sprite.vaciarDeposito();
        snickers.vaciarDeposito();
        super8.vaciarDeposito();
    }
    public void llenarDepostio(int num){
        if (num==1){
            coca.rellenarDeposito();
        }
        else if (num==2){
            sprite.rellenarDeposito();
        }
        else if (num==3){
            snickers.rellenarDeposito();
        }
        else if (num==4){
            super8.rellenarDeposito();
        }
    }
    public int cuantasQuedan(int num){
        if (num==1){
            return coca.cuantasQuedan();
        }
        else if (num==2){
            return sprite.cuantasQuedan();
        }
        else if (num==3){
            return snickers.cuantasQuedan();
        }
        else {
            return super8.cuantasQuedan();
        }
    }
}
