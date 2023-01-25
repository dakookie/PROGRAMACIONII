package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccesComponent {
    //Metodo que permite establecer la conexion a la base de datos
    private Connection connSQLITE(){
        String url = "jdbc:sqlite:data\\TinderPet.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    //Metodo que permite sacar la informacion de la base de datos
    public void selectPersona(){
        String sql = "SELECT ID,   NOMBRE,   APELLIDO FROM PERSONA";
        try (  Connection conn = this.connSQLITE();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("--------------------------------");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getPersonaID(int Id) {
        String sql = "SELECT ID,   NOMBRE,   APELLIDO " 
                     + "FROM PERSONA " 
                     + "WHERE ID = ? ";
        try (  Connection conn = this.connSQLITE();
               PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, Id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findPersonaNombre(String Nombre) {  // nombre --juan--
        String sql = "SELECT ID,   NOMBRE,   APELLIDO " 
                     + "FROM PERSONA " 
                     + "WHERE NOMBRE LIKE '%" +Nombre +"%' ";
        try ( Connection conn = this.connSQLITE();
              Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sql)){
           

            while (rs.next()) {
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("--------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
