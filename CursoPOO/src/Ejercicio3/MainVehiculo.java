package Ejercicio3;

import java.util.Scanner;

public class MainVehiculo {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String marca, modelos;
        float precio;
        int numVehiculos, indiceBarato;


        System.out.println("Digite la cantidad de vehiculos");
        numVehiculos = sc.nextInt();

        //Crfeamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];

        for (int i = 0; i < coches.length; i++) {
            sc.nextLine();
            System.out.println("Digite las caracteristicas del coche " + (i+1) + ":");
            System.out.println("Introduzca Marca: ");
            marca = sc.nextLine();
            System.out.println("Introduzca Modelo: ");
            modelos = sc.nextLine();
            System.out.println("Introduzca el precio del coche: ");
            precio = sc.nextFloat();

            coches[i] = new Vehiculo(marca, modelos, precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());

    }
}
