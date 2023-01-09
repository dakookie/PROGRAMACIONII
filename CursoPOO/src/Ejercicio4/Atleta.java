package Ejercicio4;

public class Atleta {
    //Atributos
    private int numAtleta;
    private String nombre;
    private float tiempo;


    //Constructor
    public Atleta(int numAtleta, String nombre, float tiempo) {
        this.numAtleta = numAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatosGanador(){
        return "Numero de atleta: " + numAtleta + " Nombre de atleta: " + nombre + " Tiempo de carrera: " + tiempo;
    }


}
