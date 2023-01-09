package Ejercicio2;

public class Tablero {
    //Atributos
    private int x;

    private int y;

    //Metodos

    //Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento){
        y += incremento;
    }

    public void moverAbajo(int incremento){
        y -= incremento;
    }

    public void moverDerecha(int incremento){
        x += incremento;
    }

    public void moverIzquiera(int incremento){
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    




}
