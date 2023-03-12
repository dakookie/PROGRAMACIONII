package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import DataAccess.LoginDAC;
import Framework.AppException;
import BusinessLogic.Entities.Login;

public class LoginBL {
    public List<Login> dsGetAllUsuarios()  throws AppException{
        try{
            LoginDAC dsUsuariosDAC = new LoginDAC();
            List<Login> dsUsuario = new ArrayList<Login>();
            ResultSet rs = dsUsuariosDAC.dsGetAllUsuarios();
            while(rs.next()){
                Login usuarios = new LoginBL(rs.getString("DS_USUARIOS"),rs.getString("DS_CONTRASENIA"));
                dsUsuario.add(usuarios);
            }
            return dsUsuario;
        }
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }

}