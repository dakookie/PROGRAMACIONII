package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.APP;
import Framework.AppConfiguration;
import Framework.AppException;

public class LoginDAC extends SQLiteDataHelper {

    public LoginDAC() {
        super(AppConfiguration.getDBPathConnection());
    }
    public ResultSet getAllLogin() throws AppException{
        try {
            String sql = "SELECT * FROM Login" +
                         "WHERE DS_ID_USUARIOS = ?";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllLogin()");
        }
    }

}
