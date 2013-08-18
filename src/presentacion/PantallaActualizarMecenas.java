package capaPresentacionLocal;

import capaLogica.Gestor;
import capaLogica.Mecenas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.sql.SQLException;

public class PantallaActualizarMecenas extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtPaisNacimiento;
	private JTextField txtCiudadNacimiento;
	private JTextField txtFechaMuerte;
	private JButton btnBorrar;
	private JButton btnActualizar;
	private Mecenas mecenas;

	public PantallaActualizarMecenas( Mecenas pMecenas ) {
		mecenas = pMecenas;
		setTitle("Actualizar Mecenas");
		setResizable(false);
		setBounds(100, 100, 324, 216);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setDisplayedMnemonic('I');
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 11, 121, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		lblId.setLabelFor(txtId);
		txtId.setEditable( false );
		txtId.setBounds(141, 8, 86, 20);
		txtId.setText( String.valueOf( mecenas.getId() ) );
		contentPane.add(txtId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setLabelFor(lblNombre);
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(85, 36, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(141, 33, 86, 20);
		txtNombre.setText( mecenas.getNombre() );
		contentPane.add(txtNombre);
		
		JLabel lblPaisNacimiento = new JLabel("Pa\u00EDs de nacimiento");
		lblPaisNacimiento.setDisplayedMnemonic('P');
		lblPaisNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaisNacimiento.setBounds(10, 86, 121, 14);
		contentPane.add(lblPaisNacimiento);
		
		txtPaisNacimiento = new JTextField();
		lblPaisNacimiento.setLabelFor(txtPaisNacimiento);
		txtPaisNacimiento.setBounds(141, 83, 86, 20);
		txtPaisNacimiento.setText( mecenas.getNacionalidad() );
		contentPane.add(txtPaisNacimiento);
		
		JLabel lblCiudadNacimiento = new JLabel("Ciudad de nacimiento");
		lblCiudadNacimiento.setDisplayedMnemonic('P');
		lblCiudadNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCiudadNacimiento.setBounds(10, 61, 121, 14);
		contentPane.add(lblCiudadNacimiento);
		
		txtCiudadNacimiento = new JTextField();
		lblCiudadNacimiento.setLabelFor(txtCiudadNacimiento);
		txtCiudadNacimiento.setBounds(141, 58, 86, 20);
		txtCiudadNacimiento.setText( mecenas.getCiudadNacimiento() );
		contentPane.add(txtCiudadNacimiento);
		
		JLabel lblFechaMuerte = new JLabel("Fecha de muerte");
		lblFechaMuerte.setDisplayedMnemonic('F');
		lblFechaMuerte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaMuerte.setBounds(34, 111, 97, 14);
		contentPane.add(lblFechaMuerte);
		
		txtFechaMuerte = new JTextField();
		lblFechaMuerte.setLabelFor(txtFechaMuerte);
		txtFechaMuerte.setBounds(141, 108, 86, 20);
		txtFechaMuerte.setText( mecenas.getFechaMuerte() );
		contentPane.add(txtFechaMuerte);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(21, 154, 89, 23);
		contentPane.add(btnCancel);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarMecenas(mecenas.getId());
					JOptionPane.showMessageDialog( null, "El mecenas ha sido eliminado exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(120, 154, 89, 23);
		contentPane.add(btnBorrar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarMecenas(mecenas.getId(), txtNombre.getText(), txtPaisNacimiento.getText(), txtCiudadNacimiento.getText(), txtFechaMuerte.getText());
					JOptionPane.showMessageDialog( null, "El mecenas ha sido actualizo exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(219, 154, 89, 23);
		contentPane.add(btnActualizar);
	}

}
