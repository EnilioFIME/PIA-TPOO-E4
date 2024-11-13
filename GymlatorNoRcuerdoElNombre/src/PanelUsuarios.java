import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelUsuarios extends JPanel {

    public PanelUsuarios() {
        // Configuración del panel
        setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("Sección de Usuarios", JLabel.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        add(etiqueta, BorderLayout.CENTER);
        setBorder(new EmptyBorder(10, 10, 10, 10));
    }
}
