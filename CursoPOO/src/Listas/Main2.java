package Listas;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        
        List<Persona> lisPersona = new ArrayList<>();

        for (int i = 0; i < 10; i++) {        
        Persona per = new Persona();
        per.setCodigo(i);
        per.setNombre("Nombre: " + i);
        per.setApellido("Apellido: " + i);
        per.setEdad(25 + i);
        lisPersona.add(per);
        }
        /*
        System.out.println("Dato lista: " + lisPersona.get(0).getNombre() + " " + lisPersona.get(0).getApellido());
        */
        System.out.println("Tamaño de la lista: " + lisPersona.size());

        for(Persona p: lisPersona){
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Edad: " + p.getEdad());
        }
    }
}
