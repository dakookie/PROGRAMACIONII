import java.util.Scanner;
import pkHorario.Horario;

public class App {
    public static void main(String[] args) throws Exception {
        // Definicion de variables
        Scanner sc = new Scanner (System.in);
        String close = "no"; // Cierra el Do-While
        String name;
        String id;
        String subject;
        

       // Deber Horario
       Horario e1= new Horario();
       e1.mostrar();
       
       System.out.println("Bienvenid@ al SAEW");
       System.out.println("Ingrese su nombre");
       name = sc.nextLine();
       System.out.println("Ingrese su codigo unico");
       id = sc.nextLine();

       // LLamada al constructor
       Horario e2= new Horario(name, id );
       e2.presentarse();
       /* 
       do {
        System.out.println("Ingrese la materia a registrar");
        subject = sc.nextLine();
        System.out.println("Quiere finalizar?");
        close = sc.nextLine();
       } while (close.equals("no") && name != null && id != null);
        */
       while (close.equals("no") && name != null && id != null){
        System.out.println("Ingrese la materia a registrar");
        subject = sc.nextLine();
        System.out.println("Quiere finalizar?");
        close = sc.nextLine();
       }
    }
}
