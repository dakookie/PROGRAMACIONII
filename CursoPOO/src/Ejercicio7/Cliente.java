package Ejercicio7;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    
    Cuenta cuentas[];
    
    public Cliente(String nombre, String apellido, String cedula, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cuentas = cuentas;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public double consultarSaldo(int n){
        return cuentas[n].getSaldo();
    }

    public void ingresarDinero(int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }

    public void retirarDinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }


    
    

}
