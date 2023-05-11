import javax.swing.*;
import java.awt.*;
public class PanelExpendedor extends JPanel {
    private Triangulo tr;
    public PanelExpendedor(){
        this.setLayout(new BorderLayout());
        tr=new Triangulo(100,100);
        this.add(tr,BorderLayout.CENTER);
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(new Color(0,0,0,0));
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 500, 20);
        g.fillRect(0,650,500,20);
        g.fillRect(0, 0, 20, 650);
        g.fillRect(500, 0, 200, 150);
        g.fillRect(500, 350, 200, 320);

    }
}
