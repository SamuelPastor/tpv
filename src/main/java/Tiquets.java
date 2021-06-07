import java.util.ArrayList;
import java.util.List;

public class Tiquets {
    private static List<String> tiquets = new ArrayList<>();
    private static int numeroFactura = tiquets.size();
    private static String tiquet = "          ClubVideo\n\n" + "número de factura: " + numeroFactura + "\n" +
            "   -------------------------------\n";

    public static void actualizar() {
        if (numeroFactura == 0) {
            ESTiquets.leerTiquets();
            numeroFactura = tiquets.size();
            tiquet = "          ClubVideo\n\n" + "número de factura: " + numeroFactura + "\n" +
                    "   -------------------------------\n";
        }
    }
    public static String getTiquet() {

        return tiquet;
    }

    public static void setTiquet(String texto) {
        tiquet += texto;
    }

    public static void finalizar() {
        tiquet += "   -------------------------------\n";
        tiquet += "Total: " + PanelAcciones.getCoste();
        tiquets.add(tiquet);
        ESTiquets.anyadirTiquet(tiquet);
        numeroFactura = tiquets.size();
        tiquet = "          ClubVideo\n\n" + "número de factura: " + numeroFactura + "\n" + "   -------------------------------\n";
    }

    public static List<String> getTiquets() {
        return tiquets;
    }
}
