import javax.swing.*;
import java.awt.*;

public class PanelAcciones {
    private static GridBagLayout  layout = new GridBagLayout();
    private static JPanel panel = new JPanel(layout);
    private  static JLabel imagen = new JLabel();
    private  static JTextArea areaFactura;
    private static JButton botonAlquilar;
    private static JButton botonComprar;
    private static String titulo;
    private static int precioAlquiler;
    private static int precioCompra;
    private static int coste = 0;
    public static JPanel panelAcciones() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,0,10,0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(imagen, gbc);
        botonAlquilar = new JButton("Alquilar");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(botonAlquilar, gbc);
        botonComprar = new JButton("Comprar");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(botonComprar, gbc);

        areaFactura = new JTextArea();
        areaFactura.setLineWrap(true);
        areaFactura.setWrapStyleWord(true);
        areaFactura.setEditable(false);
        areaFactura.setFont(new Font("Courier New",Font.BOLD,12));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(areaFactura, gbc);

        JButton botonImprimir = new JButton("Finalizar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(botonImprimir, gbc);

        JButton botonAñadirPeli = new JButton("Añadir Pelicula");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.insets.top = 180;
        panel.add(botonAñadirPeli, gbc);
        botonAlquilar.addActionListener(e-> {
            if (titulo != null) {
                Tiquets.actualizar();
                Tiquets.setTiquet(titulo + " (ALQ)    " + precioAlquiler + "€" + "\n");
                coste += precioAlquiler;
                areaFactura.setText(Tiquets.getTiquet());
            }
        });
        botonComprar.addActionListener(e-> {
            if (titulo != null) {
                Tiquets.actualizar();
                Tiquets.setTiquet(titulo + " (COM)    " + precioCompra + "€" + "\n");
                coste += precioCompra;
                areaFactura.setText(Tiquets.getTiquet());
            }
        });
        botonImprimir.addActionListener(e-> {
            Tiquets.finalizar();
            areaFactura.setText(Tiquets.getTiquet());
            ImprimirString.imprimirTicket(Tiquets.getTiquet());
        });
        botonAñadirPeli.addActionListener(e ->  AnyadirPelicula.nuevaPeli());
        return panel;
    }

    public static JLabel getImagen() {
        return imagen;
    }

    public static JTextArea getAreaFacturaFactura() {
        return areaFactura;
    }

    public static JButton getBotonAlquilar() {
        return botonAlquilar;
    }

    public static JButton getBotonComprar() {
        return botonComprar;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static void setTitulo(String titulo) {
        PanelAcciones.titulo = titulo;
    }

    public static int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public static void setPrecioAlquiler(int precioAlquiler) {
        PanelAcciones.precioAlquiler = precioAlquiler;
    }

    public static int getPrecioCompra() {
        return precioCompra;
    }

    public static void setPrecioCompra(int precioCompra) {
        PanelAcciones.precioCompra = precioCompra;
    }

    public static int getCoste() {
        return coste;
    }
}