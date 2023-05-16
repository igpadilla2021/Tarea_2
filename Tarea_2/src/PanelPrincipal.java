/**
 *Clase que crea el panel principal
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import Tarea_1.Expendedor;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    /**
     * se define un expendedor y un panel para comprar
     */
    private PanelExpendedor exp;
    private PanelComprador com;

    /**
     * el metodo constructor de esta clase crea el panel principal de nuestro expendedor, generando la ventana en la que
     * esta el expendedor.
     */
    public PanelPrincipal () {
        this.setLayout(null);

        com=new PanelComprador(this);
        com.setBounds(0,0,1080,720);
        this.add(com);

        exp = new PanelExpendedor(this);
        exp.setBounds(0,0,500,720);
        this.add(exp);
    }
    /**
     * define un PanelComprador
     * @return retorna un PanelComprador com
     */
    public PanelComprador panelComprador(){
        return com;
    }

    /**
     * define un PanelExpendedor
     * @return retorna un PanelExpendedor exp
     */
    public PanelExpendedor panelExpendedor(){
        return exp;
    }

    /**
     * paint pinta el panel
     * @param g es el "pincel" que pinta el panel
     */
    public void paint (Graphics g) {
        super.paint(g);
        com.repaint();
        exp.repaint();
    }
}
