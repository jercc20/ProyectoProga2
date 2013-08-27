package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.DAOGaleria;
import logica.Galeria;

public class PantallaCrearExposicion extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdGaleria;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public PantallaCrearExposicion(String pidGaleria) {
		
		Galeria galeria = DAOGaleria.buscar(pidGaleria);
		
		setTitle("Crear Exposici\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdGaleria = new JLabel("Id Galeria");
		lblIdGaleria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdGaleria.setBounds(44, 7, 96, 14);
		contentPane.add(lblIdGaleria);
		
		txtIdGaleria = new JTextField();
		txtIdGaleria.setBounds(150, 5, 151, 17);
		contentPane.add(txtIdGaleria);
		txtIdGaleria.setColumns(10);
		txtIdGaleria.setText(galeria.getId());
		txtIdGaleria.setEnabled(false);
		
		textField = new JTextField();
		textField.setBounds(150, 26, 151, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 47, 151, 17);
		contentPane.add(textField_1);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setBounds(54, 28, 86, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final");
		lblFechaFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaFinal.setBounds(54, 49, 86, 14);
		contentPane.add(lblFechaFinal);
		
		JLabel lblListaPinturas = new JLabel("Lista Pinturas");
		lblListaPinturas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblListaPinturas.setBounds(44, 70, 96, 14);
		contentPane.add(lblListaPinturas);
	}

}
