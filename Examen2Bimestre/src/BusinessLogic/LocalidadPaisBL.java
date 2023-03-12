package BusinessLogic;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import DataAccess.LocalidadDAC;
import Framework.AppException;
import BusinessLogic.Entities.Localidad;


public class LocalidadPaisBL {
    public List<Localidad> GetAllLocalidad( ) throws AppException{
        try {
            LocalidadDAC LocalidadDAC = new LocalidadDAC();  
            List<Localidad> localidad = new ArrayList<Localidad>();
            ResultSet rs = LocalidadDAC.getAllPais();
            while(rs.next())    {
                Localidad p = new Localidad(rs.getInt("ID_LOCALIDAD")
                                            ,rs.getInt("ID_LOCALIDAD_PADRE")
                                            , rs.getInt("ID_LOCALIDAD_TIPO")
                                            , rs.getString("NOMBRE")
                                            , rs.getString("OBSERVACION")
                                            , rs.getString("FECHA_CREACION")
                                            , rs.getString("FECHA_MODIFICA")
                                            ,rs.getString("ESTADO")); ;
                localidad.add(p);
            }
            return localidad;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllLocalidad()");
        }
    }

    public Localidad[] getAllPais() {
        return null;
    } 
   
}