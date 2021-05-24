public enum Generos {
    ACCION("Acción"),
    TERROR("Terror"),
    COMEDIA("Comedia"),
    DRAMA("Drama");

    String genero;

    Generos(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
