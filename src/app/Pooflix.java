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
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.genero.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodios.add(epOtro);

        breakingB.temporadas.add(t5);

        this.series.add(breakingB);

        Serie theWalkingDead = new Serie();
        theWalkingDead.titulo = "The Walking Dead";

        genero = new Genero();
        genero.nombre = "Ficción, Drama, Apocaliptico";
        theWalkingDead.genero.add(genero);

        Temporada t2 = new Temporada ();
        t2.numero = 2;

        Episodio epi = new Episodio();

        epi.numero = 1;
        epi.nombre = "What lies ahead";
        epi.duracion = 45;

        t2.episodios.add(epi);

        Episodio epiOtro = new Episodio();

        epiOtro.numero = 2;
        epiOtro.nombre = "Bloodletting";
        epiOtro.duracion = 44;

        
        t2.episodios.add(epiOtro);
        theWalkingDead.temporadas.add(t2);

        this.series.add(theWalkingDead);


        Temporada t3 = new Temporada();
        t3.numero = 3;

        Episodio epii = new Episodio();

        epii.numero = 8;
        epii.nombre = "Made to suffer";
        epii.duracion= 43;

        t3.episodios.add(epii);
        theWalkingDead.temporadas.add(t3);

        Episodio epiii = new Episodio();
        epiii.numero= 9;
        epiii.nombre= "The Suicide King";
        epiii.duracion = 48;

        t3.episodios.add(epiii);
        theWalkingDead.temporadas.add(t3);

        
        Websodio websodio = new Websodio();

        websodio.numero = 1;
        websodio.nombre = "A new day";
        websodio.duracion = 20;
        websodio.url = "http://fdjfd.com";

        t3.episodios.add(websodio);

        websodio = new Websodio();

        websodio.numero = 2;
        websodio.nombre = "Alone";
        websodio.duracion = 20;
        websodio.url = "http://jfdj.com";

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