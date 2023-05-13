import javax.swing.*;
import java.awt.*;

public class PanelRetirar extends JPanel {
    private JButton b1;
    private JButton b2;

    public PanelRetirar(PanelExpendedor exp, PanelDinero dp){
        this.setLayout(new GridLayout(2,1));
        b1=new BotonRetirarProducto("Retirar Producto", exp,dp);
        b1.setForeground(Color.red);
        this.add(b1);
        b2=new JButton("Retirar Vuelto");
        b2.setForeground(Color.red);
        this.add(b2);
    }
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
    }
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
    }
}

