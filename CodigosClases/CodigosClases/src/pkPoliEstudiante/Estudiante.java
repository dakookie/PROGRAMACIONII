package pkPoliEstudiante;

public class Estudiante {
    //todas las propiedades que van en el class deben ser privados
    private String nombre;
    private Boolean depre;
    private int codigo;

    //Los constructores siempre deben ser publicos
    //Constructor
    //public Estudiante(){

    //}
    //Constructor
    public Estudiante(int codigo, String nombre, Boolean depre){
        this.nombre = nombre;
        this.depre = depre;
        this.codigo = codigo;
    }

    //Metodo
    public void ShowMe() {
        System.out.println("codigo = " + codigo);
        System.out.println("nombre = " + nombre);
        System.out.println("depre  = " + depre);
    }
}
