package Ejercicio4;

import java.util.Scanner;

public class MainAtleta {
    public static int indiceGanador(Atleta atleta[]) {
        float tiempo;
        int indice = 0;
        tiempo = atleta[indice].getTiempo();
        for (int i = 1; i < atleta.length; i++) {
            if(atleta[i].getTiempo() < tiempo){
                tiempo = atleta[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        float tiempo;

        System.out.println("Digite el numero de atletas a participar : ");
        nAtletas = sc.nextInt();

        //Crfeamos los objetos para cada atleta
        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < atletas.length; i++) {
            System.out.println("Digite los datos del atleta: " + (i+1)+":");
            System.out.println("Introduzca el numero de atleta");
            numeroAtleta = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el nombre del atleta: ");
            nombre = sc.nextLine();
            System.out.println("Introduzca el tiempo de carrera: ");
            tiempo = sc.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempo);
        }
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("El atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
        

    }
}
