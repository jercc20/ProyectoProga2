package presentacion;

import logica.Gestor;
import logica.Mecenas;
import logica.Mecenazgo;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

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
	private JButton btnCrearMecenazgo;
	private JTextArea txtMecenazgos;
	private JScrollPane scrollPane;

	public PantallaActualizarMecenas( Mecenas pMecenas ) {
		
		
		
		mecenas = pMecenas;
		setTitle("Actualizar Mecenas");
		setResizable(false);
		setBounds(100, 100, 407, 358);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setDisplayedMnemonic('I');
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(10, 10, 121, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		lblId.setLabelFor(txtId);
		txtId.setEditable( false );
		txtId.setBounds(141, 5, 86, 20);
		txtId.setText( String.valueOf( mecenas.getId() ) );
		contentPane.add(txtId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setLabelFor(lblNombre);
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(85, 34, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(141, 30, 86, 20);
		txtNombre.setText( mecenas.getNombre() );
		contentPane.add(txtNombre);
		
		JLabel lblPaisNacimiento = new JLabel("Pa\u00EDs de nacimiento");
		lblPaisNacimiento.setDisplayedMnemonic('P');
		lblPaisNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaisNacimiento.setBounds(10, 58, 121, 14);
		contentPane.add(lblPaisNacimiento);
		
		txtPaisNacimiento = new JTextField();
		lblPaisNacimiento.setLabelFor(txtPaisNacimiento);
		txtPaisNacimiento.setBounds(141, 55, 86, 20);
		txtPaisNacimiento.setText( mecenas.getNacionalidad() );
		contentPane.add(txtPaisNacimiento);
		
		JLabel lblCiudadNacimiento = new JLabel("Ciudad de nacimiento");
		lblCiudadNacimiento.setDisplayedMnemonic('P');
		lblCiudadNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCiudadNacimiento.setBounds(10, 82, 121, 14);
		contentPane.add(lblCiudadNacimiento);
		
		txtCiudadNacimiento = new JTextField();
		lblCiudadNacimiento.setLabelFor(txtCiudadNacimiento);
		txtCiudadNacimiento.setBounds(141, 80, 86, 20);
		txtCiudadNacimiento.setText( mecenas.getCiudadNacimiento() );
		contentPane.add(txtCiudadNacimiento);
		
		JLabel lblFechaMuerte = new JLabel("Fecha de muerte");
		lblFechaMuerte.setDisplayedMnemonic('F');
		lblFechaMuerte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaMuerte.setBounds(34, 106, 97, 14);
		contentPane.add(lblFechaMuerte);
		
		txtFechaMuerte = new JTextField();
		lblFechaMuerte.setLabelFor(txtFechaMuerte);
		txtFechaMuerte.setBounds(141, 105, 86, 20);
		txtFechaMuerte.setText( mecenas.getFechaMuerte() );
		contentPane.add(txtFechaMuerte);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(104, 295, 89, 23);
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
		btnBorrar.setBounds(203, 295, 89, 23);
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
		btnActualizar.setBounds(302, 295, 89, 23);
		contentPane.add(btnActualizar);
		
		btnCrearMecenazgo = new JButton("Crear Mecenazgo");
		btnCrearMecenazgo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnCrearMecenazgo_mouseClicked(e);
			}
		});
		btnCrearMecenazgo.setBounds(258, 54, 121, 23);
		contentPane.add(btnCrearMecenazgo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 131, 369, 153);
		contentPane.add(scrollPane);
		
		txtMecenazgos = new JTextArea();
		txtMecenazgos.setEditable(false);
		scrollPane.setViewportView(txtMecenazgos);
		
		String infoMecenazgos = "";
		for ( Mecenazgo m : pMecenas.getMecenazgos() ){
			infoMecenazgos += m.toString() + "\n";
		}
		
		txtMecenazgos.setText(infoMecenazgos);
		
	}
	
	
	public void btnCrearMecenazgo_mouseClicked(MouseEvent e) {
		try {
			PantallaCrearMecenazgo p;
			p = new PantallaCrearMecenazgo(txtId.getText());
			p.setVisible(true);
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this,"Error","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
