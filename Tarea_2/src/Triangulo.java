import geometricas.Angular;
import javax.swing.*;
import java.awt.*;
public class Triangulo extends JPanel {
    private Polygon p;
    private int x;
    private int y;
    public Triangulo(int x, int y){
        this.setSize(700,700);
        this.setBackground(new Color(0,0,0,0));
        this.x=x;
        this.y=y;
        p = new Polygon();
        Point centro = new Point(x,y);
        p.addPoint(Angular.generaPunto(centro, 100, 1).x,Angular.generaPunto(centro, 100, 1).y);
        p.addPoint(Angular.generaPunto(centro, 100, 2).x,Angular.generaPunto(centro, 100, 2).y);
        p.addPoint(Angular.generaPunto(centro, 100.0, 0.5).x,Angular.generaPunto(centro, 100.0, 0.5).y);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillPolygon(p);
    }
}