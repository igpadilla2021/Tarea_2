import javax.swing.*;
import java.awt.*;

public class PanelSelecionador extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    public PanelSelecionador(PanelExpendedor exp,PanelDinero dp){
        this.setLayout(new GridLayout(2,2));
        b1=new BotonSeleccionar("1", exp,1,dp);
        b2=new BotonSeleccionar("2", exp,2,dp);
        b3=new BotonSeleccionar("3", exp,3,dp);
        b4=new BotonSeleccionar("4", exp,4,dp);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
    }
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
    }
}
