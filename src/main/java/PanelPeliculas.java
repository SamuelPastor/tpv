//import com.sun.tools.javac.jvm.Gen;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PanelPeliculas {
    public static JPanel panelPeliculas = new JPanel();
    private static JPanel panelGeneros;
    public static JButton[] botonesPeliculas;
    private static JButton[] botonesGeneros;
    private static Map<Pelicula, JButton> pelisBotones = new HashMap<>();

    public static JPanel panelPelis() {
        mostrarPeliculas();
        return panelPeliculas;
    }



   public static void mostrarPeliculas() {
       if (botonesPeliculas != null) {
           for (JButton b : botonesPeliculas) {
               b.setVisible(false);
               b.setEnabled(false);
           }
       }
        ESPelicula.leerPeliculas();
        int contador = 0;
        botonesPeliculas = new JButton[ESPelicula.getListaPeliculas().size()];

        for (Pelicula p : ESPelicula.getListaPeliculas()) {
            Image imagen = p.getImagen().getImage().getScaledInstance(90, 122, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(imagen);
            botonesPeliculas[contador] = new JButton(imageIcon);
            botonesPeliculas[contador].setPreferredSize(new Dimension(90, 122));
            panelPeliculas.add(botonesPeliculas[contador]);
            pelisBotones.put(p, botonesPeliculas[contador]);
            botonesPeliculas[contador].addActionListener(e-> {
                PanelAcciones.setTitulo(p.getTitulo());
                PanelAcciones.setPrecioAlquiler(p.getPrecioAlquiler());
                PanelAcciones.setPrecioCompra(p.getPrecioCompra());
                PanelAcciones.getBotonAlquilar().setText("Alquilar (" + p.getPrecioAlquiler() + "€)");
                PanelAcciones.getBotonComprar().setText("Comprar (" + p.getPrecioCompra() + "€)");
                PanelAcciones.getImagen().setIcon(imageIcon);
            });
            contador++;
        }
    }

    public static JPanel panelgeneros() {
        panelGeneros = new JPanel(new GridLayout(0, 1, 5 ,5));
        botonesGeneros = new JButton[Generos.values().length];

        for (int i = 0; i < botonesGeneros.length; i++) {
            botonesGeneros[i] = new JButton(Generos.values()[i].getGenero());
            panelGeneros.add(botonesGeneros[i]);
            botonesGeneros[i].addActionListener( e-> {
                Iterator<Map.Entry<Pelicula, JButton>> it = pelisBotones.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry<Pelicula, JButton> entrada = it.next();
                    if (entrada.getKey().getGenero().equals(e.getActionCommand())) {
                        entrada.getValue().setVisible(true);
                    } else {
                        entrada.getValue().setVisible(false);
                    }
                    if (e.getActionCommand().equals("Todos")) {
                        entrada.getValue().setVisible(true);
                    }
                }
            });
        }
        return panelGeneros;
    }

    public static Map<Pelicula, JButton> getPelisBotones() {
        return pelisBotones;
    }
}
