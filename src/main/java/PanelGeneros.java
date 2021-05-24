import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelGeneros {
    private static JPanel panel;
    private static JButton[] botones;
    public static JPanel panelgen() {
        panel = new JPanel(new GridLayout(0, 1));
        botones = new JButton[Generos.values().length];

        for (Generos g : Generos.values()) {
            int contador = 0;
            botones[contador] = new JButton(g.getGenero());
            panel.add(botones[contador]);
            botones[contador++].addActionListener(e -> accion());
        }
        return panel;
    }

    private static void accion() {

    }
}