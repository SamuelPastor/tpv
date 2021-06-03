import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //new Pelicula("est", "34", "rr..hgd.", 63, 134);
        //new Pelicula("esg", "344", "rr..hgd.", 63, 134);
        Ventana ventana = new Ventana();
        ventana.programa();
        ESPelicula.anyadirPelicula(new Pelicula("estad", "34", "rr.hbtffg..", 63, 134));
        //ESPelicula.leerPeliculas();

    }
}