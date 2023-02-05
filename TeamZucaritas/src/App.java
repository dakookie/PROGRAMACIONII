import BusinessLogic.*;
import BusinessLogic.Entities.Localidad;
import Framework.AppConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        AppConfiguration.load("src/config.properties"); 
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.print("ID\t\t");
        System.out.print("ID_PADRE\t");
        System.out.print("ID_TIPO\t\t");
        System.out.print("NOMBRE\t\t");
        System.out.println("ESTADO");

        try {
            LocalidadPaisBL pais = new LocalidadPaisBL();
            for (Localidad p : pais.getAllPais()) {
                System.out.print(p.getId() + "\t\t");
                System.out.print(p.getIdPadre() + "\t\t");
                System.out.print(p.getTipo() + "\t\t");
                System.out.print(p.getNombre() + "\t\t");
                System.out.println(p.getEstado());
            }
        } catch (Exception e) {

        }

        try {
            LocalidadProvinciaBL provincia = new LocalidadProvinciaBL();
            for (Localidad p : provincia.getAllProvincia()) {
                System.out.print(p.getId() + "\t\t");
                System.out.print(p.getIdPadre() + "\t\t");
                System.out.print(p.getTipo() + "\t\t");
                System.out.print(p.getNombre() + "\t\t");
                System.out.println(p.getEstado());
            }
        } catch (Exception e) {

        }

        try {
            LocalidadCantonBL canton = new LocalidadCantonBL();
            for (Localidad p : canton.getAllCanton()) {
                System.out.print(p.getId() + "\t\t");
                System.out.print(p.getIdPadre() + "\t\t");
                System.out.print(p.getTipo() + "\t\t");
                System.out.print(p.getNombre() + "\t\t");
                System.out.println(p.getEstado());
            }
        } catch (Exception e) {

        }

        try {
            LocalidadParroquiaBL parroquia = new LocalidadParroquiaBL();
            for (Localidad p : parroquia.getAllParroquia()) {
                System.out.print(p.getId() + "\t\t");
                System.out.print(p.getIdPadre() + "\t\t");
                System.out.print(p.getTipo() + "\t\t");
                System.out.print(p.getNombre() + "\t\t");
                System.out.println(p.getEstado());
            }
        } catch (Exception e) {

        }

        System.out.println("CHOCOLATES??? PORFI...!");
    }
}
