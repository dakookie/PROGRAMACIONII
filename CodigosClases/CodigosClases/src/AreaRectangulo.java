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
        int nivel = 5;
        for (int i = 0; i < nivel; i++) {
            for (int d = 0; d < i; d++) 
                System.out.print("  ");
            if(i>0)
               System.out.print("|");
            System.out.println("__");
        }
        System.out.println("");
        //drawCuadrado();
        //int a = 1, b = 2, c = 0;
        //float f = 1;

        //c = suma(a, b);
        //f = suma(a, f);
        //f = suma(f, a);
        //f = suma(f, f);

        //int nroPares = 10;
        //showPares(nroPares);
        //Metodos
        //calcularAreaRect();
        //showSignosAlternos();
        //drawLetraC();
    }

    private static void drawCuadrado() {
        int tamano = 5;

        for (int f = 0; f < tamano; f++) {
            for (int c = 0; c < tamano; c++) 
                if(f==0 || c==0 || f==tamano-1 || c==tamano-1)
                   System.out.print(((c+f)%2==0)?"+ ":"- ");
                else
                   System.out.print("  ");
            System.out.println(" ");
        }
        System.out.println("");
    }

    private static int suma(int a, int f) {
        return a+f;
    }
    private static float suma(int a, float f) {
        return a+f;
    }
    private static float suma(float a, float f) {
        return a+f;
    }

    private static void showPares(int nroPares) {
        for (int i = 0; i < nroPares * 2; i++) {
            if(i % 2 == 0)
              System.out.println(i);
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
