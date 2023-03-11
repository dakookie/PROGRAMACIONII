package BusinessLogic;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataAccess.LocalidadDAC;
import Framework.AppException;
import BusinessLogic.Entities.Localidad;


public class LocalidadParroquiaBL {
    
    public List<Localidad> getAllParroquia() throws AppException{
        try {
            LocalidadDAC localidadDAC = new LocalidadDAC(); 
            List<Localidad> Localidad = new ArrayList<Localidad>();
            ResultSet rs =  localidadDAC.getAllParroquia();
            while(rs.next())    {
                Localidad l = new Localidad(rs.getInt("ID_LOCALIDAD")
                                            ,rs.getInt("ID_LOCALIDAD_PADRE")
                                            , rs.getInt("ID_LOCALIDAD_TIPO")
                                            , rs.getString("NOMBRE")
                                            , rs.getString("OBSERVACION")
                                            , rs.getString("FECHA_CREACION")
                                            , rs.getString("FECHA_MODIFICA")
                                            ,rs.getString("ESTADO")); ;
                Localidad.add(l);
            }
            return Localidad; 
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(),"getAllParroquia");
        }
    } 
}
