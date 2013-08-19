package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import logica.Gestor;

import java.awt.SystemColor;

public class PantallaCrearEscuela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPais;
	private JTextField txtFecha;
	private JTextArea txtCaracteristicas;
	private JTextField txtId;
	private JLabel lblId;

	public PantallaCrearEscuela() {
		setResizable(false);
		setTitle("Crear Escuela");
		setBounds(100, 100, 336, 275);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(45, 39, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPais.setBounds(45, 64, 46, 14);
		contentPane.add(lblPais);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(45, 89, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblCaracteristicas = new JLabel("Caracter\u00EDsticas");
		lblCaracteristicas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCaracteristicas.setBounds(0, 121, 91, 14);
		contentPane.add(lblCaracteristicas);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(101, 36, 109, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBounds(101, 61, 109, 20);
		contentPane.add(txtPais);
		txtPais.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(101, 86, 109, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.crearEscuela(Integer.parseInt( txtId.getText() ), txtNombre.getText(), txtPais.getText(), txtFecha.getText(), txtCaracteristicas.getText());
					JOptionPane.showMessageDialog( null, "La escuela ha sido creada exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnCrear.setBounds(239, 213, 81, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancel");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(148, 213, 81, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 116, 168, 44);
		contentPane.add(scrollPane);
		
		txtCaracteristicas = new JTextArea();
		scrollPane.setViewportView(txtCaracteristicas);
		txtCaracteristicas.setWrapStyleWord(true);
		txtCaracteristicas.setLineWrap(true);
		
		txtId = new JTextField();
		txtId.setBounds(101, 11, 109, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(45, 14, 46, 14);
		contentPane.add(lblId);
	}
}
