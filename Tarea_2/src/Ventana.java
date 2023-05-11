import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame{
    PanelPrincipal panel;
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