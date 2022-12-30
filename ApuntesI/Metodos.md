# Entrada de Datos/Metodos

---
Fecha: 07/12/2022

+ ***Cast***: Sirve para convertir un tipo de dato a otro. Existen dos tipos de conversiones:
  + Implícita
  + Explícita

### Secuencias de escape

+ \t --> mover el cursor al siguiente tabulador
+ \n --> salto de línea: avanza a la primera columna en el siguiente renglón
+ \r --> avanza a la primera columna en el renglón actual
+ \" --> imprime una literal que utiliza comilla doble
+ \' --> imprime una literal con comilla sencilla
+ \\ --> imprime una diagonal invertida

### Variables primitivas

+ int, long (tipos enteros)
+ float, double (tipos de punto flotante)
+ char (tipo carácter)

### Variables de referencia

+ String name = "Thanh Nguyen";
+ Calendar fechaNac;

### String : str

+ ***charAt(index)*** // obtener un carácter
+ ***Length*** // obtener la longitud del string
+ ***Equals*** // comparación 
+ ***equalsIgnoreCase*** // ignorar si es mayúsculas o minúscula 

### Scanner : std

+ Scanner stdIn = new Scanner(System.in);
+ <variable> = stdIn.nextLine();
+ ***nextInt()*** --> Se salta los espacios dejados en blanco hasta que encuentra un valor de tipo int
+ ***nextLong()*** --> Se salta los espacios dejados en blanco hasta que encuentra un valor de tipo long
+ ***nextFloat()*** --> Se salta los espacios dejados en blanco hasta que encuentra un valor de tipo float
+ ***nextDouble()*** --> Se salta los espacios dejados en blanco hasta que encuentra un valor de tipo double
“salta los espacios dejados en blanco ”
+ ***next()*** --> Se salta los espacios dejados en blanco hasta que encuentra un token. Devuelve el token como un valor tipo String.

### Arrays

+ Se utilizan los corchetes.
+ EOF : Final de lectura para un arreglo

---

> ## Código(Métodos que no retornan valor)

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
        
        int nroPares = 10;
        showPares(nroPares);

        //Metodos
        calcularAreaRect();
        showSignosAlternos();
        drawLetraC();
    }

    private static void showPares(int nroPares) {
        for (int i = 0; i < nroPares * 2; i++) {
            if(i % 2 == 0)
              System.out.println(i);
        }
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

---

> ## Métodos que retornan valor

+ El void en el método desaperece y se reemplaza por el tipo de valor que quiero retornar.
+ Se utiliza el ***return***.
+ Dos metodos si pueden tener el mismo nombre. Sin embargo, debo tener en cuenta los tipos que parametros que tiene el metodo. (Esto se hace llamar << Sobrecarga>>).

---

> ## Codigo (Métodos que retornan valor)
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
        int nivel = 5;
        for (int i = 0; i < nivel; i++) {
            for (int d = 0; d < i; d++) 
                System.out.print("  ");
            if(i>0)
               System.out.print("|");
            System.out.println("__");
        }
        System.out.println("");
        //drawCuadrado();
        //int a = 1, b = 2, c = 0;
        //float f = 1;

        //c = suma(a, b);
        //f = suma(a, f);
        //f = suma(f, a);
        //f = suma(f, f);

        //int nroPares = 10;
        //showPares(nroPares);
        //Metodos
        //calcularAreaRect();
        //showSignosAlternos();
        //drawLetraC();
    }

    private static void drawCuadrado() {
        int tamano = 5;

        for (int f = 0; f < tamano; f++) {
            for (int c = 0; c < tamano; c++) 
                if(f==0 || c==0 || f==tamano-1 || c==tamano-1)
                   System.out.print(((c+f)%2==0)?"+ ":"- ");
                else
                   System.out.print("  ");
            System.out.println(" ");
        }
        System.out.println("");
    }

    private static int suma(int a, int f) {
        return a+f;
    }
    private static float suma(int a, float f) {
        return a+f;
    }
    private static float suma(float a, float f) {
        return a+f;
    }

    private static void showPares(int nroPares) {
        for (int i = 0; i < nroPares * 2; i++) {
            if(i % 2 == 0)
              System.out.println(i);
        }
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