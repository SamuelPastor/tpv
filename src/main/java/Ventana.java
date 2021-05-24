import javax.swing.*;

public class Ventana extends JFrame {

    public void programa() {
        this.add(PanelGeneros.panelgen());

        this.setTitle("VDCB");
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
