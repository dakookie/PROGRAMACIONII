# Listas

---
Fecha: 16/12/2022

+ ***List*** --> Me permite conocer la lista de cualquier cosa(propia librería y propios métodos).
+ Una lista es un arreglo.

+ ***size*** --> Devulve el elemento que se quiera de la lista.
+ ***get*** --> posición de un elemento de la lista.
+ .remove(5)
+ .remove("aqui"); --> Hace un recorrido desde el inicio de la lista.

+ Todas las propiedades que van en el class van con private.
+ Crear un constructor para poner información en las propiedades.
+ ***Constructor*** siempre debe ser público

---

> ## Código

***Estudiante.java***

```java
package pkPoliEstudiante;

public class Estudiante {
    //todas las propiedades que van en el class deben ser privados
    private String nombre;
    private Boolean depre;
    private int codigo;

    //Los constructores siempre deben ser publicos
    //Constructor
    //public Estudiante(){

    //}
    //Constructor
    public Estudiante(int codigo, String nombre, Boolean depre){
        this.nombre = nombre;
        this.depre = depre;
        this.codigo = codigo;
    }

    //Metodo
    public void ShowMe() {
        System.out.println("codigo = " + codigo);
        System.out.println("nombre = " + nombre);
        System.out.println("depre  = " + depre);
    }
}
```

***AppEstudiante.java***
```java
import java.util.ArrayList;
import java.util.List;

import pkPoliEstudiante.Estudiante;
/**
 * @author: dakookie
 * @date: 15.dic.2022
 * @version: 1.1
 * Cadenas de datos
 */
public class AppEstudiante {
     /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
    */
    public static void main(String[] args) {
       
        List<Estudiante> lsProg = new ArrayList<>();
        //Estudiante badBunny = new Estudiante();
        //Estudiante poliEstu = new Estudiante(1, "PepaPig", false);
        Estudiante poliEstu1 = new Estudiante(1, "poliEstu1",false);
        // Estudiante poliEstu2 = new Estudiante(2, "Pepe",false);
        // Estudiante poliEstu3 = new Estudiante(3, "Fabian",false);
        
        //poliEstu.ShowMe();

        // lsProg.add(poliEstu1);
        // lsProg.add(poliEstu2);
        // lsProg.add(poliEstu3);

        lsProg.add(new Estudiante(1, "Lola",false));
        lsProg.add(new Estudiante(2, "Pepe",false));
        lsProg.add(poliEstu1);
        lsProg.add(new Estudiante(3, "Fabian",false));
        
        lsProg.add(1, new Estudiante(11, "atrazado",false));

        lsProg.remove(poliEstu1);

        // for (Estudiante estudiante : lsProg) {
        //     estudiante.ShowMe();
        //     System.out.println(" ----- ");
        // }
    }
}

```
