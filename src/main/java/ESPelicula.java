import java.io.*;

public class ESPelicula {

    public static void anyadirPeli() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pelculas.tpv"));
        oos.writeObject(new Pelicula("es", "34", "rr...", 63, 134));

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
                }
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}