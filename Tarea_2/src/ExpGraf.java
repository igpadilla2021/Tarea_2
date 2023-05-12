import javax.swing.*;
import java.awt.*;

public class ExpGraf extends JPanel {
    public ExpGraf(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0,0,0,0));
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 500, 20);
        g.fillRect(0,650,500,20);
        g.fillRect(0, 0, 20, 650);
    }
}
