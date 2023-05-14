package Elementos;

import javax.swing.*;
import java.awt.*;

public class DepVuelto extends JPanel {
    private int x;
    private int y;
    private int cant=0;
    private int caso=0;
    private String valor;
    public DepVuelto(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));

        this.x=270;
        this.y=570;
    }
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
    public void entregarVuelto(int c, String valor){
        this.valor=valor;
        cant=c;
    }
}
