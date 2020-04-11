package app;

import java.util.ArrayList;
import java.util.List;


public class Contenido {

    public List<String> premios = new ArrayList<>();
    public List<Genero> genero = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();
    public List<Director> directores = new ArrayList<>();

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private Director director;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    private double tiempoVisto;

    public double getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(double tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public boolean visto() {
        return false;

    }

    private int calificacion;
    public int getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo" + this.titulo);

    }

    public void pausar() {
        System.out.println("Pasar" + this.titulo);
    }
}