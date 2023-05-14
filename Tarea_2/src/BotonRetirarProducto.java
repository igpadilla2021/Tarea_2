import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarProducto extends JButton  {
    private PanelExpendedor exp;
    private PanelRetirar rp;
    private PanelPagar dp;
    public BotonRetirarProducto(String n, PanelExpendedor exp,PanelRetirar rp){
        super(n);
        this.rp=rp;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.getProducto();
            rp.nuevaCompra();
            Bloquear();
            exp.repaint();
        }
    }
    public void Bloquear(){
        this.setEnabled(false);
    }
}