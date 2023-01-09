package ClasesYObjetos;

import java.util.Scanner;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    Scanner sc = new Scanner(System.in);

    //Metodos
    //Metodo para pedirle al usuario que nos dijite 2 numeros
    //Metodos: Parametros y argumentos
    //el parametro se pone en la declaracion del metodo
    // elargumento se pone en la invocacion del mentod
    public void leerNumero(){
        System.out.println("Digite un numero");
        numero1 = sc.nextInt();
        System.out.println("Digite un numero");
        numero2 = sc.nextInt();
    }

    public void sumar(){
        suma = numero1+numero2;
    }
    public void restar(){
        resta = numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    public void dividr(){
        division = numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
