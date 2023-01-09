package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Metodo constructor
    // deben ser publicos
    //Utilizar this en el constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    //Metodo con sobrecarga siempre y cuando los parametros sean de diferente tipo
    public Persona(String dni){
        this.dni = dni;
    }

    public void correr(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años y estoy corriendo una maraton");
    }

    public void correr(int km){
        System.out.println("He corrido " + km + " Kilometros");
    }
}
