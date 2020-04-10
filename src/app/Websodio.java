package app;

public class Websodio extends Episodio {

    public Websodio(int numero, String nombre) {
        super(numero, nombre);
        this.url = "http://fdjfd.com";
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // hace un override del metodo reproducir que estaba en Episodio

    @Override
    public void reproducir() {

        System.out.println("Reproduciendo websodio " + getNombre() + " de la url: " + this.url);

    }

    // "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
    // EPISODIO.

    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }
}