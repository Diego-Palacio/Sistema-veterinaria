package interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peluqueria Canina");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(123, 11, 368, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cargar Datos");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			
			//Evento que al apretar boton "Cargar Datos" nos redirige a la pantalla de carga de datos.
			public void actionPerformed(ActionEvent e) {
				PantallaCargaDatos PantallaCargaDatos= new PantallaCargaDatos();
				PantallaCargaDatos.setVisible(true);
				PantallaCargaDatos.setLocationRelativeTo(null);
			}
			
		});
		btnNewButton.setBounds(43, 188, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVerDatos = new JButton("Ver Datos");
		btnVerDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerDatos.setBounds(43, 236, 152, 23);
		contentPane.add(btnVerDatos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(43, 284, 152, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Palacio\\Desktop\\Lunarr.png"));
		lblNewLabel_1.setBounds(317, 94, 226, 287);
		contentPane.add(lblNewLabel_1);
	}

}
