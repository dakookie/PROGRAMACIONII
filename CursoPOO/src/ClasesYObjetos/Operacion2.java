package ClasesYObjetos;


public class Operacion2 {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    //Metodo para pedirle al usuario que nos dijite 2 numeros
    //Metodos: Parametros y argumentos
    //el parametro se pone en la declaracion del metodo
    // elargumento se pone en la invocacion del mentod
   
    public void sumar(int numero1, int numero2){
       suma = numero1+numero2;
    }
    public void restar(int numero1, int numero2){
        resta = numero1-numero2;
    }
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1*numero2;
    }
    public void dividr(int numero1, int numero2){
        division = numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
