package Ejercicio3;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelos;
    private float precio;


    //Constructor
    public Vehiculo(String marca, String modelos, float precio) {
        this.marca = marca;
        this.modelos = modelos;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: " + marca + " Modelo: " + modelos + " Precio: " + precio;
    }

    
    
}
