package Ejercicio6;

public class NumerosComplejos {
    // 3 + 4i
    //Atributos
    private double a; // Parte real
    private double b; // Parte imaginaria
    

    //Constructor
    public NumerosComplejos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    /*
     * numero1 = 3 + 4i
     * numero2 = 2 + 5i
     * 
     * suma = 5 + 9i
     * 
     * NumerosComplejos numero1 = new NumerosComplejos(3,4);
     * numero1.calcularSuma(numero2);
     */

     public NumerosComplejos calcularSuma(NumerosComplejos c){
        NumerosComplejos suma = new NumerosComplejos(a+c.getA(), b+c.getB());
        return suma;
     }
     /*
      * numero1 = 3 + 4i
      * numero2 = 2 + 5i
      * 
      * mult = (3*2 - 4*5) + (3*5 + 4*2)i
      */

     public NumerosComplejos calcularMultiplicacion(NumerosComplejos c){
        NumerosComplejos mult = new NumerosComplejos((a*c.getA()- b*c.getB()), (a*c.getB()+b*c.getA()));
        return mult;
     }
     /*
      * numero1 = 3 + 4i
      * numero2 = 3 + 4i
         
      */
      public boolean comprobarIgualdad(NumerosComplejos c){
        boolean igualdad = false;
        if(a==c.getA() && b == c.getB()){
            igualdad = true;
        }
        return igualdad;
      }
      /*
       * numeroComplejo = 3 + 4i
       * entero = 2;
       * 
       * mult = 6 + 8i;
       */
      public NumerosComplejos multiplicarPorEntero(int x){
        NumerosComplejos mult = new NumerosComplejos(a*x, b*x);
        return mult;
      }



}
