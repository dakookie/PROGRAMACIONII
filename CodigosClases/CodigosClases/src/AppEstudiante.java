import java.util.ArrayList;
import java.util.List;

import pkPoliEstudiante.Estudiante;
/**
 * @author: dakookie
 * @date: 15.dic.2022
 * @version: 1.1
 * Cadenas de datos
 */
public class AppEstudiante {
     /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
    */
    public static void main(String[] args) {
       
        List<Estudiante> lsProg = new ArrayList<>();
        //Estudiante badBunny = new Estudiante();
        //Estudiante poliEstu = new Estudiante(1, "PepaPig", false);
        Estudiante poliEstu1 = new Estudiante(1, "poliEstu1",false);
        // Estudiante poliEstu2 = new Estudiante(2, "Pepe",false);
        // Estudiante poliEstu3 = new Estudiante(3, "Fabian",false);
        
        //poliEstu.ShowMe();

        // lsProg.add(poliEstu1);
        // lsProg.add(poliEstu2);
        // lsProg.add(poliEstu3);

        lsProg.add(new Estudiante(1, "Lola",false));
        lsProg.add(new Estudiante(2, "Pepe",false));
        lsProg.add(poliEstu1);
        lsProg.add(new Estudiante(3, "Fabian",false));
        
        lsProg.add(1, new Estudiante(11, "atrazado",false));

        lsProg.remove(poliEstu1);

        // for (Estudiante estudiante : lsProg) {
        //     estudiante.ShowMe();
        //     System.out.println(" ----- ");
        // }
    }
}
