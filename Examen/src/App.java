import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    String dsuserEstudiante = "damaris.suquillo@epn.edu.ec", dsuserProfesor = "profe", dsclaveProfesor="1234", dsclaveEstudiante="1754021101";
    static Scanner sc = new Scanner(System.in);
    public static boolean dsLoginDamaris(String dsuserEstudiante, String dsuserProfesor, String dsclaveProfesor, String dsclaveEstudiante ){
        int intentos = 0;
        boolean bandera = true;
        while(bandera ==  true){
            if(intentos < 3 && bandera == true){    
                System.out.println("NETWORKIN DE" + dsuserEstudiante);
                System.out.println("Ingrese el usuario y clave del estudiante");
                System.out.println("********");
                System.out.print("usuario:  ");
                dsuserEstudiante = sc.nextLine();
                System.out.print("clave:    ");
                dsclaveEstudiante = sc.nextLine();
                System.out.println("Ingrese el usuario y clave del docente");
                System.out.println("********");
                System.out.print("usuario:  ");
                dsuserProfesor = sc.nextLine();
                System.out.print("clave:   ");
                dsclaveProfesor = sc.nextLine();
                intentos = intentos + 1;
                System.out.println("Bienvenido " + dsuserProfesor.toUpperCase());


            }else{
                System.out.println("Clave y usuarios incorrectos");
            }
        }
        return bandera;
    }

    public static void dsMenu(String dsuserEstudiante){
        //Atributos
        List<String> lisNombres = new ArrayList<>();

        //add --> añadir cosas a la lista
        lisNombres.add("1. Agregar Amigo");
        lisNombres.add("2. Agregar amigo de amigo");
        lisNombres.add("3. Mostrar Network");
        lisNombres.add("0. Salir");
     
        System.out.println("----------------------------------------------");
        System.out.println("NETWORKIN DE damaris.suquillo@epn.edu.ec");
        System.out.println("----------------------------------------------");
        //Para imprimir una lista
        for(String n: lisNombres){
            System.out.println(n);
        }

        String dsCodigo = "2021192";
        String dsNombre;
        int dsEdad = 0;
        String dsSexo = null;
        int opcion;
        System.out.println("Ingresa una opcion");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("NETWORKIN DE " + dsuserEstudiante);
                System.out.println("-----------------------------");
                System.out.println("Usuario: PROFE ");
                System.out.println("AGREGAR AMIGO");
                System.out.println("Por favor registra:");
                System.out.println("Codigo: ");
                dsCodigo = sc.nextLine();
                System.out.println("Nombre o nick: ");
                dsNombre = sc.nextLine();
                while(dsEdad <= 0){
                    System.out.println("Edad: ");
                    dsEdad = sc.nextInt();
                }
                while(dsSexo != "F" ||dsSexo != "M"){
                    System.out.println("Sexo: ");
                    dsSexo = sc.nextLine().toUpperCase();
                }
                break;
            case 2:
                System.out.println("-----------------------------");
                System.out.println("NETWORKIN DE " + dsuserEstudiante);
                System.out.println("-----------------------------");
                System.out.println("Usuario: " + dsuserEstudiante);
                System.out.println("AGREGAR UN AMIGO A TU AMIGO");
                System.out.println("Cual es el ID  de tu amigo");
                System.out.println("Por favor registra:");
                System.out.println("Codigo: ");
                dsCodigo = sc.nextLine();
                System.out.println("Nombre o nick: ");
                dsNombre = sc.nextLine();
                while(dsEdad <= 0){
                    System.out.println("Edad: ");
                    dsEdad = sc.nextInt();
                }
                System.out.println("Sexo: ");
                dsSexo = sc.nextLine().toUpperCase();
            
                break;
            case 0:
                System.out.println("Saliendo del sistema");
                break;
        
            default:
                break;
        }
    }
    
    public static void main(String[] args){
        //Atributos
        
        dsLoginDamaris("Damaris", "profe", "1234", "1754021101");
        dsMenu("damaris.suquillo@epn.edu.ec");

        
    }
    
}
