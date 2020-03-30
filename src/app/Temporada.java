package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public List<Episodio> episodios = new ArrayList<>();
    public int numero;

    public Episodio getEpisodio(int nro) {

        //recorrer cada episodio 
        //si el numero de episodio del ciclo es igual a "numero"
        //devolver ese episodio

        for (Episodio epi : this.episodios) {

            if (epi.numero == nro) {
                return epi;
            }
        }

        return null;
    }
}