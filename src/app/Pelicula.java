package app;

/**
 * Pelicula
 */
public class Pelicula extends Contenido {

    private String pelicula;

    public Pelicula() {

    }

    public Pelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public boolean filmadaEnImax() {
        return false;

    }

}