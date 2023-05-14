/**
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
     * definimos un panel expendedor, un panel para pagar, un panel para retirar y un num que representa el dinero
     */
    private PanelExpendedor exp;
    private PanelPagar dp;
    private PanelRetirar rp;
    private int num;

    /**
     * el metodo constructor define los paneles y un listener
     * @param n es un string que da el nombre del boton
     * @param exp es el panel expendedor
     * @param num es el numero que representa la moneda asociada
     * @param rp es el panelRetirar a habilitiar o inhabilitar
     * @param dp es el PabelPagar a inhabilitar
     */
    public BotonPagar(String n, PanelExpendedor exp, int num, PanelRetirar rp, PanelPagar dp){
        super(n);
        this.rp=rp;
        this.dp=dp;
        this.num=num;
        this.exp=exp;

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
