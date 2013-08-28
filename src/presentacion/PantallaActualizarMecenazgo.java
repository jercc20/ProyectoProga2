package presentacion;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Gestor;
import logica.Mecenazgo;

public class PantallaActualizarMecenazgo extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaFinal;
	private JTextField txtIdPintor;
	private JTextField txtIdMecenas;
	private JTextField txtFechaInicio;
	private JLabel lblFechaInicio;
	private JButton btnBorrar;
	
	private Mecenazgo mecenazgo;

	public PantallaActualizarMecenazgo(Mecenazgo pMecenazgo) {
		
		mecenazgo = pMecenazgo;
		
		setResizable(false);
		setTitle("Actualizar Mecenazgo");
		setBounds(100, 100, 336, 200);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final");
		lblFechaFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaFinal.setBounds(45, 39, 105, 14);
		contentPane.add(lblFechaFinal);
		
		JLabel lblIdPintor = new JLabel("Id Pintor");
		lblIdPintor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdPintor.setBounds(45, 64, 105, 14);
		contentPane.add(lblIdPintor);
		
		JLabel lblIdMecenas = new JLabel("Id Mecenas");
		lblIdMecenas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdMecenas.setBounds(58, 89, 92, 14);
		contentPane.add(lblIdMecenas);
		
		txtFechaFinal = new JTextField();
		txtFechaFinal.setBounds(160, 36, 109, 20);
		txtFechaFinal.setText(mecenazgo.getFechaFin());
		contentPane.add(txtFechaFinal);
		txtFechaFinal.setColumns(10);
		
		txtIdPintor = new JTextField();
		txtIdPintor.setBounds(160, 61, 109, 20);
		txtIdPintor.setText(mecenazgo.getPintor().getId());
		txtIdPintor.setEditable(false);
		contentPane.add(txtIdPintor);
		txtIdPintor.setColumns(10);
		
		txtIdMecenas = new JTextField();
		txtIdMecenas.setBounds(160, 86, 109, 20);
		txtIdMecenas.setText(mecenazgo.getMecenas().getId());
		txtIdMecenas.setEditable(false);
		contentPane.add(txtIdMecenas);
		txtIdMecenas.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarMecenazgo(txtIdMecenas.getText(), txtIdPintor.getText(), txtFechaInicio.getText(), txtFechaFinal.getText());
					JOptionPane.showMessageDialog( null, "El mecenazgo ha sido actualizo exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(227, 127, 81, 23);
		contentPane.add(btnActualizar);
		
		JButton btnCancelar = new JButton("Cancel");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(19, 127, 81, 23);
		contentPane.add(btnCancelar);
		
		txtFechaInicio = new JTextField();
		txtFechaInicio.setBounds(160, 11, 109, 20);
		txtFechaInicio.setText(mecenazgo.getFechaInicio());
		contentPane.add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		lblFechaInicio = new JLabel("Fecha de Inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setBounds(45, 14, 105, 14);
		contentPane.add(lblFechaInicio);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarMecenazgo( txtIdMecenas.getText(), txtIdPintor.getText() );
					JOptionPane.showMessageDialog( null, "El mecenazgo ha sido eliminado exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(119, 127, 89, 23);
		contentPane.add(btnBorrar);
	}
}
