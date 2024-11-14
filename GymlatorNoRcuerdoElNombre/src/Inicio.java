import javax.swing.*;

import java.awt.*;
import java.sql.Connection;

public class Inicio extends JFrame {

    public Inicio() {

        //Inicia la ventana del programa y que cierre el programa en cuanto se sale de este
        setTitle("Aplicación de Gestión");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Crea las pestañas (tabs)
        JTabbedPane pestañas = new JTabbedPane();

        //Aqui se declara la fuente a utilizar, el texto de las pestañas
        Font fuente = new Font("Arial", Font.BOLD, 22);
        pestañas.setFont(fuente);

        //Las pestañas como tal y a los archivos a los que se dirije
        pestañas.addTab("Asistencias", new PanelAsistencias());
        pestañas.addTab("Usuarios", new PanelUsuarios());
        pestañas.addTab("Entrenadores", new PanelEntrenadores());
        pestañas.addTab("Clases", new PanelClases());
        pestañas.addTab("Máquinas", new PanelMaquinas());
        pestañas.addTab("Pagos", new PanelPagos());
        add(pestañas);
        setVisible(true);

        //Se inicia una prueba de conexion a la BD
        pruebaConexion();
    }

    //Como tal aqui es donde ocurre la prueba, solo que se manda a llamar arriba
    private void pruebaConexion() {
        Connection connection = ConectorBD.getConnection();
        if (connection != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }

    //Aqui inicia el programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Inicio());
    }
}
