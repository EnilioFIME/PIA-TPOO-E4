import java.awt.*;
import javax.swing.*;

public class PanelUsuarios extends JPanel {

    public PanelUsuarios() {
        // Configuración del layout (Grid 4x4)
        setLayout(new GridLayout(4, 4, 20, 20)); // 4 filas, 4 columnas, con espacio de 10 píxeles entre celdas

        // Crear los botones con los colores específicos
        JButton botonVerde = new JButton("Agregar Usuario");
        botonVerde.setBackground(Color.decode("#88C273"));
        botonVerde.setOpaque(true);
        botonVerde.setFocusPainted(false); // Evitar el borde al hacer clic

        JButton botonAmarillo = new JButton("Amarillo");
        botonAmarillo.setBackground(Color.decode("#FAB12F"));
        botonAmarillo.setOpaque(true);
        botonAmarillo.setFocusPainted(false); // Evitar el borde al hacer clic

        JButton botonAzul = new JButton("Azul");
        botonAzul.setBackground(Color.decode("#78B3CE"));
        botonAzul.setOpaque(true);
        botonAzul.setFocusPainted(false); // Evitar el borde al hacer clic

        JButton botonRojo = new JButton("Rojo");
        botonRojo.setBackground(Color.decode("#C62E2E"));
        botonRojo.setOpaque(true);
        botonRojo.setFocusPainted(false); // Evitar el borde al hacer clic

        botonVerde.addActionListener(e -> mostrarFormularioBotonVerde());

        // Añadir los botones al panel (se colocan en las primeras 4 celdas del grid)
        add(botonVerde);
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);

        // Las demás celdas del grid quedarán vacías
        for (int i = 0; i < 12; i++) {
            add(new JLabel()); // Añadir un JLabel vacío para las celdas vacías
        }
    }

    private void mostrarFormularioBotonVerde() {
        // Crear un cuadro de diálogo (JDialog) para el formulario
        JDialog formulario = new JDialog((Frame) null, "Formulario para AGREGAR un Usuario", true);
        formulario.setLayout(new GridLayout(7, 1, 30, 30));
        formulario.setSize(600, 600);
        formulario.setLocationRelativeTo(this); // Centrar el formulario con respecto al panel principal
        formulario.getContentPane().setBackground(Color.decode("#88C273")); // Fondo verde suave

        // Crear un cuadro de texto para ingresar información
        JTextField cuadroTextoNombre = new JTextField(20);
        JTextField cuadroTextoApellidoP = new JTextField(20);
        JTextField cuadroTextoApellidoM = new JTextField(20);
        JTextField cuadroTextoTelefono = new JTextField(20);
        

        // Crear botones para aceptar y cancelar
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");
        
        // Acción para el botón Aceptar (puede realizar una operación, por ahora solo cierra el formulario)
        botonAceptar.addActionListener(e -> {
            if (cuadroTextoNombre.getText().trim().isEmpty()) {
                // Mostrar mensaje de error
                JOptionPane.showMessageDialog(
                    formulario,
                    "El campo NOMBRE no puede estar vacío. Por favor, ingrese un nombre válido.",
                    "Error de Validación",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Si el nombre es válido, cerrar el formulario
                System.out.println("Información aceptada: " + cuadroTextoNombre.getText());
                formulario.dispose();
            }
        });

        // Acción para el botón Cancelar (limpiar el texto y cerrar el formulario)
        botonCancelar.addActionListener(e -> {
            cuadroTextoNombre.setText(""); // Limpiar el texto
            formulario.dispose(); // Cerrar el formulario
        });

        // Añadir el cuadro de texto y los botones al formulario
        formulario.add(new JLabel("Ingresa el NOMBRE del nuevo Usuario:"));
        formulario.add(cuadroTextoNombre);
        formulario.add(new JLabel("Ingresa el APELLIDO PATERNO del nuevo Usuario:"));
        formulario.add(cuadroTextoApellidoP);
        formulario.add(new JLabel("Ingresa el APELLIDO MATERNO del nuevo Usuario:"));
        formulario.add(cuadroTextoApellidoM);
        formulario.add(new JLabel("Ingresa el TELEFONO del nuevo Usuario:"));
        formulario.add(cuadroTextoTelefono);
        
        formulario.add(botonAceptar);
        formulario.add(botonCancelar);

        // Hacer visible el formulario
        formulario.setVisible(true);
    }

    private void mostrarFormularioBotonAmarillo() {

    }
}
