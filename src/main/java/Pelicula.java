public class Pelicula {
    private String titulo;
    private String duracion;
    private String sinopsis;
    private int precioAlquiler;
    private int precioCompra;
    private String anyo;
    private String director;

    public Pelicula(String titulo, String duracion, String sinopsis, int precioAlquiler, int precioCompra, String anyo, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.precioAlquiler = precioAlquiler;
        this.precioCompra = precioCompra;
        this.anyo = anyo;
        this.director = director;
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

    public String getAnyo() {
        return anyo;
    }

    public String getDirector() {
        return director;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
}
