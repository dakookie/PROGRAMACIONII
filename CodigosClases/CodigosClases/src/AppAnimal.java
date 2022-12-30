import pkDakookieAnimal.Arana;
import pkDakookieAnimal.Iguana;

/**
 * @author: dakookie
 * @date: 15.dic.2022
 * @version: 1.1
 * Cadenas de datos
 */
public class AppAnimal {
    /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception
    */
    public static void main(String[] args) {
        Iguana i = new Iguana();
        Arana a  = new Arana();

        i.nombre="perrita";
        i.SayTuNombre();
        a.SayTuNombre();
    }
}
