/**
 *Clase que crea el panel para pagar
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

public class PanelPagar extends JPanel {
    /**
     * se definen 3 botones b1, b2, b3
     */
    private JButton b1;
    private JButton b2;
    private JButton b3;

    /**
     * crea el panel para poder pagar, tomando los botones definidos anteriormente para seleccionar el dinero que se
     * quiere ocupar
     * @param exp es el expendedor
     * @param rp es el panel para retirar
     */
    public PanelPagar(PanelExpendedor exp, PanelRetirar rp){
        this.setLayout(new GridLayout(3,1,0,50));

        b1=new BotonPagar("$100", exp,1,rp,this);
        b1.setBackground(Color.yellow);

        b2=new BotonPagar("$500", exp,2,rp,this);
        b2.setBackground(new Color(255,99,71));

        b3=new BotonPagar("$1000", exp,3,rp,this);
        b3.setBackground(new Color(205,1,70));

        this.add(b1);
        this.add(b2);
        this.add(b3);
    }

    /**
     * Bloquear bloquea los botones b1, b2, b3
     */
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
    }

    /**
     * Desbloquear desbloquea los botones b1, b2, b3
     */
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }
}
