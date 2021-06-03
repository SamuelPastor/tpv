import javax.swing.*;
import java.awt.*;

public class PanelPeliculas {
    private static JPanel panel = new JPanel();
    private static JButton[] botones = new JButton[/*ESPelicula.getListaPeliculas().size()*/ 2];
    public static JPanel panelPelis() {
        ESPelicula.leerPeliculas();
        int contador = 0;
        for (Pelicula p : ESPelicula.getListaPeliculas()) {
            Image imagen = p.getImagen().getImage().getScaledInstance(90, 122, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(imagen);
            botones[contador] = new JButton(imageIcon);
            panel.add(botones[contador]);
            contador++;
            System.out.println(p.getTitulo());

        }
        /*Icon icon = new ImageIcon("imagenes/elpadrino.jpg");
        ImageIcon imageIcon = new ImageIcon("imagenes/elpadrino.jpg");

        Image imagen = imageIcon.getImage();
        Image escalada = imagen.getScaledInstance(90, 122,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(escalada);
        JButton boton = new JButton(imageIcon);

        boton.setPreferredSize(new Dimension(100, 133));
        panel.add(boton);*/

        return panel;
    }
}
