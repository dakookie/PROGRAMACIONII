# Herencia (Padre-Hijo)

---
Fecha: 13/12/2022

+ Para llamar un pk desde main se deber hacer:
  main {
  Padre p = new Padre ();
  }
+ Creo el objeto y debo inmediatamente ir al constructor.

> ### Cosas que debe cumplir un constructor(concepto de POO)**

+ Los constructores están dentro del método.
+ Los metodos se definen solo con la palabra “new”.
+ Los constructores se ejecutan en una sola ocasión
+ Los constructores tienen el mismo nombre que la clase.
+ Los constructores me sirven para inicializar valores.
+ Sobrecarga (concepto de POO)

> ### Otros conceptos importantes

+ “This.” hace referencia a las propiedades de la clase, siempre que estemos dentro de la clase se utiliza el this para referenciar
  + Sintaxis --> ***this.----***
+ Shift + alt  (corte vertical) : sirve para seleccionar de manera vertical para cortar o añadir.
+ “super” me permite saltar de un constructor a otro
  + Sintaxis --> ***super(nombre del parametro);***

> ## Código

+ ***App.java*** --> Código main, aquí se ejecuta todo lo que hice

```java
import pkHerencia.Hijo;
import pkHerencia.Padre;

public class App {
    public static void main(String[] args) throws Exception {
        Padre p1 = new Padre(); //Instanciando
        Padre p2 = new Padre("pepe"); //Instanciando
        Padre p3 = new Padre("juanita","Quimico","M",23); //Instanciando

        Hijo h1 = new Hijo("ANA");
        Padre h3 = new Hijo("juanita","Quimico","F",23); //Instanciando
        h1.presentarse();

        //p1.presentarse();
        //p2.presentarse();
        //p3.presentarse();
        
    }
}
```

---

+ ***Padre.java*** ---> Aquí se crean los metodos y constructores del padre

```java
package pkHerencia;

public class Padre {
    //propiedades
    private String  nombre;
    private String  ocupacion;
    private String  sexo;
    private int     edad;

    //Constructor
    public Padre() {
        nombre     = "Pepe";
        ocupacion  = "Programador";
        sexo       = "M";
        edad       = 20;
    }
    //Constructor + sobrecarga
    // this. --> Propiedades de la clase, siempre que estemos dentro de la clase se utiliza el this
    // para referenciar
    public Padre(String nombre) {
        this.nombre     = nombre;
        this.ocupacion  = "Programador";
        this.sexo       = "M";
        this.edad       = 20;
    }
    public Padre(String nombre, String ocupacion, String sexo, int edad) {
        this.nombre     = nombre;
        this.ocupacion  = ocupacion;
        this.sexo       = sexo;
        this.edad       = edad;
    }
    //Metodos
    public void presentarse() {
        System.out.println(" -------------------------");
        System.out.println(" Yo me llamo : " + nombre);
        System.out.println(" Soy un : " + ocupacion);
        System.out.println(" Sexo : " + sexo);
        System.out.println(" Edad : " + edad);
    }
}
```

---

+ ***Hijo.java*** --> Aquí se crean los contructores del hijo que puedo pasar al padre.

```java
package pkHerencia;

public class Hijo extends Padre {
    //String Nombre;
    //Constructor
    public Hijo(String nombreHijo) {
        super(nombreHijo); //Envío a padre
        // this --> se utiliza para al misma clase
    }

    public Hijo(String nombre, String ocupacion, String sexo, int edad) {
        super(nombre, ocupacion, sexo, edad);
    }
}
```
