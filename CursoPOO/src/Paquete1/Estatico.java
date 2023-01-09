//Miembros estaticos de una clase(ultimo cambio hecho se queda grabado, si cambio en la clase se cambian en los objetos, 
// si cambio en los obketos se cambian en las clases)

package Paquete1;

public class Estatico {

    //Atributo estatico
    private static String frase = "Primera frase";

    //Metodo estatico
    public static int sumar(int n1, int n2) {
        int suma = n1+n2;
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(3, 4));
        
    }
}
