package BusinessLogic;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataAccess.LocalidadDAC;
import Framework.AppException;
import BusinessLogic.Entities.Localidad;


public class LocalidadCantonBL {
    public List<Localidad> getAllCanton( ) throws AppException{
        try {
            LocalidadDAC LocalidadDAC = new LocalidadDAC();  
            List<Localidad> localidad = new ArrayList<Localidad>();
            ResultSet rs = LocalidadDAC.getAllCanton();
            while(rs.next())    {
                Localidad l = new Localidad(rs.getInt("ID_LOCALIDAD")
                                            ,rs.getInt("ID_LOCALIDAD_PADRE")
                                            , rs.getInt("ID_LOCALIDAD_TIPO")
                                            , rs.getString("NOMBRE")
                                            , rs.getString("OBSERVACION")
                                            , rs.getString("FECHA_CREACION")
                                            , rs.getString("FECHA_MODIFICA")
                                            ,rs.getString("ESTADO")); ;
                localidad.add(l);
            }
            return localidad;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCanton");
        }
    } 
   
}