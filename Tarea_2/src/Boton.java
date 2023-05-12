import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Boton extends JButton  {
    private final PanelExpendedor exp;
    private int num;
    public Boton(String n, PanelExpendedor exp,int num){
        super(n);
        this.num=num;
        this.exp = exp;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            exp.mover(num);
            exp.repaint();
        }
    }
}
