package Grafic; /**
 *Clase que crea el boton para pagar
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BotonPagar extends JButton {

    /**
     * definimos un panel principal, un panel para pagar, un panel para retirar y un num que representa el dinero
     */
    private PanelPrincipal pp;
    private PanelPagar dp;
    private PanelRetirar rp;
    private int num;

    /**
     * el metodo constructor define los paneles y un listener
     * @param n es un string que da el nombre del boton
     * @param pp es el panel principal
     * @param num es el numero que representa la moneda asociada
     * @param rp es el panelRetirar a habilitiar o inhabilitar
     * @param dp es el PabelPagar a inhabilitar
     */
    public BotonPagar(String n, PanelPrincipal pp, int num, PanelRetirar rp, PanelPagar dp){
        super(n);

        this.rp=rp;
        this.dp=dp;
        this.num=num;
        this.pp=pp;

        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * clase que define al escuchador de un boton
     */
    public class EscuchadorBotton implements ActionListener {
        /**
         * actionPerformed se encarga de registrar una accion hecha en el boton pagar, en este caso ae (action event)
         * @param ae parametro predeterminado para actionPerformed
         */
        public void actionPerformed(ActionEvent ae) {
            pp.panelExpendedor().Moneda(num);
            dp.Bloquear();
            rp.Desbloquear();
            if(pp.panelExpendedor().producto()==null) {
                rp.faltaDinero();
            }
            if(pp.panelExpendedor().getComprador().cuantoVuelto()==0){
                rp.dineroJusto();
            }
            pp.repaint();
        }
    }
}
