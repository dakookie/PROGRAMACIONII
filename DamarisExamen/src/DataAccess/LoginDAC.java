package DataAccess;

//import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class LoginDAC extends SQLiteDataHelper {
    
    public LoginDAC() {
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet dsGetAllUsuarios() throws AppException{
        try{
            String sql="SELECT *"
                        +"FROM DS_USUARIOS";
            return getResultSet(sql);
        }
        catch (SQLException e){
            throw new AppException(e, getClass(), "dsgetAllUsuarios()");
        }
    }
}
