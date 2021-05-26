import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    PanelGeneros panelGeneros = new PanelGeneros();

    public void programa() {
        this.add(panelGeneros.panelgen(), BorderLayout.WEST);
        this.setTitle("VDCB");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
