package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int nro) {

        for (Temporada tempo : this.temporadas) {
            if (tempo.numero == nro) {
                return tempo;
            }
        }

        return null;
    }

    private int año;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;

    }

}