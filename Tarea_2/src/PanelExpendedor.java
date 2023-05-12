import javax.swing.*;
import java.awt.*;
public class PanelExpendedor extends JPanel {
    private DepProductos pd;
    private ExpGraf exg;

    public PanelExpendedor(){
        this.setLayout(null);

        exg=new ExpGraf();
        exg.setBounds(0,0,700,720);
        this.add(exg);

        pd=new DepProductos();
        pd.setBounds(0,0,700,720);
        this.add(pd);

    }
    public void paint(Graphics g) {
        super.paint(g);
    }
    public void mover(int num){
        pd.mover(num);
    }
}
