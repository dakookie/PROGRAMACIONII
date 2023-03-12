package DataAccess;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class CoordenadasDAC extends SQLiteDataHelper{
    public CoordenadasDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllCoordenadas() throws AppException{
        try {
            String sql = "SELECT DS_CAPACIDAD, DS_GEO, DS_ARSENAL, DS_FECHA FROM COORDENADAS";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCoordenadas()");
        }
    }
}