import javax.swing.*;
import java.awt.*;

public class PanelRetirar extends JPanel {
    private JButton b1;
    private JButton b2;
    private int extraccion;
    private PanelComprador pc;

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
    public void Bloquear(){
        b1.setEnabled(false);
        b2.setEnabled(false);
    }
    public void Desbloquear(){
        b1.setEnabled(true);
        b2.setEnabled(true);
    }
    public void nuevaCompra(){
        extraccion=extraccion+1;
        if(extraccion==2){
            pc.Desbloquear();
            extraccion=0;
        }
    }
    public void faltaDinero(){
        b1.setEnabled(false);
        nuevaCompra();
    }
    public void dineroJusto(){
        b2.setEnabled(false);
        nuevaCompra();
    }
}

