package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataAccess.LoginDAC;
import Framework.AppException;
import BusinessLogic.Entities.Login;

public class LoginBL {
    /**
     * Este metodo nos permite enlistar todos los usuarios de la base de datos
     * @return Retorna la lista de los usuarios que hay en la abse de datos
     * @throws AppException
     */
    public List<Login> dsGetAllUsuarios()  throws AppException{
        try{
            LoginDAC caUserDAC = new LoginDAC();
            List<Login> caUser = new ArrayList<Login>();
            ResultSet rs = caUserDAC.getAllUsuarios();
            while(rs.next()){
                Login caP = new Login(rs.getString("DS_USUARIOS"),rs.getString("DS_CONTRASENIA"));
                caUser.add(caP);
            }
            return caUser;
        }
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
    
}