package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Potflix
 */
public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<Actor> actor = new ArrayList<>();
    public List<Director> director = new ArrayList<>();

    public void inicializarCatalogo() {

        Serie breakingB = new Serie();
        breakingB.setTitulo("Breaking Bad");

        Genero genero = new Genero();
        genero.setNombre("Drama");
        breakingB.genero.add(genero);

        Actor actor = new Actor();
        actor.setDatos("Bryan Cranston");
        actor.setDatos("Aaron Paul");
        breakingB.actores.add(actor);

        Director director = new Director();
        director.setDirector("Vince Gilligan");
        breakingB.directores.add(director);


        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.setNumero(7);
        ep.setNombre("Say my name");
        ep.setDuracion(43);

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.setNumero(5);
        epOtro.setNombre("Ozymandias");
        epOtro.setDuracion(41);

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

        Serie theWalkingDead = new Serie();
        theWalkingDead.setTitulo("The Walking Dead");

        genero = new Genero();
        genero.setNombre("Ficción, Drama, Apocaliptico");
        theWalkingDead.genero.add(genero);

        actor = new Actor();
        actor.setDatos("Andrew Lincoln");
        theWalkingDead.actores.add(actor);

        actor = new Actor();
        actor.setDatos("Norman Reedus");
        theWalkingDead.actores.add(actor);

        director = new Director();
        director.setDirector("Frank Darabont");
        theWalkingDead.directores.add(director);

        Temporada t2 = new Temporada();
        t2.numero = 2;

        Episodio epi = new Episodio();

        epi.setNumero(1);
        epi.setNombre("What lies ahead");
        epi.setDuracion(45);

        t2.episodios.add(epi);

        Episodio epiOtro = new Episodio(2, "Bloodletting", 44);

        t2.episodios.add(epiOtro);
        theWalkingDead.temporadas.add(t2);

        this.series.add(theWalkingDead);

        Temporada t3 = new Temporada();
        t3.numero = 3;

        Episodio epii = new Episodio(8, "Made to suffer");

        epii.setDuracion(43);

        t3.episodios.add(epii);
        theWalkingDead.temporadas.add(t3);

        Episodio epiii = new Episodio();
        epiii.setNumero(9);
        epiii.setNombre("The Suicide King");
        epiii.setDuracion(48);

        t3.episodios.add(epiii);
        theWalkingDead.temporadas.add(t3);

        Websodio websodio = new Websodio(1, "A new day");

        websodio.setDuracion(20);
        websodio.setUrl("http://fdjfd.com");

        t3.episodios.add(websodio);

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
            if (s.titulo.equals(titulo))
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