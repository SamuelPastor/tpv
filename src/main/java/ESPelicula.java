import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ESPelicula {

    public static void anyadirPeli() throws IOException {
        List<Pelicula> pelis = new ArrayList<>();
        pelis.add(new Pelicula("es", "34", "rr.hbtg..", 63, 134));
        pelis.add(new Pelicula("est", "34", "rr..hgd.", 63, 134));
        pelis.add(new Pelicula("esg", "344", "rr..hgd.", 63, 134));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pelculas.tpv"));
        for (Pelicula p : pelis) {
            oos.writeObject(p);
        }
        oos.close();
    }

    public static void leerPeli() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("pelculas.tpv"));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof Pelicula) {
                    System.out.println(aux);
                    aux = ois.readObject();
                    //return (Pelicula) ois.readObject();
                }
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}