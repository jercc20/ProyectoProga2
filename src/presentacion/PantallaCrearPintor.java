package capaPresentacionLocal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import capaLogica.Gestor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaCrearPintor extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtNombreArtistico;
	private JTextField txtCiudadNacimiento;
	private JTextField txtPaisNacimiento;
	private JTextField txtFechaNacimiento;
	private JTextField txtFechaMuerte;
	private JLabel lblFechaDeMuerte;
	private JComboBox<String> cmbTipo;

	public PantallaCrearPintor() {
		setResizable(false);
		setTitle("Crear Pintor");
		setBounds(100, 100, 381, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(39, 11, 101, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(94, 36, 46, 14);
		contentPane.add(lblNombre);
		lblNombre.setLabelFor(txtNombre);
		
		JLabel lblNombreArtistico = new JLabel("Nombre art\u00EDstico");
		lblNombreArtistico.setDisplayedMnemonic('a');
		lblNombreArtistico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreArtistico.setBounds(10, 61, 130, 14);
		contentPane.add(lblNombreArtistico);
		lblNombreArtistico.setLabelFor(txtNombreArtistico);
		
		JLabel lblCiudadNacimiento = new JLabel("Ciudad de nacimiento");
		lblCiudadNacimiento.setDisplayedMnemonic('C');
		lblCiudadNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCiudadNacimiento.setBounds(10, 86, 130, 14);
		contentPane.add(lblCiudadNacimiento);
		
		JLabel lblPaisNacimiento = new JLabel("Pa\u00EDs de nacimiento");
		lblPaisNacimiento.setDisplayedMnemonic('P');
		lblPaisNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaisNacimiento.setLabelFor(txtPaisNacimiento);
		lblPaisNacimiento.setBounds(10, 111, 130, 14);
		contentPane.add(lblPaisNacimiento);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaNacimiento.setDisplayedMnemonic('F');
		lblFechaNacimiento.setLabelFor(txtFechaNacimiento);
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaNacimiento.setBounds(10, 136, 130, 14);
		contentPane.add(lblFechaNacimiento);
		
		lblFechaDeMuerte = new JLabel("Fecha de muerte");
		lblFechaDeMuerte.setDisplayedMnemonic('m');
		lblFechaDeMuerte.setLabelFor(txtFechaMuerte);
		lblFechaDeMuerte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeMuerte.setBounds(20, 161, 120, 14);
		contentPane.add(lblFechaDeMuerte);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setDisplayedMnemonic('t');
		lblTipo.setBounds(94, 186, 46, 14);
		contentPane.add(lblTipo);
		
		txtId = new JTextField();
		//txtId.setEditable(false);
		lblId.setLabelFor(txtId);
		txtId.setBounds(150, 8, 139, 20);
		contentPane.add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(150, 33, 139, 20);
		contentPane.add(txtNombre);
		
		txtNombreArtistico = new JTextField();
		txtNombreArtistico.setBounds(150, 58, 139, 20);
		contentPane.add(txtNombreArtistico);
		
		txtCiudadNacimiento = new JTextField();
		lblCiudadNacimiento.setLabelFor(txtCiudadNacimiento);
		txtCiudadNacimiento.setBounds(150, 83, 139, 20);
		contentPane.add(txtCiudadNacimiento);
		
		txtPaisNacimiento = new JTextField();
		txtPaisNacimiento.setBounds(150, 108, 139, 20);
		contentPane.add(txtPaisNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(150, 133, 139, 20);
		contentPane.add(txtFechaNacimiento);
		
		txtFechaMuerte = new JTextField();
		txtFechaMuerte.setBounds(150, 158, 139, 20);
		contentPane.add(txtFechaMuerte);
		
		cmbTipo = new JComboBox<String>();
		lblTipo.setLabelFor(cmbTipo);
		cmbTipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Famoso", "Reconocido", "Poco conocido"}));
		cmbTipo.setBounds(150, 183, 139, 20);
		contentPane.add(cmbTipo);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.crearPintor(Integer.parseInt( txtId.getText() ), txtNombre.getText(), txtNombreArtistico.getText(), txtCiudadNacimiento.getText(), txtPaisNacimiento.getText(), txtFechaNacimiento.getText(), txtFechaMuerte.getText(), cmbTipo.getSelectedItem().toString(), 0, 0);
					JOptionPane.showMessageDialog( null, "El pintor ha sido creado exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnCrear.setBounds(266, 228, 89, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(167, 228, 89, 23);
		contentPane.add(btnCancel);
	}
}
