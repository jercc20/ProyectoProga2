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
import capaLogica.Pintor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaActualizarPintor extends JFrame {

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
	private JTextField txtIdMaestro;
	private JTextField txtIdEscuela;

	public PantallaActualizarPintor( Pintor pPintor ) {
		setResizable(false);
		setTitle("Crear Pintor");
		setBounds(100, 100, 381, 333);
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
		txtId.setEditable(false);
		lblId.setLabelFor(txtId);
		txtId.setBounds(150, 8, 139, 20);
		txtId.setText( String.valueOf( pPintor.getId() ) );
		contentPane.add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(150, 33, 139, 20);
		txtNombre.setText( pPintor.getNombre() );
		contentPane.add(txtNombre);
		
		txtNombreArtistico = new JTextField();
		txtNombreArtistico.setBounds(150, 58, 139, 20);
		txtNombreArtistico.setText( pPintor.getNombreArtistico() );
		contentPane.add(txtNombreArtistico);
		
		txtCiudadNacimiento = new JTextField();
		lblCiudadNacimiento.setLabelFor(txtCiudadNacimiento);
		txtCiudadNacimiento.setBounds(150, 83, 139, 20);
		txtCiudadNacimiento.setText( pPintor.getCiudadNacimiento() );
		contentPane.add(txtCiudadNacimiento);
		
		txtPaisNacimiento = new JTextField();
		txtPaisNacimiento.setBounds(150, 108, 139, 20);
		txtPaisNacimiento.setText( pPintor.getPaisNacimiento() );
		contentPane.add(txtPaisNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(150, 133, 139, 20);
		txtFechaNacimiento.setText( pPintor.getFechaNacimiento() );
		contentPane.add(txtFechaNacimiento);
		
		txtFechaMuerte = new JTextField();
		txtFechaMuerte.setBounds(150, 158, 139, 20);
		txtFechaMuerte.setText( pPintor.getFechaMuerte() );
		contentPane.add(txtFechaMuerte);
		
		cmbTipo = new JComboBox<String>();
		lblTipo.setLabelFor(cmbTipo);
		cmbTipo.setModel(new DefaultComboBoxModel<String>(new String[] {"Famoso", "Reconocido", "Poco conocido"}));
		cmbTipo.setBounds(150, 183, 139, 20);
		//cmbTipo.setSelectedIndex(  ); // ?? setText( pPintor.getTipo() );
		contentPane.add(cmbTipo);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(78, 271, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = "";
				switch (cmbTipo.getSelectedIndex()){
					case 0:
						tipo = "Famoso";
						break;
					case 1:
						tipo = "Reconocido";
						break;
					case 2:
						tipo = "Poco conocido";
						break;
				}
				
				try {
					Gestor.actualizarPintor(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtNombreArtistico.getText(), txtCiudadNacimiento.getText(), txtPaisNacimiento.getText(),
							txtFechaNacimiento.getText(), txtFechaMuerte.getText(), tipo, Integer.parseInt(txtIdMaestro.getText()), Integer.parseInt(txtIdEscuela.getText()));
					JOptionPane.showMessageDialog( null, "El pintor ha sido actualizado exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnActualizar.setBounds(276, 271, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						Gestor.borrarPintor(Integer.parseInt(txtId.getText()));
						JOptionPane.showMessageDialog( null, "El pintor ha sido eliminado exitosamente.");
						setVisible(false);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog( null, "Hubo un error");
					}
				
			}
		});
		btnBorrar.setBounds(177, 271, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblIdMaestro = new JLabel("Id Maestro");
		lblIdMaestro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdMaestro.setBounds(51, 211, 89, 14);
		contentPane.add(lblIdMaestro);
		
		txtIdMaestro = new JTextField();
		lblIdMaestro.setLabelFor(txtIdMaestro);
		txtIdMaestro.setBounds(150, 208, 139, 20);
		contentPane.add(txtIdMaestro);
		txtIdMaestro.setColumns(10);
		
		JLabel lblIdEscuela = new JLabel("Id Escuela");
		lblIdEscuela.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdEscuela.setBounds(61, 236, 79, 14);
		contentPane.add(lblIdEscuela);
		
		txtIdEscuela = new JTextField();
		lblIdEscuela.setLabelFor(txtIdEscuela);
		txtIdEscuela.setBounds(150, 233, 139, 20);
		contentPane.add(txtIdEscuela);
		txtIdEscuela.setColumns(10);
	}
}