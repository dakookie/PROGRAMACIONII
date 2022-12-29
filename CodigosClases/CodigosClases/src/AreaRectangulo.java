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
     
     public static void main(String[] args) {
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
    */

    public static void main(String[] args) {

        //Metodos
        //calcularAreaRect();
        //showSignosAlternos();
        //drawLetraC();
        int tamano = 5;

        for (int f = 0; f < tamano; f++) {
           for (int c = 0; c < tamano; c++)
              if (f == 0 || c == 0 || f == tamano-1 || c == tamano-1) 
              System.out.print(((c+f)%2==0)?"+ ":"- ");
              else
              System.out.println(" ");
              System.out.println(" ");
           
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
