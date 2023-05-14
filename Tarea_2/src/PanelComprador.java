import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    PanelSelecionador sp;
    PanelPagar dp;
    PanelRetirar rp;
    public PanelComprador(PanelExpendedor exp) {
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));

        rp=new PanelRetirar(exp,this);
        rp.setBounds(500,520,200,150);
        rp.Bloquear();
        this.add(rp);

        dp=new PanelPagar(exp,rp);
        dp.setBounds(800,125,200,400);
        dp.Bloquear();
        this.add(dp);

        sp=new PanelSelecionador(exp,dp);
        sp.setBounds(525,35,150,450);
        this.add(sp);

        /**JLabel l1=new JLabel("sus");
        l1.setBounds(800,10,100,100);
        this.add(l1);*/


    }
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
    public void Desbloquear(){
        sp.Desbloquear();
    }
}
