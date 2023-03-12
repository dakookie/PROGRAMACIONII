import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.*;

public class App {

  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Scanner scanner = new Scanner(System.in);

    try {
      // Conectar a la base de datos
      conn = DriverManager.getConnection("jdbc:sqlite:DBExamen.db");

      // Pedir al usuario que ingrese su nombre de usuario y contraseña
      System.out.print("Usuario: ");
      String username = scanner.nextLine();
      System.out.print("Contraseña: ");
      String password = scanner.nextLine();

      // Realizar la consulta
      String sql = "SELECT * FROM Login WHERE DS_USUARIOS = ? AND DS_CONTRASENIA = ?";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, username);
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();

      // Verificar si el usuario existe y si la contraseña es correcta
      if (rs.next()) {
        System.out.println("Bienvenido, " + username + "!");
      } else {
        System.out.println("Credenciales incorrectas. Intente de nuevo.");
      }
    } catch (SQLException e) {
      System.err.println("Error al conectar con la base de datos: " + e.getMessage());
    } finally {
      // Cerrar los objetos ResultSet, PreparedStatement y Connection en orden inverso
      try {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException e) {
        System.err.println("Error al cerrar los objetos de base de datos: " + e.getMessage());
      }
    }
  }
}

