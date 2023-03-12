package BusinessLogic.Entities;

public class Coordenadas {
    private int DS_CAPACIDAD;
    private String DS_GEO;
    private String DS_TIPO_ARSENAL;
    
    public int getDS_CAPACIDAD() {
        return DS_CAPACIDAD;
    }
    public void setDS_CAPACIDAD(int dS_CAPACIDAD) {
        DS_CAPACIDAD = dS_CAPACIDAD;
    }
    public String getDS_GEO() {
        return DS_GEO;
    }
    public void setDS_GEO(String dS_GEO) {
        DS_GEO = dS_GEO;
    }
    public String getDS_TIPO_ARSENAL() {
        return DS_TIPO_ARSENAL;
    }
    public void setDS_TIPO_ARSENAL(String dS_TIPO_ARSENAL) {
        DS_TIPO_ARSENAL = dS_TIPO_ARSENAL;
    }
    public Coordenadas(int dS_CAPACIDAD, String dS_GEO, String dS_TIPO_ARSENAL) {
        DS_CAPACIDAD = dS_CAPACIDAD;
        DS_GEO = dS_GEO;
        DS_TIPO_ARSENAL = dS_TIPO_ARSENAL;
    }

}
