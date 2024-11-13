import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {
    // Configura la URL de tu base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/gymlogisticbd";  // Cambia por tu base de datos
    private static final String USER = "root";  // Usuario de la base de datos
    private static final String PASSWORD = "";  // Contraseña de la base de datos

    public static Connection getConnection() {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el controlador JDBC.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
            return null;
        }
    }
}
