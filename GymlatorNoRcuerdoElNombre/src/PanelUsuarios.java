import java.awt.*;
import javax.swing.*;

public class PanelUsuarios extends JPanel {

    public PanelUsuarios() {
        // Configuración del layout (Grid 4x4)
        setLayout(new GridLayout(4, 4, 20, 20)); // 4 filas, 4 columnas, con espacio de 10 píxeles entre celdas

        // Crear los botones con los colores específicos
        JButton botonVerde = new JButton("Verde");
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

        botonVerde.addActionListener(e -> mostrarFormulario());

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

    private void mostrarFormulario() {

        

        // Crear un cuadro de diálogo (JDialog) para el formulario
        JDialog formulario = new JDialog((Frame) null, "Formulario para AGREGAR un Usuario", true);
        formulario.setLayout(new GridLayout(7, 1, 30, 30));
        formulario.setSize(600, 600);
        formulario.setLocationRelativeTo(this); // Centrar el formulario con respecto al panel principal
        formulario.getContentPane().setBackground(Color.decode("#88C273")); // Fondo verde suave

        // Crear un cuadro de texto para ingresar información
        JTextField cuadroTexto1 = new JTextField(20);
        JTextField cuadroTexto2 = new JTextField(20);
        JTextField cuadroTexto3 = new JTextField(20);
        JTextField cuadroTexto4 = new JTextField(20);
        JTextField cuadroTexto5 = new JTextField(20);

        // Crear botones para aceptar y cancelar
        JButton botonAceptar = new JButton("Aceptar");
        JButton botonCancelar = new JButton("Cancelar");

        // Acción para el botón Aceptar (puede realizar una operación, por ahora solo cierra el formulario)
        botonAceptar.addActionListener(e -> {
            System.out.println("Información aceptada: " + cuadroTexto1.getText());
            formulario.dispose(); // Cerrar el formulario
        });

        // Acción para el botón Cancelar (limpiar el texto y cerrar el formulario)
        botonCancelar.addActionListener(e -> {
            cuadroTexto1.setText(""); // Limpiar el texto
            formulario.dispose(); // Cerrar el formulario
        });

        // Añadir el cuadro de texto y los botones al formulario
        formulario.add(new JLabel("Ingresa texto 1:"));
        formulario.add(cuadroTexto1);
        formulario.add(new JLabel("Ingresa texto 2:"));
        formulario.add(cuadroTexto2);
        formulario.add(new JLabel("Ingresa texto 3:"));
        formulario.add(cuadroTexto3);
        formulario.add(new JLabel("Ingresa texto 4:"));
        formulario.add(cuadroTexto4);
        formulario.add(new JLabel("Ingresa texto 5:"));
        formulario.add(cuadroTexto5);
        formulario.add(botonAceptar);
        formulario.add(botonCancelar);

        // Hacer visible el formulario
        formulario.setVisible(true);
    }
}
