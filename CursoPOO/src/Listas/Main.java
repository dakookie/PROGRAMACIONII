package Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lisNombres = new ArrayList<>();

        //add --> añadir cosas a la lista
        lisNombres.add("Damaris");
        lisNombres.add("Rosa");
        lisNombres.add("Manuel");
        lisNombres.add("Sonia");

        //Tamaño: size
        System.out.println("Tamaño: " + lisNombres.size());

        //get -> Dato de la posicion
        System.out.println("Dato posicion 0: " +lisNombres.get(0));

        //Para quitar de la lista
        lisNombres.remove(1);
        System.out.println("Tamaño: " + lisNombres.size());

        //Para imprimir una lista
        for(String n: lisNombres){
            System.out.println("Nombre: " + n);
        }

        
        
    }
}
