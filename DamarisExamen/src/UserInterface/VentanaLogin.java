package UserInterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class VentanaLogin extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;

    public VentanaLogin() {
        // Configurar la ventana
        setTitle("Login");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton();


        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(emojiButton);
        panel.setBackground(Color.ORANGE);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
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

    public static void main(String[] args) {
        new VentanaLogin();
    }
}
