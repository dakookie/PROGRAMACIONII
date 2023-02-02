package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.APP;
import Framework.AppConfiguration;
import Framework.AppException;

public class LocalidadDAC extends SQLiteDataHelper {

    public LocalidadDAC() {
        super(AppConfiguration.getDBPathConnection());
    }
    public ResultSet getAllPais() throws AppException{
        try {
            String sql = "SELECT * FROM LOCALIDAD" +
                          "WHERE ID_LOCALIDAD_TIPO = NULL";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }
    /*
    public ResultSet getPaisById(int IDPais) throws AppException  {
        try {
            String sql = "SELECT ID_LOCALIDAD, NOMBRE * FROM LOCALIDAD "+
                        "WHERE ID_LOCALIDAD_TIPO = NULL " +
                        "AND ID_LOCALIDAD = ? ";

            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setInt(1, IDPais);
            //System.out.println(sql);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, "getPaisById()");
        }
    }
    */
    public ResultSet getAllProvincia() throws AppException{
        try {
            String sql = "SELECT * FROM LOCALIDAD" +
                          "WHERE ID_LOCALIDAD_TIPO = 1";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllProvincia()");
        }
    }
    /*
    public ResultSet getProviniciaById(int IDPais) throws AppException  {
        try {
            String sql = "SELECT ID_LOCALIDAD, NOMBRE * FROM LOCALIDAD "+
                        "WHERE ID_LOCALIDAD_TIPO = 1 " +
                        "AND ID_LOCALIDAD = ? ";

            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setInt(1, IDPais);
            //System.out.println(sql);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, "getPaisById()");
        }
    }
    */
    public ResultSet getAllCanton() throws AppException{
        try {
            String sql = "SELECT * FROM LOCALIDAD" +
                          "WHERE ID_LOCALIDAD_TIPO = 2";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCanton()");
        }
    }
   
    public ResultSet getAllParroquia() throws AppException{
        try {
            String sql = "SELECT * FROM LOCALIDAD" +
                          "WHERE ID_LOCALIDAD_TIPO = 3";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllParroquia()");
        }
    }

}
