//Encapsulamiento(ocultar datos) y metodos accesores(Getters y setters)
//Set-->Establecer
package Paquete1;

public class ClaseUno {
    private int edad;
    private String nombre;

    //Metodo setters: Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Metodo getters: Mostramos la edad
    public int getEdad() {
        return edad;
    }

    //----------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    

    


}
