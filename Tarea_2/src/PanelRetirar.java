/**
 *Clase que crea el panel para retirar
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

public class PanelRetirar extends JPanel {
    /**
     * se definen 2 botones b1 y b2, ade,as de un int extraccion y un panel comprador
     */
    private JButton b1;
    private JButton b2;
    private int extraccion;
    private PanelComprador pc;

    /**
     * se genera un panel para poder retirar los productos. Se crean los botones b1 y b2 con el texto que usan y sus
     * colores.
     * @param exp es el expendedor que ocupamos
     * @param pc es el panel comprador
     */
    public PanelRetirar(PanelExpendedor exp, PanelComprador pc){
        extraccion=0;
        this.pc=pc;

        this.setLayout(new GridLayout(2,1));

        b1=new BotonRetirarProducto("Retirar Producto", exp, this);
        b1.setForeground(Color.red);
        this.add(b1);

        b2=new BotonRetirarDinero("retirar Dinero",exp, this);
        b2.setForeground(Color.red);
        this.add(b2);
    }

    /**
     * bloquear inhabilita el uso de los botones b1 y b2
     */
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
    }

    /**
     * desbloquear permite ocupar denuevo los botones b1 y b2
     */
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
    }

    /**
     * nuevacompra registra la compra de productos, y en el caso de que se haga esto, se bloquea el panel comprador
     */
    public void nuevaCompra(){
        extraccion=extraccion+1;
        if(extraccion==2){
            pc.Desbloquear();
            extraccion=0;
        }
    }

    /**
     * en caso de que falte dinero, el boton b1 queda bloqueado
     */
    public void faltaDinero(){
        b1.setEnabled(false);
        nuevaCompra();
    }

    /**
     * en caso de que el dinero sea justo, el boton b2 queda bloqueado
     */
    public void dineroJusto(){
        b2.setEnabled(false);
        nuevaCompra();
    }
}

