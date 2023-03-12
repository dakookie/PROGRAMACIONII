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
    public Login getLoginBL(String usuario, String contrasenia) throws SQLException{
    try {
        LoginDAC login = new LoginDAC();
        ResultSet log = login.getLoginBL(usuario,contrasenia);

    } catch (Exception e) {
        // TODO: handle exception
    }
    }

}