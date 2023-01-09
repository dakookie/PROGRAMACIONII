package Ejercicio5;

import java.util.Scanner;

public class MainTriangulo {
    public static double mayorArea(TrianguloIsosceles triangulos[]) {
        double area;

        area = triangulos[0].obtenerArea();
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.print("Digite el numero de triangulos a ingresar: ");
        nTriangulos = sc.nextInt();

        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Digite los valores para el triangulo " + (i+1) + ":");
            System.out.print("Introduzca la base: ");
            base = sc.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = sc.nextDouble();

            triangulos[i] = new TrianguloIsosceles(base, lado);

            System.out.println("El perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El perimetro del triangulo es: " + triangulos[i].obtenerArea());
        }
        System.out.println("El area del triangulo de mayor superficie es: " + mayorArea(triangulos));
    }
}
