import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ventana ventana = new Ventana();
        ventana.programa();
        ESPelicula.anyadirPeli();
        ESPelicula.leerPeli();
    }
}