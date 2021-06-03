import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    PanelGeneros panelGeneros = new PanelGeneros();

    public void programa() {
        setLayout(new GridLayout(0, 3));
        this.add(panelGeneros.panelgen(), BorderLayout.WEST);
        this.add(PanelPeliculas.panelPelis(), BorderLayout.CENTER);
        this.add(PanelAcciones.panelAcciones());
        this.setTitle("VDCB");
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
