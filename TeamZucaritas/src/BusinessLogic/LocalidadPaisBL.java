package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.*;
import DataAccess.LocalidadDAC;
import Framework.AppException;

public class LocalidadPaisBL {
    
    public List<Localidad> getAllPais() throws AppException{
        try {
            LocalidadDAC localidadDAC = new LocalidadDAC(); 
            List<Localidad> lstLocalidad = new ArrayList<Localidad>();

            ResultSet rs =  localidadDAC.getAllPais();
            while(rs.next())    {
                Localidad s = new Localidad(rs.getInt("ID_LOCALIDAD"), rs.getInt("ID_LOCALIDAD_TIPO"), rs.getInt("ID_LOCALIDAD_PADRE"),  rs.getString("NOMBRE"),  rs.getString("ESTADO")); 
                lstLocalidad.add(s);
            }
            return lstLocalidad; 
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(),"getAllLocalidad");
        }
    } 

}
