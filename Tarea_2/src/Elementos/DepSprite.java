/**
 *Clase que define al deposito de sprite
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
package Elementos;

import javax.swing.*;
import java.awt.*;

public class DepSprite extends JPanel {
    /**
     * definimos nuestras coordenadas int x e int y para crear el for que se encarga de administrar sprite en el
     * expendedor. p se encarga de mover el producto del deposito al lugar para retirarlo y viceversa y cant maneja
     * la cantidad de producto que hay actualmente.
     */
    private int x;
    private int y;
    private int p=0;
    private int cant=24;
    /**
     * el metodo constructor crea los objetos visibles dentro del expendedor que representan a las sprites y define x e y
     */
    public DepSprite(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));
        this.x=50;
        this.y=175;
    }
    /**
     * paint se encarga de pintar el deposito de snickers, haciendo un ciclo for y pintando cada sprite una por una
     * si es que p es 1, se "pinta" una sprite en el lugar para retirar los productos.
     * @param g es definido como el "pincel" que pinta en este caso.
     */
    public void paint(Graphics g){
        super.paint(g);
        for(int c=0;c<cant;c=c+1){
            g.setColor(new Color(32,178,170));
            g.fillRect(x,y,50,75);
            g.setColor(Color.BLACK);
            g.drawString("SPRITE",x+5,y+40);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,50,75);
            this.x=x+10;
        }
        if(p==1){
            g.setColor(new Color(32,178,170));
            g.fillRect(75,570,75,50);
            g.setColor(Color.BLACK);
            g.drawString("SPRITE",85,595);
            g.drawRect(75,570,75,50);
        }
        x=50;
    }
    /**
     * moverProducto se encarga de mover el producto (sprite) a el lugar para retirar, cambiando el valor de p y
     *      * reduciendo la cantidad de productos cant.
     */
    public void moverProducto(){
        cant=cant-1;
        this.x=50;
        p=1;
    }

    /**
     * vaciarDeposito se encarga de "sacar" el producto de el lugar para retirar cambiando el valor de p.
     */
    public void vaciarDeposito(){
        p=0;
    }

    /**
     * rellenarDeposito se encarga de rellenar el deposito cambiando el valor de cant
     */
    public void rellenarDeposito(){
        cant=24;
    }

    /**
     * define un entero
     * @return retorna la cantidad de productos en el depostio cant
     */
    public int cuantasQuedan(){
        return cant;
    }
}