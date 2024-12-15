package SistemaThrowTrash;
import javax.swing.*;

import java.awt.*;

public class PantallaAcceso {
    

    public PantallaAcceso() {
        JFrame frame = new JFrame("Iniciar Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Usuario:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Contraseña:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Iniciar Sesión");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel());
        panel.add(loginButton);

        frame.add(panel);
        frame.setVisible(true);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());


            if (username.equals("pepito perez") && password.equals("1234")) {
                frame.dispose();
                new ZonaSeleccion();
            } else {
                JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
