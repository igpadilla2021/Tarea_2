import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonPagar extends JButton  {
    private PanelExpendedor exp;
    private PanelPagar dp;
    private PanelRetirar rp;
    private int num;
    public BotonPagar(String n, PanelExpendedor exp, int num, PanelRetirar rp, PanelPagar dp){
        super(n);
        this.rp=rp;
        this.dp=dp;
        this.num=num;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.Moneda(num);
            dp.Bloquear();
            rp.Desbloquear();
            if(exp.producto()==null) {
                rp.faltaDinero();
            }
            if(exp.getComprador().cuantoVuelto()==0){
                rp.dineroJusto();
            }
            exp.repaint();
        }
    }
}
