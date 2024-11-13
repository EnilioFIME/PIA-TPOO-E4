import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Inicio extends JFrame {

    public Inicio() {
        setTitle("Aplicación de Gestión");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();

        pestañas.addTab("Asistencias", new PanelAsistencias());
        pestañas.addTab("Usuarios", new PanelUsuarios());
        pestañas.addTab("Entrenadores", new PanelEntrenadores());
        pestañas.addTab("Clases", new PanelClases());
        pestañas.addTab("Máquinas", new PanelMaquinas());
        pestañas.addTab("Pagos", new PanelPagos());

        add(pestañas);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Inicio());
    }
}
