import javax.swing.*;

public class PanelPeliculas {
    private static JPanel panel = new JPanel();

    public static JPanel panelPelis() {
        Icon icon = new ImageIcon("aaa");
        JButton boton = new JButton();
        panel.add(boton);

        return panel;
    }
}
