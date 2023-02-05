package BusinessLogic.Entities;

public class Localidad {
    private int id;
    private int tipo;
    private int idPadre;
    private String nombre;
    private String estado;

    public Localidad(int id, int tipo, int idPadre, String nombre, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.idPadre = idPadre;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
        
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
