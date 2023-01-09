package Ejercicio2;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tablero t1;
        int x,y, opcion, incremento = 0;

        System.out.println("Digite la coordenada inicial de x");
        x = sc.nextInt();
        System.out.println("Digite la coordenada inicial de y");
        y = sc.nextInt();

        //Posicion onicial del objeto
        t1 = new Tablero(x, y);

        do{
            System.out.println("MENU");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover hacia abajo");
            System.out.println("3. Mover hacia la derecha");
            System.out.println("4. Mover hacia la izquierda");
            System.out.println("5. Salir");
            System.out.println("Digite la opcion");
            opcion = sc.nextInt();
            
            if(opcion != 5){
                System.out.print("Digite la cantidad de espacios a moverse: ");
                incremento = sc.nextInt();
            }
            switch (incremento) {
                case 1:
                    t1.moverArriba(incremento);
                    break;
                case 2:
                    t1.moverAbajo(incremento);
                    break;
                case 3:
                    t1.moverDerecha(incremento);
                    break;
                case 4:
                    t1.moverIzquiera(incremento);
                    break;
                case 5:
                    break;
            
                default:
                    System.out.println("Error, se equivoco de opcion de menu");
                    break;
            }
            
            System.out.println("Posicion actual (x,y): " +"("+ t1.getX() + "," + t1.getY() + ")");
        }while(opcion !=5);

    }
}
