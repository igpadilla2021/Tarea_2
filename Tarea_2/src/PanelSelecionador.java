/**
 *Clase que crea el panel para selecionar productos
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

public class PanelSelecionador extends JPanel {
    /**
     * se definen 4 botones b1, b2, b3, b4
     */
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    /**
     * panelseleccionador es el panel para poder seleccionar entre los 4 botones
     * @param pp es el panel primncipal que se ocupa
     * @param dp es el panel para pagar
     */
    public PanelSelecionador(PanelPrincipal pp, PanelPagar dp){
        this.setLayout(new GridLayout(4,1,0,50));
        b1=new BotonSeleccionar("1", pp,1,dp,this);
        b2=new BotonSeleccionar("2", pp,2,dp,this);
        b3=new BotonSeleccionar("3", pp,3,dp,this);
        b4=new BotonSeleccionar("4", pp,4,dp,this);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }

    /**
     * bloquear inhabilita los botones b1, b2, b3, b4
     */
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
    }

    /**
     * desbloquear permite volver a ocupar los botones b1, b2, b3, b4
     */
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
    }
}
