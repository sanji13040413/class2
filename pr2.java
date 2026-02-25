import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PotenciaGUI extends JFrame {

    private JTextField txtBase;
    private JTextField txtExponente;
    private JLabel lblResultado;

    public PotenciaGUI() {
        setTitle("Calculadora de Potencia");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        // Componentes
        add(new JLabel("Base:"));
        txtBase = new JTextField();
        add(txtBase);

        add(new JLabel("Exponente:"));
        txtExponente = new JTextField();
        add(txtExponente);

        JButton btnCalcular = new JButton("Calcular");
        add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        add(lblResultado);

        // Evento del botón
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(txtBase.getText());
                    double exponente = Double.parseDouble(txtExponente.getText());

                    double resultado = Math.pow(base, exponente);

                    lblResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingrese números válidos");
                }
            }
        });
    }

    public static void main(String[] args) {
        new PotenciaGUI().setVisible(true);
    }
}