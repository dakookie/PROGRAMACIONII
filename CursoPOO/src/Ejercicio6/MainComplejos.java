package Ejercicio6;

import java.util.Scanner;

public class MainComplejos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * numero1 = a + bi
         * numero2 = c + di
         */
        NumerosComplejos numero1,numero2, suma, mult;
        double a,b,c,d;
        int opcion, entero;

        do{
            System.out.println("Operaciones con numeros complejos");
            System.out.println("1. Sumar dos numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comparar 2 numeros complejos (iguales o no)");
            System.out.println("4. Multiplicar un numero complejo por un numero entero");
            System.out.println("5. Salir");
            System.out.print("Digite la opcion de menu: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite el primer numero complejo: ");
                    System.out.print("Digite la parte real del numero: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real del numero: ");
                    c = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = sc.nextDouble();

                    numero1 = new NumerosComplejos(a, b);
                    numero2 = new NumerosComplejos(c, d);

                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es: " + suma.getA() + " + " + suma.getB() + "i");
                    break;
                case 2:
                    System.out.println("Digite el primer numero complejo: ");
                    System.out.print("Digite la parte real del numero: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real del numero: ");
                    c = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = sc.nextDouble();

                    numero1 = new NumerosComplejos(a, b);
                    numero2 = new NumerosComplejos(c, d);

                    mult = numero1.calcularMultiplicacion(numero2);
                    System.out.println("La multiplicacion es: " + mult.getA() + " + " + mult.getB() + "i");
                    break;
                case 3:
                    System.out.println("Digite el primer numero complejo: ");
                    System.out.print("Digite la parte real del numero: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real del numero: ");
                    c = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = sc.nextDouble();

                    numero1 = new NumerosComplejos(a, b);
                    numero2 = new NumerosComplejos(c, d);

                    if(numero1.comprobarIgualdad(numero2)){
                        System.out.println("Los numeros complejos son iguales");
                    }else{
                        System.out.println("Los numeros complejos no son iguales");
                    }
                    break;
                case 4:
                    System.out.println("Digite el primer numero complejo: ");
                    System.out.print("Digite la parte real del numero: ");
                    a = sc.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = sc.nextDouble();
                    System.out.print("Ahora digite el numero entero: ");
                    entero = sc.nextInt();

                    numero1 = new NumerosComplejos(a, b);
                    mult = numero1.multiplicarPorEntero(entero);
                    System.out.println("La multiplicacion es: " + mult.getA() + " + " + mult.getB() + "i");
                    break;
                case 5:
                    System.out.println("Opcion de menu incorrecta");
                    break;
            
                default:
                    break;
            }
        }while(opcion != 5);


    }
}
