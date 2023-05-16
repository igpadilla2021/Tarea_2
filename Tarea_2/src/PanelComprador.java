/**
 *Clase que crea el panel del comprador
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    /**
     * se definen paneles para seleccionar, pagar y retirar.
     */
    PanelSelecionador sp;
    PanelPagar dp;
    PanelRetirar rp;

    /**
     * clase que crea el panel para comprar, generando un panel para retirar, uno para pagar y uno para seleccionar
     */
    public PanelComprador(PanelPrincipal pp) {
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));

        rp=new PanelRetirar(pp);
        rp.setBounds(500,520,200,150);
        rp.Bloquear();
        this.add(rp);

        dp=new PanelPagar(pp,rp);
        dp.setBounds(800,50,150,550);
        dp.Bloquear();
        this.add(dp);

        sp=new PanelSelecionador(pp,dp);
        sp.setBounds(525,35,150,450);
        this.add(sp);

    }

    /**
     * paint se encarga de pintar los paneles que definimos arriba ademas de parte del diseño grafico del expendedor
     * @param g es el "pincel" que pinta
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.orange);
        g.fillRect(675, 0, 25, 500);
        g.setColor(Color.darkGray);
        g.fillRect(500, 0, 200, 35);
        g.fillRect(500, 110, 200, 50);
        g.fillRect(500, 235, 200, 50);
        g.fillRect(500, 360, 200, 50);
        g.fillRect(500, 485, 200, 35);
        g.fillRect(500, 0, 25, 500);
    }

    /**
     * desbloquear desbloquea el boton para seleccionar e iniciar un nuevo proceso de compra
     */
    public void Desbloquear(){
        sp.Desbloquear();
    }
}
