import javax.swing.*;
import java.awt.*;

public class PanelSelecionador extends JPanel {
    private JButton b1=new JButton("1");
    private JButton b2=new JButton("2");
    private JButton b3=new JButton("3");
    private JButton b4=new JButton("4");
    PanelSelecionador(){
        this.setLayout(new GridLayout(2,2));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }
}
