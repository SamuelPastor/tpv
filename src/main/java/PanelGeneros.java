import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelGeneros implements DocumentListener{
    private static JPanel panel;
    private static JButton[] botones;


    public  JPanel panelgen() {
        GridLayout layout = new GridLayout(0, 1);
        panel = new JPanel(layout);
        botones = new JButton[Generos.values().length];
        //layout.setHgap(10);
        layout.setVgap(10);
        JTextField textField = new JTextField("gfr");
        panel.add(textField);
        JLabel label = new JLabel();
        panel.add(label);
        textField.getDocument().addDocumentListener(this);


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

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        System.out.println("Texto insertado");
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {

    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {

    }
}