package BusinessLogic.Entities;

public class Login {
    private int DS_ID_USUARIOS;
    private String DS_USUARIOS;
    private String DS_CONTRASENIA;

    public Login(int dS_ID_USUARIOS, String dS_USUARIOS, String dS_CONTRASENIA) {
        DS_ID_USUARIOS = dS_ID_USUARIOS;
        DS_USUARIOS = dS_USUARIOS;
        DS_CONTRASENIA = dS_CONTRASENIA;
    }

    public int getDS_ID_USUARIOS() {
        return DS_ID_USUARIOS;
    }

    public void setDS_ID_USUARIOS(int dS_ID_USUARIOS) {
        DS_ID_USUARIOS = dS_ID_USUARIOS;
    }

    public String getDS_USUARIOS() {
        return DS_USUARIOS;
    }

    public void setDS_USUARIOS(String dS_USUARIOS) {
        DS_USUARIOS = dS_USUARIOS;
    }

    public String getDS_CONTRASENIA() {
        return DS_CONTRASENIA;
    }

    public void setDS_CONTRASENIA(String dS_CONTRASENIA) {
        DS_CONTRASENIA = dS_CONTRASENIA;
    }
   
}
