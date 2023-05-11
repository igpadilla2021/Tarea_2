import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    PanelSelecionador np;
    public PanelComprador() {
        this.setLayout(null);
        np=new PanelSelecionador();
        np.setBounds(500,150,200,200);
        this.add(np);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
}
