package ClasesYObjetos;

import java.util.Scanner;

public class Main2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero");
        int n1 = sc.nextInt();
        System.out.println("Digite un numero");
        int n = sc.nextInt();

        Operacion2 op2 = new Operacion2();

        op2.sumar(n1,n);
        op2.restar(n1, n);
        op2.multiplicar(n1, n);
        op2.dividr(n1, n);

        op2.mostrarResultados();

    } 
}
