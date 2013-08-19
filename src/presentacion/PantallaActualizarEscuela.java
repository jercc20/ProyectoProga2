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

import logica.Escuela;
import logica.Gestor;

import java.awt.SystemColor;
import java.sql.SQLException;

public class PantallaActualizarEscuela extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtPais;
	private JTextField txtFecha;
	private JTextArea txtCaracteristicas;
	
	private Escuela escuela;

	public PantallaActualizarEscuela( Escuela pEscuela ) {
		
		escuela = pEscuela;
		
		setResizable(false);
		setTitle("Actualizar Escuela");
		setBounds(100, 100, 337, 260);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(45, 40, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPais.setBounds(45, 65, 46, 14);
		contentPane.add(lblPais);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(45, 90, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblCaracteristicas = new JLabel("Caracter\u00EDsticas");
		lblCaracteristicas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCaracteristicas.setBounds(0, 115, 91, 14);
		contentPane.add(lblCaracteristicas);
		
		txtId = new JTextField();
		txtId.setBounds(101, 12, 109, 20);
		txtId.setEditable( false );
		txtId.setText( String.valueOf( escuela.getId() ) );
		contentPane.add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(101, 37, 109, 20);
		txtNombre.setText( escuela.getNombre() );
		contentPane.add(txtNombre);
		
		txtPais = new JTextField();
		txtPais.setBounds(101, 62, 109, 20);
		txtPais.setText( escuela.getPaisOrigen() );
		contentPane.add(txtPais);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(101, 87, 109, 20);
		txtFecha.setText( escuela.getFechaOrigen() );
		contentPane.add(txtFecha);
		
		JButton btnCancelar = new JButton("Cancel");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(42, 198, 81, 23);
		contentPane.add(btnCancelar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarEscuela(escuela.getId(), txtNombre.getText(), txtPais.getText(), txtFecha.getText(), txtCaracteristicas.getText());
					JOptionPane.showMessageDialog( null, "La escuela ha sido actualiza exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(232, 198, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarEscuela(escuela.getId());
					JOptionPane.showMessageDialog( null, "La escuela ha sido eliminada exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(133, 198, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(45, 15, 46, 14);
		contentPane.add(lblId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 115, 166, 42);
		contentPane.add(scrollPane);
		
		txtCaracteristicas = new JTextArea();
		scrollPane.setViewportView(txtCaracteristicas);
		txtCaracteristicas.setWrapStyleWord(true);
		txtCaracteristicas.setLineWrap(true);
		txtCaracteristicas.setText( escuela.getCaracteristicas() );
	}
}
