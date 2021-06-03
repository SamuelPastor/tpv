import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ImageIcon imagen = new ImageIcon("imagenes/elpadrino.jpg");
        Ventana ventana = new Ventana();
        ventana.programa();
        ESPelicula.anyadirPelicula(new Pelicula("El Padrino", "120", "...", 6, 24, imagen));
        //ESPelicula.leerPeliculas();

    }
}