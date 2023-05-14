import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarDinero extends JButton  {
    private PanelExpendedor exp;
    private PanelRetirar rp;
    private PanelPagar dp;
    public BotonRetirarDinero(String n, PanelExpendedor exp,PanelRetirar rp){
        super(n);
        this.rp=rp;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Bloquear();
            rp.nuevaCompra();
            exp.getVuelto();
            exp.repaint();
        }
    }
    public void Bloquear(){
        this.setEnabled(false);
    }
}