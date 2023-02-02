package BusinessLogic.Entities;

public class Localidad {
    private int ID_LOCALIDAD;
    private int ID_LOCALIDAD_PADRE;
    private int ID_LOCALIDAD_TIPO;
    private String NOMBRE;
    private String OBSERVACION;
    private String FECHA_CREACION;
    private String FECHA_MODIFICA;
    private String ESTADO;

    

    public Localidad(int ID_LOCALIDAD, int ID_LOCALIDAD_PADRE, int ID_LOCALIDAD_TIPO, String NOMBRE, String OBSERVACION, String FECHA_CREACION, String FECHA_MODIFICA, String ESTADO) {
        this.ID_LOCALIDAD = ID_LOCALIDAD;
        this.ID_LOCALIDAD_PADRE = ID_LOCALIDAD_PADRE;
        this.ID_LOCALIDAD_TIPO = ID_LOCALIDAD_TIPO;
        this.NOMBRE = NOMBRE;
        this.OBSERVACION = OBSERVACION;
        this.FECHA_CREACION = FECHA_CREACION;
        this.FECHA_MODIFICA = FECHA_MODIFICA;
        this.ESTADO = ESTADO;
    }

    public int getID_LOCALIDAD() {
        return ID_LOCALIDAD;
    }

    public void setID_LOCALIDAD(int iD_LOCALIDAD) {
        ID_LOCALIDAD = iD_LOCALIDAD;
    }

    public int getID_LOCALIDAD_PADRE() {
        return ID_LOCALIDAD_PADRE;
    }

    public void setID_LOCALIDAD_PADRE(int iD_LOCALIDAD_PADRE) {
        ID_LOCALIDAD_PADRE = iD_LOCALIDAD_PADRE;
    }

    public int getID_LOCALIDAD_TIPO() {
        return ID_LOCALIDAD_TIPO;
    }

    public void setID_LOCALIDAD_TIPO(int iD_LOCALIDAD_TIPO) {
        ID_LOCALIDAD_TIPO = iD_LOCALIDAD_TIPO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }

    public String getOBSERVACION() {
        return OBSERVACION;
    }

    public void setOBSERVACION(String oBSERVACION) {
        OBSERVACION = oBSERVACION;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String fECHA_CREACION) {
        FECHA_CREACION = fECHA_CREACION;
    }

    public String getFECHA_MODIFICA() {
        return FECHA_MODIFICA;
    }

    public void setFECHA_MODIFICA(String fECHA_MODIFICA) {
        FECHA_MODIFICA = fECHA_MODIFICA;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String eSTADO) {
        ESTADO = eSTADO;
    }
}
