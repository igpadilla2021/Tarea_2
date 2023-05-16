/**
 *Clase que crea el panel para retirar
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

public class PanelRetirar extends JPanel {
    /**
     * se definen 2 botones b1 y b2, ademas de un int extracciony un panel principal
     */
    private JButton b1;
    private JButton b2;
    private int extraccion;
    private PanelPrincipal pp;

    /**
     * se genera un panel para poder retirar los productos. Se crean los botones b1 y b2 con el texto que usan y sus
     * colores.
     * @param pp es el panel principal
     */
    public PanelRetirar(PanelPrincipal pp){
        extraccion=0;
        this.pp=pp;

        this.setLayout(new GridLayout(2,1));

        b1=new BotonRetirarProducto("Retirar Producto", pp,this);
        b1.setForeground(Color.red);
        this.add(b1);

        b2=new BotonRetirarDinero("retirar Dinero",pp,this);
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
     * nuevacompra registra la compra de productos, y en el caso de que se haga esto, se desbloquea el panel seleccionar
     */
    public void nuevaCompra(){
        extraccion=extraccion+1;
        if(extraccion==2){
            pp.panelComprador().Desbloquear();
            extraccion=0;
            pp.panelExpendedor().reset();
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

