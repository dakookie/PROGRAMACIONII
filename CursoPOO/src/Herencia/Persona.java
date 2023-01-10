package Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


    public int getEdad() {
        return edad;
    }

    public Persona(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


}
