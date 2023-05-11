import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelExpendedor exp;
    private PanelComprador com;
    public PanelPrincipal () {
        this.setLayout(new BorderLayout());
        exp = new PanelExpendedor();

        com=new PanelComprador();
        this.add(com,BorderLayout.CENTER);
    }

    public void paint (Graphics g) {
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}
