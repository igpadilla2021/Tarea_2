/**
 *Clase que define al deposito de snickers
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
package Elementos;

import javax.swing.*;
import java.awt.*;

public class DepSnickers extends JPanel {
    /**
     * definimos nuestras coordenadas int x e int y para crear el boton que se encarga de administrar snickers en el
     * expendedor. p se encarga de mover el producto del deposito al lugar para retirarlo y viceversa y cant maneja
     * la cantidad de producto que hay actualmente.
     */
    private int x;
    private int y;
    private int p=0;
    private int cant=24;
    /**
     * el metodo constructor crea los objetos visibles dentro del expendedor que representan a los snickers
     */
    public DepSnickers(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));
        this.x=50;
        this.y=300;
    }
    /**
     * paint se encarga de pintar el deposito de snickers, haciendo un ciclo for y pintando cada snickers uno por uno
     * si es que p es 1, se "pinta" un snickers en el lugar para retirar los productos.
     * @param g es definido como el "pincel" que pinta en este caso.
     */
    public void paint(Graphics g){
        super.paint(g);
        for(int c=0;c<cant;c=c+1){
            g.setColor(new Color(139,69,19));
            g.fillRect(x,y,70,75);
            g.setColor(Color.BLACK);
            g.drawString("SNICKERS",x+5,y+40);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,70,75);
            this.x=x+10;
        }
        if(p==1){
            g.setColor(new Color(139,69,19));
            g.fillRect(75,570,75,50);
            g.setColor(Color.BLACK);
            g.drawString("SNICKERS",85,595);
            g.drawRect(75,570,75,50);
        }
        x=50;
    }
    /**
     * moverProducto se encarga de mover el producto (snickers) a el lugar para retirar.
     */
    public void moverProducto(){
        cant=cant-1;
        this.x=50;
        p=1;
    }
    /**
     * vaciarDeposito se encarga de "sacar" el producto de el lugar para retirar.
     */
    public void vaciarDeposito(){
        p=0;
    }
}