package SistemaThrowTrash;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ZonaSeleccion {

    private final Map<String, String> horarios;

    public ZonaSeleccion() {
        horarios = new HashMap<>();
        inicializarHorarios();

        JFrame frame = new JFrame("Seleccionar Zona");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        JLabel label = new JLabel("Seleccione su zona:", SwingConstants.CENTER);

        String[] zonas = {"Zona 1: Suba y Usaquén", "Zona 2: Engativá, Chapinero, Teusaquillo y Barrios Unidos",
                "Zona 3: Santafé, San Cristóbal, Tunjuelito, Fontibón, Antonio Nariño, Puente Aranda, Rafael Uribe Uribe, Mártires y La Candelaria",
                "Zona 4: San Cristóbal, Usme, Tunjuelito, Kennedy, Puente Aranda, Rafael Uribe Uribe y Ciudad Bolívar"};

        JComboBox<String> zonaComboBox = new JComboBox<>(zonas);
        JButton confirmarButton = new JButton("Confirmar");

        panel.add(label); 
        panel.add(zonaComboBox);
        panel.add(new JLabel());
        panel.add(confirmarButton);

        frame.add(panel);
        frame.setVisible(true);

        confirmarButton.addActionListener(e -> {
            String seleccion = (String) zonaComboBox.getSelectedItem();
            if (seleccion != null) {
                JOptionPane.showMessageDialog(frame, horarios.get(seleccion), "Horario de Recolección", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void inicializarHorarios() {
        horarios.put("Zona 1: Suba y Usaquén", "Lunes y Jueves a las 10:00 AM");
        horarios.put("Zona 2: Engativá, Chapinero, Teusaquillo y Barrios Unidos", "Martes y Viernes a las 4:30 PM");
        horarios.put("Zona 3: Santafé, San Cristóbal, Tunjuelito, Fontibón, Antonio Nariño, Puente Aranda, Rafael Uribe Uribe, Mártires y La Candelaria", "Miércoles y Sábados a las 12:00 PM");
        horarios.put("Zona 4: San Cristóbal, Usme, Tunjuelito, Kennedy, Puente Aranda, Rafael Uribe Uribe y Ciudad Bolívar", "Domingos y Miércoles a las 2:00 PM");
    }
}
