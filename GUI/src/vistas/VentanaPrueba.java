package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrueba extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrueba frame = new VentanaPrueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrueba() {
		setTitle("Suma de dos números");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(55, 30, 117, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 36, 214, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNmero = new JLabel("Número 2:");
		lblNmero.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNmero.setBounds(55, 62, 85, 24);
		contentPane.add(lblNmero);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 68, 214, 18);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnNewButton.setBounds(165, 148, 105, 33);
		contentPane.add(btnNewButton);
	}
}
