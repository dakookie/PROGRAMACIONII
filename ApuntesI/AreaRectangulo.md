# Area de un Rectangulo

---
Fecha: 06/12/2022

> ## Codigo sin métodos

El presente codigo es para determinar el área de un rectángulo

```java
import java.util.Scanner;
/**
 * @author: dakookie
 * @date: 16.dic.2022
 * @version: 1.1
 * Determinar el área de un rectángulo
 */
public class AreaRectangulo {
    /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
     */
    public static void main(String[] args) {
        // Declaracion de variables e inicializadas
        int longitud = 0, ancho = 0, areaRect = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud: ");
        longitud = sc.nextInt();
        
        System.out.print("Ingrese el ancho: ");
        ancho = sc.nextInt();

        areaRect = ancho*longitud;

        System.out.println("El area es: " + areaRect);
        sc.close();
    }
}
```

---
Para hacer un método se selecciona y hago clic izquierdo en refactorizar(Extract to method) y se pone un nombre.

> ## Código con métodos
```java
import java.util.Scanner;
/**
 * @author: dakookie
 * @date: 16.dic.2022
 * @version: 1.1
 * Determinar el área de un rectángulo
 */
public class AreaRectangulo {
    /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
    */

    public static void main(String[] args) {
        //Metodos
        calcularAreaRect();
        showSignosAlternos();
        drawLetraC();
    }

    private static void drawLetraC() {
        int nroTerminos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro.terminos: ");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)? "+ ":"- "); 
        }
        System.out.println("");
        for (int i = 0; i < nroTerminos; i++) {
            System.out.println((i%2==0)? "+ ":"- "); 
        }
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)? "+ ":"- "); 
        }
        System.out.println("");
        sc.close();
    }

    private static void showSignosAlternos() {
        int nroTerminos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nro.terminos: ");
        nroTerminos = sc.nextInt();

        for (int i = 0; i < nroTerminos; i++) {
            System.out.print((i%2==0)? "+ ":"- "); 
        }
        System.out.println("");
        sc.close();
    }

    private static void calcularAreaRect() {
        // Declaracion de variables e inicializadas
        int longitud = 0, ancho = 0, areaRect = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud: ");
        longitud = sc.nextInt();
        
        System.out.print("Ingrese el ancho: ");
        ancho = sc.nextInt();

        areaRect = ancho*longitud;

        System.out.println("El area es: " + areaRect);
        sc.close();
    }
}
```