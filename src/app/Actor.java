package app;

public class Actor extends Persona {

    private String nivel;

    public Actor() {

    }

    public Actor(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String Nivel) {
        this.nivel = Nivel;
    }

}
