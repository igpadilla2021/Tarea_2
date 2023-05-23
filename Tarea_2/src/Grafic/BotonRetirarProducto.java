package Grafic; /**
 *Clase que crea el boton para retirar el producto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarProducto extends JButton  {
    /**
     * se define un panel principal y un panel para retirar
     */
    private PanelPrincipal pp;
    private PanelRetirar rp;
    /**
     * el botonRetirarProducto sirve para retirar el producto de el expendedor que ha sido comprado. Registra
     * la accion de clickear en este.
     * @param n es el nombre que dice el boton
     * @param pp es el panel principal que se ocupa
     * @param rp es el panel para retirar
     */
    public BotonRetirarProducto(String n, PanelPrincipal pp, PanelRetirar rp){
        super(n);
        this.rp=rp;
        this.pp = pp;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * "escucha" la accion de clickear en el boton y si esto se cumple, saca un producto del expendedor y bloquea este
     * boton para no poder sacar mas.
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            pp.panelExpendedor().getProducto();
            rp.nuevaCompra();
            Bloquear();
            pp.repaint();
        }
    }

    /**
     * bloquear deshabilita poder clickear un boton.
     */
    public void Bloquear(){
        this.setEnabled(false);
    }
}