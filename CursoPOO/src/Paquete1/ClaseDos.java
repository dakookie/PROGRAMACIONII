package Paquete1;

public class ClaseDos {
    public static void main(String[] args) {
        ClaseUno objeto1 = new ClaseUno();
        
        objeto1.setEdad(19);
        System.out.println("La edad es " + objeto1.getEdad());

        objeto1.setNombre("Damaris");
        System.out.println("Mi nombre es: " + objeto1.getNombre());
    }
}
