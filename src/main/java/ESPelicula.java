import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ESPelicula {

    private static List<Pelicula> listaPeliculas = new ArrayList<>();

    public static void anyadirPelicula() {
        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream("pelculas.tpv"));
            for (Pelicula p : listaPeliculas) {
                oos.writeObject(p);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Pelicula> leerPeliculas(List<Pelicula> lista) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("pelculas.tpv"));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof Pelicula) {
                    //System.out.println(aux);
                    lista.add((Pelicula) aux);
                    aux = ois.readObject();
                }
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }
}