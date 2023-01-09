package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuadrilatero c1;

        float lado1;
        float lado2;

        System.out.println("Digite el lado 1");
        lado1 = sc.nextFloat();
        System.out.println("Digite el lado 2");
        lado2 = sc.nextFloat();

        if(lado1==lado2){
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());
    }
}
