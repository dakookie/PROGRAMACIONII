package ClasesYObjetos;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite un numero");
    int n1 = sc.nextInt();
    System.out.println("Digite un numero");
    int n = sc.nextInt();

    Operacion3 op3 = new Operacion3();
    /*
    int suma = op3.sumar(n1,n);
    int resta = op3.restar(n1, n);
    int multiplicacion = op3.multiplicar(n1, n);
    int division= op3.dividr(n1, n);

    op3.mostrarResultados(suma, resta, multiplicacion, division);
    }
    */

    //Otra forma
    System.out.println("La suma es: " + op3.sumar(n1, n));
    System.out.println("La resta es: " + op3.restar(n1, n));
    System.out.println("La multiplicacion es: " + op3.multiplicar(n1, n));
    System.out.println("La division es: " + op3.dividr(n1, n));
    }
}
