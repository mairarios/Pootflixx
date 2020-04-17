package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Potflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    
    public void inicializarCatalogo() {

        Serie breakingB = new Serie();
        breakingB.setTitulo("Breaking Bad");

        Genero genero = new Genero("Drama");
        breakingB.genero.add(genero);

        Actor actor1 = new Actor();
        actor1.setDatos("Bryan Cranston");
        breakingB.actores.add(actor1);

        Actor actor2 = new Actor();
        actor2.setDatos("Aaron Paul");
        breakingB.actores.add(actor2);

        Director director = new Director();
        director.setDirector("Vince Gilligan");
        breakingB.directores.add(director);


        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio(7, "Say my name", 43);
        t5.episodios.add(ep);

        Episodio epOtro = new Episodio(5, "Ozymandias", 41);
        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

        Serie theWalkingDead = new Serie();
        theWalkingDead.setTitulo("The Walking Dead");

        genero = new Genero("Ficcion, drama, apocaliptico");
        theWalkingDead.genero.add(genero);

        Actor actor3 = new Actor("Andrew Lincoln");
        theWalkingDead.actores.add(actor3);

        Actor actor4 = new Actor("Norma Reedus");
        theWalkingDead.actores.add(actor4);

        director = new Director("Frank Darabont");
        theWalkingDead.directores.add(director);

        Temporada t2 = new Temporada(2);

        Episodio epi = new Episodio(1, "What lies ahead", 45);
        t2.episodios.add(epi);

        Episodio epiOtro = new Episodio(2, "Bloodletting", 44);

        t2.episodios.add(epiOtro);
        theWalkingDead.temporadas.add(t2);

        this.series.add(theWalkingDead);

        Temporada t3 = new Temporada(3);

        Episodio epii = new Episodio(8, "Made to suffer", 43);

        t3.episodios.add(epii);
        theWalkingDead.temporadas.add(t3);

        Episodio epiii = new Episodio(9, "The Suicide King", 48);


        t3.episodios.add(epiii);
        theWalkingDead.temporadas.add(t3);

        Websodio websodio = new Websodio(1, "A new day");
        websodio.setDuracion(20);
        websodio.setUrl("http://fdjfd.com");

        websodio = new Websodio(2, "Alone");

        websodio.setDuracion(20);
        websodio.setUrl("http://jfdj.com");

        t3.episodios.add(websodio);

        theWalkingDead.temporadas.add(t3);

        this.series.add(theWalkingDead);

    }

    public Contenido buscarPorTitulo(String titulo) {
        return null;

    }

    public Serie buscarPorSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.getTitulo().equals(titulo))
                return s;
        }
        return null;
    }

    public Pelicula buscarPelicula(String titulo) {
        return null;
    }

    public Serie buscarSerie(Actor actor) {
        return null;
    }

}