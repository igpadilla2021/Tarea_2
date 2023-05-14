/**
 *Clase que crea el boton para retirar el producto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonRetirarProducto extends JButton  {
    /**
     * se define un expendedor, un panel para retirar y un panel para pagar
     */
    private PanelExpendedor exp;
    private PanelRetirar rp;
    private PanelPagar dp;
    /**
     * el botonRetirarProducto sirve para retirar el producto de el expendedor que ha sido comprado. Registra
     * la accion de clickear en este.
     * @param n es el nombre que dice el boton
     * @param exp es el expendedor que se ocupa
     * @param rp es el panel para retirar
     */
    public BotonRetirarProducto(String n, PanelExpendedor exp,PanelRetirar rp){
        super(n);
        this.rp=rp;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * "escucha" la accion de clickear en el boton y si esto se cumple, saca un producto del expendedor y bloquea estos
     * botones para no poder sacar mas.
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.getProducto();
            rp.nuevaCompra();
            Bloquear();
            exp.repaint();
        }
    }

    /**
     * bloquear deshabilita poder clickear un boton.
     */
    public void Bloquear(){
        this.setEnabled(false);
    }
}