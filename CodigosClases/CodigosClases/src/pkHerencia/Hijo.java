package pkHerencia;

public class Hijo extends Padre {
    //String Nombre;
    //Constructor
    public Hijo(String nombreHijo) {
        super(nombreHijo); //Envío a padre
        // this --> se utiliza para al misma clase
    }

    public Hijo(String nombre, String ocupacion, String sexo, int edad) {
        super(nombre, ocupacion, sexo, edad);
    }
}
