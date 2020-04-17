package app;

public abstract class Persona {

    private String datos;

    public Persona() {

    }

    public Persona(String datos) {
        this.datos = datos;
    }

    public String getDatos() {
        return datos;

    }

    public void setDatos(String Datos) {
        this.datos = Datos;
    }
}