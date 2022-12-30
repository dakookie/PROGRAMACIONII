package pkHerencia;

public class Padre {
    //propiedades
    private String  nombre;
    private String  ocupacion;
    private String  sexo;
    private int     edad;

    //Constructor
    public Padre() {
        nombre     = "Pepe";
        ocupacion  = "Programador";
        sexo       = "M";
        edad       = 20;
    }
    //Constructor + sobrecarga
    // this. --> Propiedades de la clase, siempre que estemos dentro de la clase se utiliza el this
    // para referenciar
    public Padre(String nombre) {
        this.nombre     = nombre;
        this.ocupacion  = "Programador";
        this.sexo       = "M";
        this.edad       = 20;
    }
    public Padre(String nombre, String ocupacion, String sexo, int edad) {
        this.nombre     = nombre;
        this.ocupacion  = ocupacion;
        this.sexo       = sexo;
        this.edad       = edad;
    }
    //Metodos
    public void presentarse() {
        System.out.println(" -------------------------");
        System.out.println(" Yo me llamo : " + nombre);
        System.out.println(" Soy un : " + ocupacion);
        System.out.println(" Sexo : " + sexo);
        System.out.println(" Edad : " + edad);
    }
}
