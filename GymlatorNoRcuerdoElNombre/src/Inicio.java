import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.event.*;

public class Inicio extends JFrame {

    public Inicio() {
        // Configuración de la ventana principal
        setTitle("Aplicación de Gestión");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el contenedor de pestañas
        JTabbedPane pestañas = new JTabbedPane();

        // Crear paneles para cada sección
        JPanel panelUsuarios = crearPanel("Usuarios");
        JPanel panelEntrenadores = crearPanel("Entrenadores");
        JPanel panelClases = crearPanel("Clases");
        JPanel panelMaquinas = crearPanel("Máquinas");
        JPanel panelPagos = crearPanel("Pagos");

        // Agregar pestañas al JTabbedPane
        pestañas.addTab("Usuarios", panelUsuarios);
        pestañas.addTab("Entrenadores", panelEntrenadores);
        pestañas.addTab("Clases", panelClases);
        pestañas.addTab("Máquinas", panelMaquinas);
        pestañas.addTab("Pagos", panelPagos);

        // Agregar el JTabbedPane a la ventana principal
        add(pestañas);

        // Mostrar la ventana
        setVisible(true);
    }

    // Método para crear paneles de forma genérica
    private JPanel crearPanel(String titulo) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("Sección de " + titulo, JLabel.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(etiqueta, BorderLayout.CENTER);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        return panel;
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> new Inicio());
    }
}
