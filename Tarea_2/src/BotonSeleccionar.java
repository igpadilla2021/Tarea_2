/**
 *Clase que crea el boton para seleccionar el producto
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class BotonSeleccionar extends JButton  {
    private PanelExpendedor exp;
    private PanelPagar dp;
    private PanelSelecionador sp;
    private int num;
    public BotonSeleccionar(String n, PanelExpendedor exp, int num, PanelPagar dp, PanelSelecionador sp){
        super(n);
        this.num=num;
        this.sp=sp;
        this.dp=dp;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.numProducto(num);
            dp.Desbloquear();
            sp.Bloquear();
        }
    }
}
