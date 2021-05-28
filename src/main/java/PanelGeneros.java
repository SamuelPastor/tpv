import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelGeneros implements DocumentListener{
    private static JPanel panel;
    private static JButton[] botones;
    JLabel label;
    JTextField textField;

    public  JPanel panelgen() {
        //GridLayout layout = new GridLayout(0, 1);
        panel = new JPanel(new GridLayout(0, 1, 5 ,5));
        botones = new JButton[Generos.values().length];

        textField = new JTextField("");
        panel.add(textField);
        label = new JLabel();
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
        label.setText(textField.getText());
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        label.setText(textField.getText());
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {

    }
}