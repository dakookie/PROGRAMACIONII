package UserInterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class OtraVentana extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Connection conn;

    public OtraVentana() {
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
        loginButton = new JButton("Iniciar sesión");

        // Conectar a la base de datos
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:DBExamen.db");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Configurar el botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
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
        panel.add(loginButton);
        panel.setBackground(Color.ORANGE);

        // Agregar el panel a la ventana
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String username = userField.getText();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Verificar si el usuario y la contraseña son correctos
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM usuarios WHERE username = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // El usuario y la contraseña son correctos
                JOptionPane.showMessageDialog(this, "Bienvenido, " + username + "!", "Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Cerrar la ventana de inicio de sesión
                // Aquí puedes abrir la ventana principal de la aplicación
            } else {
                // El usuario y la contraseña son incorrectos
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                passwordField.setText(""); // Borrar la contraseña ingresada
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al consultar la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}