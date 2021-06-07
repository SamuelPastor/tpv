import javax.swing.*;
import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {
    private String titulo;
    private String duracion;
    private int precioAlquiler;
    private Generos genero;
    private int precioCompra;
    private ImageIcon imagen;

    public Pelicula(String titulo, String duracion, int precioAlquiler, int precioCompra, ImageIcon imagen, Generos genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.precioAlquiler = precioAlquiler;
        this.precioCompra = precioCompra;
        this.imagen = imagen;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getGenero() {
        return genero.getGenero();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return titulo.equals(pelicula.titulo) &&
                duracion.equals(pelicula.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracion);
    }
}
