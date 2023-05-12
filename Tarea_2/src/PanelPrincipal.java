import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelExpendedor exp;
    private PanelComprador com;
    public PanelPrincipal () {
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));
        exp = new PanelExpendedor();

        com=new PanelComprador(exp);
        com.setBounds(0,0,1080,720);
        this.add(com);

        exp.setBounds(0,0,500,720);
        this.add(exp);

    }
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.darkGray);
        g.fillRect(500, 0, 200, 150);
        g.fillRect(500, 350, 200, 320);
    }
}
