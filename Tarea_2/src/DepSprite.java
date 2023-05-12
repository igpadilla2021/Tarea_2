import javax.swing.*;
import java.awt.*;

public class DepSprite extends JPanel {
    private int x;
    private int y;
    private int cant=24;
    public DepSprite(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));
        this.x=50;
        this.y=175;
    }
    public void paint(Graphics g){
        super.paint(g);
        for(int c=0;c<cant;c=c+1){
            g.setColor(new Color(32,178,170));
            g.fillRect(x,y,50,75);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,50,75);
            this.x=x+10;
        }
        x=50;
    }
    public void moverProducto(){
        cant=cant-1;
        this.x=50;
    }
}