import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {
    private String titulo;
    private String duracion;
    private String sinopsis;
    private int precioAlquiler;
    private int precioCompra;

    public Pelicula(String titulo, String duracion, String sinopsis, int precioAlquiler, int precioCompra) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.precioAlquiler = precioAlquiler;
        this.precioCompra = precioCompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return titulo.equals(pelicula.titulo) &&
                sinopsis.equals(pelicula.sinopsis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, sinopsis);
    }
}
