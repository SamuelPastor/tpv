import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ESPelicula {

    private static Set<Pelicula> listaPeliculas = new HashSet<>();

    public static void anyadirPelicula(Pelicula pelicula) {
        leerPeliculas();
        listaPeliculas.add(pelicula);
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

    private static Set<Pelicula> leerPeliculas() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("pelculas.tpv"));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof Pelicula) {
                    //System.out.println(aux);
                    listaPeliculas.add((Pelicula) aux);
                    aux = ois.readObject();
                }
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaPeliculas;
    }

    public static Set<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
}