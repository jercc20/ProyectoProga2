package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.List;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import logica.Gestor;
import logica.Pintor;
import logica.Pintura;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

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
	private JTextField txtIdEscuela;
	private JButton btnAgregarMaestro;
	private List listPinturas;
	private List listMaestros;
	private JButton btnBuscarPinturas;
	private JButton btnBuscarMaestros;
	private Pintor pintor;

	public PantallaActualizarPintor( Pintor pPintor ) {
		
		pintor = pPintor;
		
		setResizable(false);
		setTitle("Actualizar Pintor");
		setBounds(100, 100, 455, 519);
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
		txtPaisNacimiento.setText( pPintor.getNacionalidad() );
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
		btnCancel.setBounds(79, 456, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Gestor.actualizarPintor( txtId.getText(), txtNombre.getText(), txtNombreArtistico.getText(), txtCiudadNacimiento.getText(), txtPaisNacimiento.getText(),
							txtFechaNacimiento.getText(), txtFechaMuerte.getText(), cmbTipo.getSelectedItem().toString(), Integer.parseInt(txtIdEscuela.getText()));
					JOptionPane.showMessageDialog( null, "El pintor ha sido actualizado exitosamente.");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnActualizar.setBounds(277, 456, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						Gestor.borrarPintor( txtId.getText());
						JOptionPane.showMessageDialog( null, "El pintor ha sido eliminado exitosamente.");
						setVisible(false);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog( null, "Hubo un error");
					}
				
			}
		});
		btnBorrar.setBounds(178, 456, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblIdEscuela = new JLabel("Id Escuela");
		lblIdEscuela.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdEscuela.setBounds(61, 214, 79, 14);
		contentPane.add(lblIdEscuela);
		
		txtIdEscuela = new JTextField();
		lblIdEscuela.setLabelFor(txtIdEscuela);
		txtIdEscuela.setBounds(150, 211, 139, 20);
		String escuela = "";
		if( pPintor.getEscuela() != null ){
			escuela = Integer.toString( pPintor.getEscuela().getId() );
		}
		else {
			escuela = "0";
		}
		txtIdEscuela.setText( escuela );
		contentPane.add(txtIdEscuela);
		txtIdEscuela.setColumns(10);
		
		btnAgregarMaestro = new JButton("Agregar Maestro");
		btnAgregarMaestro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnAgregarMaestro_mouseClicked(e);
			}
		});
		btnAgregarMaestro.setBounds(20, 296, 120, 23);
		contentPane.add(btnAgregarMaestro);
		
		listPinturas = new List();
		listPinturas.setBounds(150, 337, 250, 108);
		contentPane.add(listPinturas);
		
		listMaestros = new List();
		listMaestros.setBounds(150, 237, 250, 94);
		contentPane.add(listMaestros);
		
		btnBuscarPinturas = new JButton("Buscar Pinturas");
		btnBuscarPinturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( pintor.getMaestros().size() >0) {
					for ( Pintor p : pintor.getMaestros() ) {
						listMaestros.add( "Maestro: " + p.getNombre() );
					}
				}				
			}
		});
		btnBuscarPinturas.setBounds(20, 380, 120, 23);
		contentPane.add(btnBuscarPinturas);
		
		btnBuscarMaestros = new JButton("Buscar Maestros");
		btnBuscarMaestros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( pintor.getMaestros().size() >0) {
					for ( Pintor p : pintor.getMaestros() ) {
						listMaestros.add( "Maestro: " + p.getNombre() );
					}
				}
			}
		});
		btnBuscarMaestros.setBounds(20, 250, 120, 23);
		contentPane.add(btnBuscarMaestros);
		
		if( pPintor.getPinturas().size() >0) {
			for ( Pintura p : pPintor.getPinturas() ) {
				listPinturas.add( "Pintura: " + p.getNombre() );
			}
		}
		
		if( pPintor.getMaestros().size() >0) {
			for ( Pintor p : pPintor.getMaestros() ) {
				listMaestros.add( "Maestro: " + p.getNombre() );
			}
		}
	}
	
	public void btnAgregarMaestro_mouseClicked(MouseEvent e) {
		try {
			PantallaAgregarMaestro p;
			p = new PantallaAgregarMaestro(txtId.getText());
			p.setVisible(true);
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this,"","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
