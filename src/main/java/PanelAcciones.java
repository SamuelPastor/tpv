import javax.swing.*;

public class PanelAcciones {
    private static JPanel panel = new JPanel();

    public static JPanel panelAcciones() {
        JButton boton = new JButton("bfgt");
        panel.add(boton);
        return panel;
    }
}
