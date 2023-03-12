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
    public List<Login> GetAllLogin( ) throws AppException{
        try {
            LoginDAC LoginDAC = new LoginDAC();  
            List<Login> Login = new ArrayList<Login>();
            ResultSet rs = LoginDAC.getAllLogin();
            while(rs.next())    {
                BusinessLogic.Entities.Login p = new Login(0, rs.getString("USUARIO"), rs.getString("CONTRASENIA")); ;
                Login.add(p);
            }
            return Login;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    } 

}