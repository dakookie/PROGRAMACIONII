package UserInterface;
import javax.swing.*;

import Framework.AppConfiguration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
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
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar los componentes de la interfaz gráfica
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton("Iniciar Sesion");
        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login();
            }
        });

        // Configurar el panel y agregar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(emojiButton);
        panel.setBackground(Color.GRAY);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }
    
    private void Login() {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);
        int intentosFallidos = 0;
        boolean autenticado = false;

        try {
            // Establecer la conexión con la base de datos

            while (!autenticado && intentosFallidos < 3) {
                // Solicitar al usuario que ingrese su nombre de usuario y contraseña
                System.out.print("Nombre de usuario: ");
                String nombreUsuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String contraseña = scanner.nextLine();

                // Verificar que el nombre de usuario y la contraseña ingresados correspondan a uno de los tres usuarios permitidos
                stmt = (Statement) conn.createStatement();
                rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM LOGIN WHERE DS_USUARIOS = '" + nombreUsuario + "' AND DS_CONTRASENIA = '" + contraseña);

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
                    ((Connection) stmt).close();
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
