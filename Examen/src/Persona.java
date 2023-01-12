import java.util.ArrayList;
import java.util.List;

public class Persona extends Integrante{

    private String dsApellido;
    

    public Persona(int dsID, String dsNombre, String dsApellido){
        super(dsID, dsNombre, dsApellido);
        this.dsApellido = dsApellido;
    }

    public void newdsPersona(Persona p){
        List<Persona> lisPersona = new ArrayList<>();

        for (int i = 0; i < 10; i++) {        
        Persona per = new Persona();
        per.setCodigo(i);
        per.setNombre("Nombre: " + i);
        per.setApellido("Apellido: " + i);
        per.setEdad(25 + i);
        lisPersona.add(per);
        }
        System.out.println("Nombre: " + getDsNombre() + "\nApellido: " + dsApellido + "\nID: " + getDsID());
    }
    


}