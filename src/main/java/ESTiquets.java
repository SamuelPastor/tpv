import java.io.*;
import java.util.List;

public class ESTiquets {
    public static void anyadirTiquet(String tiquet) {
        leerTiquets();
        Tiquets.getTiquets().add(tiquet);
        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream("tiquets.tpv"));
            for (String s : Tiquets.getTiquets()) {
                oos.writeObject(s);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> leerTiquets() {
        Tiquets.getTiquets().clear();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("tiquets.tpv"));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof String) {
                    Tiquets.getTiquets().add((String)aux);
                    aux = ois.readObject();
                }
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Tiquets.getTiquets();
    }
}
