package Elementos;

import javax.swing.*;
import java.awt.*;

public class DepVuelto extends JPanel {
    /**
     * definimos nuestras coordenadas int x e int y para crear el for que se encarga de administrar monedas en el
     * expendedor, cant es la cantidad de monedas a graficar, color que esta asociado al color de la moneda, y valor
     * asociado al valor de la moneda.
     */
    private int x;
    private int y;
    private int cant=0;
    private int color;
    private String valor;

    /**
     * el metodo constructor crea los objetos visibles dentro del expendedor que representan a la cocacola y define x e y
     */
    public DepVuelto(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));

        this.x=270;
        this.y=570;
    }

    /**
     * paint se encarga de pintar el panel expendedor, el diseño y posicion grafica de las monedas y ademas el
     * valor de estas mismas
     * @param g es el "pincel" que pinta el panel
     */
    public void paint(Graphics g) {
        super.paint(g);
        for(int c=0;c<cant;c=c+1){
            if(color==1){
                g.setColor(Color.YELLOW);
            }
            if(color==2){
                g.setColor(new Color(255,99,71));
            }
            if(color==3){
                g.setColor(new Color(205,1,70));
            }
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
     * entregarVuelto se encarga de definir la cantidad de monedas a graficar ademas de el color y valor de estas mismas
     */
    public void entregarVuelto(int c, String valor,int color){
        this.valor=valor;
        cant=c;
        this.color=color;
    }
}
