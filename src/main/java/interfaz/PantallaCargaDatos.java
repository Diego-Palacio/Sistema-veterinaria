package interfaz;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class PantallaCargaDatos extends JFrame {

	
	private JPanel contentPane;
	private JTextField NumCliente;
	private JTextField Nombre;
	private JTextField Raza;
	private JTextField Color;
	private JTextField NombreDueño;
	private JTextField CelDueño;

	
	/**
	 * Create the frame.
	 */
	public PantallaCargaDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NumCliente = new JTextField();
		NumCliente.setBounds(88, 117, 126, 20);
		contentPane.add(NumCliente);
		NumCliente.setColumns(10);
		
		Nombre = new JTextField();
		Nombre.setBounds(88, 148, 126, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Raza = new JTextField();
		Raza.setColumns(10);
		Raza.setBounds(88, 179, 126, 20);
		contentPane.add(Raza);
		
		Color = new JTextField();
		Color.setColumns(10);
		Color.setBounds(88, 210, 126, 20);
		contentPane.add(Color);
		
		NombreDueño = new JTextField();
		NombreDueño.setColumns(10);
		NombreDueño.setBounds(121, 314, 165, 20);
		contentPane.add(NombreDueño);
		
		CelDueño = new JTextField();
		CelDueño.setColumns(10);
		CelDueño.setBounds(121, 339, 165, 20);
		contentPane.add(CelDueño);
		
		final JTextArea Observaciones = new JTextArea();
		Observaciones.setBounds(121, 377, 293, 109);
		contentPane.add(Observaciones);
		
		final JComboBox Alergia = new JComboBox();
		Alergia.setModel(new DefaultComboBoxModel(new String[] {"-", "Si", "No"}));
		Alergia.setBounds(89, 248, 46, 22);
		contentPane.add(Alergia);
		
		final JComboBox AtencionEspecial = new JComboBox();
		AtencionEspecial.setModel(new DefaultComboBoxModel(new String[] {"-", "Si", "No"}));
		AtencionEspecial.setBounds(121, 275, 46, 22);
		contentPane.add(AtencionEspecial);
		
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.addActionListener(new ActionListener() {
			//Evento que sucede al apretar boton "Limpiar"-- Borraremos todos los datos ingresados.
			public void actionPerformed(ActionEvent e) {
				NumCliente.setText("");
				Nombre.setText("");
				Raza.setText("");
				Color.setText("");
				NombreDueño.setText("");
				CelDueño.setText("");
				Observaciones.setText("");
				Alergia.setSelectedIndex(0);
				AtencionEspecial.setSelectedIndex(0);
				
			}
		});
		Limpiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Limpiar.setBounds(175, 519, 126, 43);
		contentPane.add(Limpiar);
		
		JButton Guardar = new JButton("Guardar");
		Guardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Guardar.setBounds(389, 519, 126, 43);
		contentPane.add(Guardar);
		
		JLabel NumClienteText = new JLabel("Cliente N:");
		NumClienteText.setBounds(25, 120, 68, 14);
		contentPane.add(NumClienteText);
		
		JLabel NombreText = new JLabel("Nombre:");
		NombreText.setBounds(25, 151, 46, 14);
		contentPane.add(NombreText);
		
		JLabel RazaText = new JLabel("Raza:");
		RazaText.setBounds(25, 182, 46, 14);
		contentPane.add(RazaText);
		
		JLabel ColorText = new JLabel("Color:");
		ColorText.setBounds(25, 213, 39, 14);
		contentPane.add(ColorText);
		
		JLabel NombreDueñoText = new JLabel("Nombre Due\u00F1o:");
		NombreDueñoText.setBounds(25, 317, 81, 14);
		contentPane.add(NombreDueñoText);
		
		JLabel CelDueñoText = new JLabel("Celular Due\u00F1o:");
		CelDueñoText.setBounds(25, 342, 81, 14);
		contentPane.add(CelDueñoText);
		
		JLabel ObservacionesText = new JLabel("Observaciones:");
		ObservacionesText.setBounds(25, 382, 86, 14);
		contentPane.add(ObservacionesText);
		
		JLabel AlergiaText = new JLabel("Alergia:");
		AlergiaText.setBounds(25, 252, 46, 14);
		contentPane.add(AlergiaText);
		
		JLabel AtencionEspecialText = new JLabel("Atencion Especial:");
		AtencionEspecialText.setBounds(25, 279, 94, 14);
		contentPane.add(AtencionEspecialText);
		
		JLabel lblNewLabel_2 = new JLabel("Carga de Datos");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(224, 22, 308, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Palacio\\Desktop\\Lunarr.png"));
		lblNewLabel_3.setBounds(399, 79, 223, 287);
		contentPane.add(lblNewLabel_3);
	}
}
