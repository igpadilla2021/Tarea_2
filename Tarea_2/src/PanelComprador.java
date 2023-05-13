import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    PanelSelecionador sp;
    PanelDinero dp;
    PanelRetirar rp;
    public PanelComprador(PanelExpendedor exp) {
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));

        dp=new PanelDinero(exp);
        dp.setBounds(800,125,200,400);
        dp.Bloquear();
        this.add(dp);

        sp=new PanelSelecionador(exp,dp);
        sp.setBounds(500,100,200,200);
        this.add(sp);

        rp=new PanelRetirar(exp,dp);
        rp.setBounds(500,350,200,200);
        this.add(rp);
    }
    public void paint(Graphics g) {
        super.paint(g);
        /**g.setColor(Color.darkGray);
        g.fillRect(500, 0, 200, 150);
        g.fillRect(500, 350, 200, 320);*/
    }
}
