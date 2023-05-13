import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarProducto extends JButton  {
    private PanelExpendedor exp;
    private PanelDinero dp;
    public BotonRetirarProducto(String n, PanelExpendedor exp, PanelDinero dp){
        super(n);
        this.dp=dp;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.getProducto();
            exp.repaint();
        }
    }
}