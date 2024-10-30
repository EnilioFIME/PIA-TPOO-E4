//Los asteriscos son amigos, indican que estamos importando todas las clases de los packages (paquetes)
import java.awt.*;
import java.awt.event.*;

//Aqui hay otro asterisco chiquito (doble sentido)
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Comic Sans", Font.BOLD, 18);
    JTextField tfFirstName;
    JTextField tfLastName;
    JLabel lbWelcome;

    public void initialize() {
        //LAYOUT form panel
        JLabel lbFirstName = new JLabel("Nombre");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Apellido");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formJPanel = new JPanel();
        formJPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formJPanel.setOpaque(false);
        formJPanel.add(lbFirstName);
        formJPanel.add(tfFirstName);
        formJPanel.add(lbLastName);
        formJPanel.add(tfLastName);

        //Welcome label
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        //LAYOUT botÓn panÉl
        JButton btnOK = new JButton("OkiDoki");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);
            }
            
        });

        JButton btnClear = new JButton("BORAR TODO ALV");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnOK);
        buttonPanel.add(btnClear);

        //layout MAIN PANEL 
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formJPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("HOLA GINASIO");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}