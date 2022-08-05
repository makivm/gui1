package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class CompraBillete extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JLabel lblBillete;
	private JLabel lblDni;
	private JLabel lblNumPasajeros;
	private JLabel lblTipo;
	private JSpinner spinnerNumPasajeros;
	private JComboBox comboBillete;
	private JSpinner spinnerEdad;
	private JTextField txtDni;
	private JRadioButton rdbIda;
	private JRadioButton rdbIdayVuelta;
	private JButton btnComprar;
	private JPanel panel;
	private JButton btnLimpiar;
	private final ButtonGroup grupoTipo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraBillete frame = new CompraBillete();
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
	public CompraBillete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][grow]", "[][][][][][][][][grow]"));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 1 1,alignx left");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 2 1 2 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblApellidos, "cell 1 2,alignx left");
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtApellidos, "cell 2 2 2 1,growx");
		txtApellidos.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblEdad, "cell 1 3,alignx left,aligny baseline");
		
		spinnerEdad = new JSpinner();
		spinnerEdad.setFont(new Font("Verdana", Font.PLAIN, 14));
		spinnerEdad.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		contentPane.add(spinnerEdad, "cell 2 3,grow");
		
		lblBillete = new JLabel("Billete: ");
		lblBillete.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblBillete, "cell 1 4,alignx left");
		
		comboBillete = new JComboBox();
		comboBillete.setFont(new Font("Verdana", Font.PLAIN, 14));
		comboBillete.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Jóven", "3ª Edad"}));
		contentPane.add(comboBillete, "cell 2 4 2 1,growx");
		
		lblDni = new JLabel("D.N.I.:");
		lblDni.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblDni, "cell 1 5,alignx left");
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtDni, "cell 2 5 2 1,growx");
		txtDni.setColumns(10);
		
		lblNumPasajeros = new JLabel("Núm. Pasajeros:");
		lblNumPasajeros.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNumPasajeros, "cell 1 6,alignx left");
		
		spinnerNumPasajeros = new JSpinner();
		spinnerNumPasajeros.setFont(new Font("Verdana", Font.PLAIN, 14));
		spinnerNumPasajeros.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		contentPane.add(spinnerNumPasajeros, "cell 2 6,growx");
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblTipo, "cell 1 7,alignx left");
		
		rdbIda = new JRadioButton("Ida");
		grupoTipo.add(rdbIda);
		rdbIda.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbIda, "cell 2 7");
		
		rdbIdayVuelta = new JRadioButton("Ida y Vuelta");
		grupoTipo.add(rdbIdayVuelta);
		rdbIdayVuelta.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbIdayVuelta, "cell 3 7");
		
		panel = new JPanel();
		contentPane.add(panel, "cell 1 8 3 1,grow");
		
		btnComprar = new JButton("Comprar");
		panel.add(btnComprar);
		btnComprar.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel.add(btnLimpiar);
		
	}

	protected void limpiar() {
		txtNombre.setText("");
		txtApellidos.setText("");
		spinnerEdad.setValue(Integer.valueOf(18));
		comboBillete.setSelectedIndex(0);
		txtDni.setText("");
		spinnerNumPasajeros.setValue(Integer.valueOf(1));
		//rdbIda.setSelected(true); LO USARIAMOS SI EN LA CONFIGURACION INICIAL HUBIERAS PUESTO COMO SELECTED "IDA"
		//rdbIdayVuelta.setSelected(true);LO USARIAMOS SI EN LA CONFIGURACION INICIAL HUBIERAS PUESTO COMO SELECTED "IDA Y VUELTA"
		grupoTipo.clearSelection();//Usamos este puesto que no habiamos puesto ninguna opcion como preseleccionada
	}

}
