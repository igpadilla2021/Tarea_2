/**
 *Clase que define al deposito de vuelto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
package Elementos;

import javax.swing.*;
import java.awt.*;

public class DepVuelto extends JPanel {
    /**
     * definimos nuestras coordenadas int x e int y para crear el boton que se encarga de administrar el vuelto en el
     * expendedor. cant maneja la cantidad de vuelto que se debe dar, valor maneja el valor del vuelto.
     */
    private int x;
    private int y;
    private int cant=0;
    private int caso=0;
    private String valor;
    /**
     * el metodo constructor crea los objetos visibles dentro del expendedor que representa el vuelto
     */
    public DepVuelto(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));

        this.x=270;
        this.y=570;
    }
    /**
     * paint se encarga de pintar el deposito de vuelto, haciendo un ciclo for para pintar las monedas con sus
     * respectivos valores.
     * @param g es definido como el "pincel" que pinta en este caso.
     */
    public void paint(Graphics g) {
        super.paint(g);
        for(int c=0;c<cant;c=c+1){
            g.setColor(Color.YELLOW);
            g.fillOval(x,y,30,30);
            g.setColor(Color.BLACK);
            g.drawOval(x,y,30,30);
            g.drawString(valor,x+3,y+18);
            this.x=x+25;
            if(c==7){
                y=y+30;
                x=270;
            }
        }
        x=270;
        y=570;
    }

    /**
     * entregarVuelto se encarga de definir la cantidad y el valor del vuelto que se requiere
     * @param c es la cantidad de vuelto
     * @param valor es el valor del vuelto
     */
    public void entregarVuelto(int c, String valor){
        this.valor=valor;
        cant=c;
    }
}
