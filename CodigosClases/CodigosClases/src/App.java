import pkHerencia.Hijo;
import pkHerencia.Padre;

public class App {
    public static void main(String[] args) {
        Padre p1 = new Padre(); //Instanciando
        Padre p2 = new Padre("pepe"); //Instanciando
        Padre p3 = new Padre("juanita","Quimico","M",23); //Instanciando

        Hijo h1 = new Hijo("ANA");
        Padre h3 = new Hijo("juanita","Quimico","F",23); //Instanciando
        h1.presentarse();

        //p1.presentarse();
        //p2.presentarse();
        //p3.presentarse();
        
    }
}
