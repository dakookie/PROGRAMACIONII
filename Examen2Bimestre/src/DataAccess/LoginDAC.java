package DataAccess;

//import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class LoginDAC extends SQLiteDataHelper {
    public LoginDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllUsuarios() throws AppException{
        try {
            String sql =    "SELECT AM_ID_USUARIOS, AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA FROM USUARIOS ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllUsuarios()");
        }
    }

}
