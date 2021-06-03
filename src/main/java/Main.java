import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pelicula> pelis = new ArrayList<>();
        pelis.add(new Pelicula("es", "34", "rr.hbtg..", 63, 134));
        pelis.add(new Pelicula("est", "34", "rr..hgd.", 63, 134));
        pelis.add(new Pelicula("esg", "344", "rr..hgd.", 63, 134));
        Ventana ventana = new Ventana();
        ventana.programa();
        ESPelicula.anyadirPelicula();
        ESPelicula.leerPeliculas(pelis);

    }
}