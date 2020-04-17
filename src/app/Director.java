package app;


public class Director {


    private String director;


    public Director(){

    }

    public Director(String director){
        this.director = director;
    }
    
    public String getDirector(){
        return director;
    }
    public void setDirector (String director){
        this.director = director;
    }

    private String estilo;

    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String Estilo) {
        this.estilo = Estilo;
    }
}



