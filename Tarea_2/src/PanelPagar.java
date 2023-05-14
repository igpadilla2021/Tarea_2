import javax.swing.*;
import java.awt.*;

public class PanelPagar extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    public PanelPagar(PanelExpendedor exp, PanelRetirar rp){
        this.setLayout(new GridLayout(3,1));

        b1=new BotonPagar("$100", exp,1,rp,this);

        b1.setBackground(new Color(34,139,34));

        b2=new BotonPagar("$500", exp,2,rp,this);
        b2.setBackground(new Color(34,139,34));

        b3=new BotonPagar("$1000", exp,3,rp,this);
        b3.setBackground(new Color(34,139,34));

        this.add(b1);
        this.add(b2);
        this.add(b3);
    }
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
    }
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }
}
