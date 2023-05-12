import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    PanelSelecionador sp;
    public PanelComprador(PanelExpendedor exp) {
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));

        sp=new PanelSelecionador(exp);
        sp.setBounds(500,150,200,200);
        this.add(sp);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
}
