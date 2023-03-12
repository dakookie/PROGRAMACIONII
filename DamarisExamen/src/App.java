import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);
        int intentosFallidos = 0;
        boolean autenticado = false;

        try {
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:sqlite:DBLogin.db");

            while (!autenticado && intentosFallidos < 3) {
                // Solicitar al usuario que ingrese su nombre de usuario y contraseña
                System.out.print("Nombre de usuario: ");
                String nombreUsuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String contraseña = scanner.nextLine();

                // Verificar que el nombre de usuario y la contraseña ingresados correspondan a uno de los tres usuarios permitidos
                stmt = conn.createStatement();
                rs = stmt.executeQuery("SELECT * FROM usuarios WHERE DS_USUARIOS = '" + nombreUsuario + "' AND DS_CONTRASENIA = '" + contraseña + "'");

                if (rs.next()) {
                    autenticado = true;
                    System.out.println("Bienvenido, " + nombreUsuario + "!");
                } else {
                    intentosFallidos++;
                    System.out.println("Credenciales incorrectas. Intente de nuevo.");
                }
            }

            if (intentosFallidos == 3) {
                System.out.println("Ha agotado sus intentos. Terminando el programa.");
            }

        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            // Cerrar los objetos ResultSet, Statement y Connection en orden inverso
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
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

