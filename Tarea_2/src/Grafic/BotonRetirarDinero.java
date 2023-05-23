package Grafic; /**
 *Clase que crea el boton para retirar el dinero
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarDinero extends JButton  {
    /**
     * se define un panel principal, un panel para retirar y un panel para pagar
     */
    private PanelPrincipal pp;
    private PanelRetirar rp;

    /**
     * el botonRetirarDinero sirve para retirar el dinero de el expendedor en caso de que se deba vuelto. Registra
     * la accion de clickear en este.
     * @param n es el nombre que dice el boton
     * @param pp es el panel principal que se ocupa
     * @param rp es el panel para retirar
     */
    public BotonRetirarDinero(String n, PanelPrincipal pp, PanelRetirar rp){
        super(n);
        this.rp=rp;
        this.pp = pp;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * escuchadorBoton escucha la accion de clickear en el boton, luego bloquea los botones y da un vuelto para poder
     * retirarlo.
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Bloquear();
            rp.nuevaCompra();
            pp.panelExpendedor().getVuelto();
            pp.repaint();
        }
    }

    /**
     * bloquear permite que un boton quede deshabilitado
     */
    public void Bloquear(){
        this.setEnabled(false);
    }
}