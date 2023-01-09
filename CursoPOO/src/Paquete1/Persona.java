//Constantes(final)
//A la constante no se puede cambiar
package Paquete1;

public class Persona {
    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
