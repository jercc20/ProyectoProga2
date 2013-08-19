package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import logica.Galeria;
import logica.Gestor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.sql.SQLException;

public class PantallaActualizarGaleria extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtFechaInauguracion;
	private JTextField txtNombreEncargado;
	private JTextField txtArea;
	private JButton btnCancel;
	private JButton btnActualizar;
	private JButton btnBorrar;
	
	private Galeria galeria;

	public PantallaActualizarGaleria( Galeria pGaleria ) {
		
		galeria = pGaleria;
		
		setResizable(false);
		setTitle("Actualizar Galer\u00EDa");
		setBounds(100, 100, 339, 265);
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
		
		JLabel lblFechaInauguracion = new JLabel("Fecha de inauguraci\u00F3n");
		lblFechaInauguracion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInauguracion.setBounds(0, 111, 137, 14);
		contentPane.add(lblFechaInauguracion);
		
		JLabel lblNombreEncargado = new JLabel("Nombre del encargado");
		lblNombreEncargado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreEncargado.setBounds(0, 136, 137, 14);
		contentPane.add(lblNombreEncargado);
		
		JLabel lblArea = new JLabel("\u00C1rea");
		lblArea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblArea.setBounds(91, 161, 46, 14);
		contentPane.add(lblArea);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(147, 8, 86, 20);
		txtId.setText( String.valueOf( galeria.getId() ) );
		contentPane.add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(147, 33, 86, 20);
		txtNombre.setText( galeria.getNombre() );
		contentPane.add(txtNombre);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(147, 58, 86, 20);
		txtDireccion.setText( galeria.getDireccion() );
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(147, 83, 86, 20);
		txtTelefono.setText( galeria.getTelefono() );
		contentPane.add(txtTelefono);
		
		txtFechaInauguracion = new JTextField();
		txtFechaInauguracion.setBounds(147, 108, 86, 20);
		txtFechaInauguracion.setText( galeria.getFechaInauguracion() );
		contentPane.add(txtFechaInauguracion);
		
		txtNombreEncargado = new JTextField();
		txtNombreEncargado.setBounds(147, 133, 86, 20);
		txtNombreEncargado.setText( galeria.getEncargado() );
		contentPane.add(txtNombreEncargado);
		
		txtArea = new JTextField();
		txtArea.setBounds(147, 158, 86, 20);
		txtArea.setText( galeria.getMetrosCuadrados() );
		contentPane.add(txtArea);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(36, 203, 89, 23);
		contentPane.add(btnCancel);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarGaleria(galeria.getId(), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText(), txtFechaInauguracion.getText(), txtNombreEncargado.getText(), txtArea.getText());
					JOptionPane.showMessageDialog( null, "La galeria ha sido actualiza exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(234, 203, 89, 23);
		contentPane.add(btnActualizar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarGaleria(galeria.getId());
					JOptionPane.showMessageDialog( null, "La galeria ha sido eliminada exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(135, 203, 89, 23);
		contentPane.add(btnBorrar);
	}

}
