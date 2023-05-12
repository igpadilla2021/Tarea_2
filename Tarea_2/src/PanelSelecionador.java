import javax.swing.*;
import java.awt.*;

public class PanelSelecionador extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    PanelSelecionador(PanelExpendedor exp){

        this.setLayout(new GridLayout(2,2));
        b1=new Boton("1", exp,1);
        b2=new Boton("2", exp,2);
        b3=new Boton("3", exp,3);
        b4=new Boton("4", exp,4);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }
}
