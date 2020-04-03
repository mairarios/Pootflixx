package app;

public class App {
    public static void main(String[] args) throws Exception {

        Potflix miPotflix = new Potflix();

        System.out.println("Iniciando Catalogo");

        miPotflix.inicializarCatalogo();

        Serie bb = miPotflix.buscarPorSerie("The Walking Dead");

        Temporada laMejorTemporada = bb.getTemporada(3);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(8);

        elTop.reproducir();
    }
}