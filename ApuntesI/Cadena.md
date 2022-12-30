# Cadenas

---
Fecha: 15/12/2022

+ Se pueden realizar diferentes clases con los tipos de datos existentes.
+ Un nuevo for:
  + ***for-each*** --> Es un for inteligente

> ## Código 

***Cadena***
```java

package pkArreglo;

import java.util.ArrayList;
import java.util.List;

public class Cadena {

    public void showMatrizCharLogo(){
        char logo[][] = new char [7][7];

        System.out.println("cleaning....");
        for (int f = 0; f < logo.length; f++) 
            for(int c = 0; c < logo[f].length; c++)
                if(c==f || ((c+f+1)== logo.length))
                logo[f][c] = 'X';
            else
                logo[f][c] = ' ';

        System.out.println("draw char....");
        for (int f = 0; f < logo.length; f++) {
            for(int c = 0; c < logo[f].length; c++)
                System.out.print(" " + logo[f][c]);
            System.out.println("");
        }
    }
    public void showMatrizIntAnormal(){
        int pares[][] = {
                             { 0,  1,  2}
                            ,{ 1,  2,  3, 4 }
                            ,{ 2,  3,  4, 5, 7}
                            ,{ 3,  4,  5, 6}
                            ,{ 4,  5,  6}
                        };

        for (int f = 0; f < pares.length; f++) {
            for(int c = 0; c < pares[f].length; c++)
                System.out.print("  " + pares[f][c]);
            System.out.println("");
        }
    }
    public void showMatrizInt(){
        int pares[][] = new int[5][3];

        System.out.println("Loading...");
        for (int f = 0; f < pares.length; f++) 
            for(int c = 0; c < pares[f].length; c++)
                pares[f][c] = f+c;
            

        for (int f = 0; f < pares.length; f++) {
            for(int c = 0; c < pares[f].length; c++)
                System.out.print("  " + pares[f][c]);
            System.out.println("");
            
        }
    }
    public void showArrayString(){
        String frutas[] = {"sandia", "pera", "mandarina", "uva"};
        for (String f : frutas) {
            if(f.equals("mandarina"))
               for (char c : f.toCharArray()) {
                    System.out.print(" " + c);
               }
            else
               System.out.print(f);
            System.out.println("");
        }
    }
    public void showArrayChar(){
        char cadena[] = {'d','a','k','o','k','i','e'};
        //for (char i = 0; i < cadena.length; i++) {
        //    cadena[i] = i * 2 + 2;
        // }
        // foreach --> es un for inteligente
        System.out.println("show - foreach");
        for (char c : cadena) {
            System.out.println(c);
        }
    }
    public void showArrayInt(){
        int pares[] = new int[5];

        // pares[0] = 2;
        // pares[1] = 4;
        // pares[2] = 6;
        // pares[3] = 8;
        // pares[4] = 10;

        System.out.println("Loading...");
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2 + 2;
        }

        System.out.println("show - for");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }

        // foreach --> es un for inteligente
        System.out.println("show - foreach");
        for (int i : pares) {
            System.out.println(i);
        }
    }
}
```

---

## Listas

+ Primero se pone list (se debe importar el java util).
+ Sirve para listar un conjunto de cosas.

> ## Código listas

```java
package pkArreglo;

import java.util.ArrayList;
import java.util.List;

public class Cadena {

    public void showListString() {
        List<String> listado = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        listado.add("Pepe");
        listado.add("Ana");
        listado.add("Lucho");

        numeros.add(1);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);

        for (String nombre : listado) {
            System.out.println(nombre);
        }
        
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}
```

---

***AppCadena*** --> Donde se ejecutan todas las clases
```java
import pkArreglo.Cadena;
/**
 * @author: dakookie
 * @date: 15.dic.2022
 * @version: 1.1
 * Cadenas de datos
 */
public class AppCadena {
    /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
    */
    public static void main(String[] args) {

        Cadena c = new Cadena();

        c.showArrayInt();
        c.showArrayChar();
        c.showArrayString();
        c.showMatrizInt();
        c.showMatrizIntAnormal();
        c.showMatrizCharLogo();
        c.showListString();
    }
}
```

