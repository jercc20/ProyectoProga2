package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import logica.Coleccionista;
import logica.Gestor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class PantallaActualizarColeccionista extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtFechaInicio;
	private JButton btnCancel;
	private JButton btnActualizar;
	private JButton btnBorrar;
	
	private Coleccionista coleccionista;

	public PantallaActualizarColeccionista( Coleccionista pColeccionista ) {
		
		coleccionista = pColeccionista;
		
		setResizable(false);
		setTitle("Actualizar Coleccionista");
		setBounds(100, 100, 339, 222);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(91, 11, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(91, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(54, 61, 83, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(54, 86, 83, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setBounds(0, 111, 137, 14);
		contentPane.add(lblFechaInicio);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(147, 8, 86, 20);
		txtId.setText( String.valueOf( coleccionista.getId() ) );
		contentPane.add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(147, 33, 86, 20);
		txtNombre.setText( coleccionista.getNombre() );
		contentPane.add(txtNombre);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(147, 58, 86, 20);
		txtDireccion.setText( coleccionista.getDireccion() );
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(147, 83, 86, 20);
		txtTelefono.setText( coleccionista.getTelefono() );
		contentPane.add(txtTelefono);
		
		txtFechaInicio = new JTextField();
		lblFechaInicio.setLabelFor(txtFechaInicio);
		txtFechaInicio.setBounds(147, 108, 86, 20);
		txtFechaInicio.setText( coleccionista.getFechaInicio() );
		contentPane.add(txtFechaInicio);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(36, 160, 89, 23);
		contentPane.add(btnCancel);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarColeccionista(coleccionista.getId(), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtFechaInicio.getText());
					JOptionPane.showMessageDialog( null, "El coleccionista ha sido actualiza exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(234, 160, 89, 23);
		contentPane.add(btnActualizar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarColeccionista(coleccionista.getId());
					JOptionPane.showMessageDialog( null, "El coleccionista ha sido eliminada exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(135, 160, 89, 23);
		contentPane.add(btnBorrar);
	}

}
