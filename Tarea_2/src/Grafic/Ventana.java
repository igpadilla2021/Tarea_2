package Grafic; /**
 *Clase que crea la ventana
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import Grafic.PanelPrincipal;

import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame{
    /**
     * se define a un panel principal como panel
     */
    PanelPrincipal panel;

    /**
     * se genera la ventana que se ocupa para el programa. Esta tiene el nombre "Expendedor", permite ser cerrada con
     * la x y tiene un tamaño de 1080x720
     */
    public Ventana() {
        super();
        this.setTitle("Expendedor");
        this.setLayout(new BorderLayout());

        panel=new PanelPrincipal();
        this.add(panel,BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setVisible(true);
    }
}