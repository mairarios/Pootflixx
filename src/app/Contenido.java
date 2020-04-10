package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenido
 */
public class Contenido {

    public String titulo;
    public Director director;
    public double tiempoVisto;

    public List<String> premios = new ArrayList<>();
    public List<Genero> genero = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();
    public int calificacion;

    public boolean visto() {
        return false;

    }

    public void reproducir() {
        System.out.println("Reproduciendo" + this.titulo);

    }

    public void pausar() {
        System.out.println("Pasar" + this.titulo);
    }
}