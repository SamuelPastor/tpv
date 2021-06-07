import javax.swing.*;
import java.io.File;

public class AnyadirPelicula {

    private static String titulo;
    private static String duracion;
    private static int precioAlquiler;
    private static int precioCompra;
    private static String imagen;
    private static Generos genero;

    public static void nuevaPeli() {
        titulo = JOptionPane.showInputDialog("Título");
        duracion = JOptionPane.showInputDialog("Duración (En minutos)");
        precioAlquiler = Integer.parseInt(JOptionPane.showInputDialog("Precio de alquiler"));
        precioCompra = Integer.parseInt(JOptionPane.showInputDialog("Precio de compra"));
        imagen = seleccion();
        Object eleccion = JOptionPane.showInputDialog(null,
                "Selecciona el genero",
                "Genero",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Generos.values(),
                Generos.values()[0]);
        genero = (Generos)eleccion;

        Pelicula pelicula = new Pelicula(titulo, duracion, precioAlquiler, precioCompra, imagen, genero);
        ESPelicula.anyadirPelicula(pelicula);
        PanelPeliculas.mostrarPeliculas();
    }

    public static String seleccion() {

        JFileChooser fc = new JFileChooser("imagenes");
        fc.setDialogTitle("Portada");
        fc.showOpenDialog(null);
        ImageIcon fichero = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
        //System.out.println(fc.getSelectedFile().getPath());
        return fc.getSelectedFile().getPath();
    }
}
