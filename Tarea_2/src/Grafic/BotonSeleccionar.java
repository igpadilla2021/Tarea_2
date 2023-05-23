package Grafic; /**
 *Clase que crea el boton para seleccionar el producto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonSeleccionar extends JButton  {
    /**
     * definimos un panel principal, un panel para pagar y un num que representa el producto a seleccionar
     */
    private PanelPrincipal pp;
    private PanelPagar dp;
    private PanelSeleccionador sp;
    private int num;

    /**
     * el metodo constructor define los paneles y un listener
     * @param n es un string que da el nombre del boton
     * @param pp es el panel principal
     * @param num es el numero que representa el producto asociado
     * @param dp es el PabelPagar a habilitar
     */
    public BotonSeleccionar(String n, PanelPrincipal pp, int num, PanelPagar dp, PanelSeleccionador sp){
        super(n);

        this.num=num;
        this.sp=sp;
        this.dp=dp;
        this.pp = pp;

        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * clase que define al escuchador de un boton
     */
    public class EscuchadorBotton implements ActionListener {
        /**
         * actionPerformed se encarga de registrar una accion hecha en el boton seleccionar, en este caso ae (action event)
         * @param ae parametro predeterminado para actionPerformed
         */
        public void actionPerformed(ActionEvent ae) {
            pp.panelExpendedor().numProducto(num);
            dp.Desbloquear();
            sp.Bloquear();
        }
    }
}
