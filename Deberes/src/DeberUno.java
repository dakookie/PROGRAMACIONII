package Deberes.src;
import java.util.Scanner;
import java.util.Arrays;
public class DeberUno {
    public static void main(String[] args) {
        //Definir variables
        String[] izquierda = {"O","L","C","U"};
        String[] derecha = {"","","",""};
        int ingreso;
        boolean bandera = true;
        Scanner ingresoConsola = new Scanner(System.in);

        //Operaciones
        System.out.println("Bienvenido al juego del lobo, caperucita y las uvas");
        System.out.println("Reglas");
        System.out.println("El lobo no se puede quedar solo con la caperucita porque la come");
        System.out.println("Caperucita no se puede quedar sola con las uvas porque las come");
        System.out.println("Si consideras terminar el juego, digita un numero diferente a los pedidos");
        while(bandera == true){
            System.out.println("Digite 1 si desea cruzar de izquierda a derecha al observador y uvas");
            System.out.println("Digite 2 si desea cruzar de izquierda a derecha al observador y lobo");
            System.out.println("Digite 3 si desea cruzar de izquierda a derecha al observador y caperucita");
            System.out.println("Digite 4 si desea cruzar de derecha a izquierda al observador");
            System.out.println("Digite 5 si desea cruzar de derecha a izquierda al observador y uvas");
            System.out.println("Digite 6 si desea cruzar de derecha a izquierda al observador y lobo");
            System.out.println("Digite 7 si desea cruzar de derecha a izquierda al observador y caperucita");
            ingreso = ingresoConsola.nextInt();
            if(ingreso==1 && (izquierda[1].equals("L")&&(izquierda[2].equals("C")))){
                System.out.println("Perdiste");
                System.out.println("El lobo se comió a caperucita");
                bandera = false;
            }
            if(ingreso==2 && (izquierda[2].equals("C")&&(izquierda[3].equals("U")))){
                System.out.println("Perdiste");
                System.out.println("Caperucita se comió las uvas");
                bandera = false;
            }
            switch (ingreso) {
                case 1:
                    izquierda[0] = " ";
                    izquierda[3] = " ";
                    derecha[0] = "O";
                    derecha[3] = "U";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.print(Arrays.toString(derecha));
                    break;
                case 2:
                    izquierda[0] = " ";
                    izquierda[1] = " ";
                    derecha[0] = "O";
                    derecha[1] = "L";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                case 3:
                    izquierda[0] = " ";
                    izquierda[2] = " ";
                    derecha[0] = "O";
                    derecha[2] = "C";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                case 4:
                    izquierda[0] = "O";
                    derecha[0] = " ";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                case 5:
                    izquierda[0] = "O";
                    izquierda[3] = "U";
                    derecha[0] = " ";
                    derecha[3] = " ";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                case 6:
                    izquierda[0] = "O";
                    izquierda[1] = "L";
                    derecha[0] = " ";
                    derecha[1] = " ";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                case 7:
                    izquierda[0] = "O";
                    izquierda[2] = "C";
                    derecha[0] = " ";
                    derecha[2] = " ";
                    System.out.println("Movimientos realizados: ");
                    System.out.print(Arrays.toString(izquierda));
				    System.out.print(" >>> ");
				    System.out.println(Arrays.toString(derecha));
                    break;
                default:
                    System.out.println("Has decidido terminar el juego");
                    bandera = false;
                    break;
            }
        }
       //caso 
        if((derecha[0].equals("O"))&&(derecha[1].equals("L"))&&(derecha[2].equals("C"))&&derecha[3].equals("U")){
        System.out.println("Has ganado el juego");
        System.out.println("Se presentan los resultados");
        System.out.print(Arrays.toString(izquierda));
        System.out.print(" >>> ");
        System.out.println(Arrays.toString(derecha));
        bandera = false;
    }
 }
}
