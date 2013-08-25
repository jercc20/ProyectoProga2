package presentacion;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logica.Adquisicion;
import logica.Gestor;



public class PantallaActualizarAdquisicion extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtFechaAdquisicion;
	private JComboBox<String> cmbCondicionAdquisicion;
	private JLabel lblCostoAdquisicion;
	private JTextField txtCostoAdquisicion;
	private JButton btnActualizar;
	private JButton btnCancel;
	
	private Gestor gestor;
	private JTextField txtIdPropietario;
	private JLabel lblIdPropietario;
	
	private Adquisicion adquisicion;

	public PantallaActualizarAdquisicion(Adquisicion pAdquisicion) {
		
		adquisicion = pAdquisicion;
		
		setTitle("Actualizar Adquisici\u00F3n");
		setResizable(false);
		setBounds(100, 100, 350, 240);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setDisplayedMnemonic('C');
		lblCodigo.setBounds(11, 15, 128, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblFechaAdquisicion = new JLabel("Fecha de adquisici\u00F3n");
		lblFechaAdquisicion.setDisplayedMnemonic('q');
		lblFechaAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaAdquisicion.setBounds(11, 73, 128, 14);
		contentPane.add(lblFechaAdquisicion);
		
		JLabel lblCondicionAdquisicion = new JLabel("Condici\u00F3n de adquisici\u00F3n");
		lblCondicionAdquisicion.setDisplayedMnemonic('A');
		lblCondicionAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionAdquisicion.setBounds(0, 102, 138, 14);
		contentPane.add(lblCondicionAdquisicion);
		
		lblCostoAdquisicion = new JLabel("Costo de adquisici\u00F3n");
		lblCostoAdquisicion.setDisplayedMnemonic('o');
		lblCostoAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostoAdquisicion.setBounds(10, 131, 128, 14);
		contentPane.add(lblCostoAdquisicion);
		lblCostoAdquisicion.setLabelFor(txtCostoAdquisicion);
		
		txtCodigo = new JTextField();
		lblCodigo.setLabelFor(txtCodigo);
		txtCodigo.setBounds(149, 10, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtFechaAdquisicion = new JTextField();
		lblFechaAdquisicion.setLabelFor(txtFechaAdquisicion);
		txtFechaAdquisicion.setBounds(148, 70, 86, 20);
		contentPane.add(txtFechaAdquisicion);
		txtFechaAdquisicion.setColumns(10);
		
		cmbCondicionAdquisicion = new JComboBox<String>();
		lblCondicionAdquisicion.setLabelFor(cmbCondicionAdquisicion);
		cmbCondicionAdquisicion.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionAdquisicion.setBounds(148, 100, 86, 20);
		contentPane.add(cmbCondicionAdquisicion);
		
		txtCostoAdquisicion = new JTextField();
		txtCostoAdquisicion.setBounds(148, 130, 86, 20);
		contentPane.add(txtCostoAdquisicion);
		txtCostoAdquisicion.setColumns(10);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarAdquisicion(adquisicion.getCodigoPintura(), txtIdPropietario.getText(), txtFechaAdquisicion.getText(), cmbCondicionAdquisicion.getSelectedIndex(), txtCostoAdquisicion.getText());
					JOptionPane.showMessageDialog( null, "El coleccionista ha sido actualiza exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(235, 177, 89, 23);
		contentPane.add(btnActualizar);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(19, 177, 89, 23);
		contentPane.add(btnCancel);
		
		txtIdPropietario = new JTextField();
		txtIdPropietario.setColumns(10);
		txtIdPropietario.setBounds(149, 40, 86, 20);
		contentPane.add(txtIdPropietario);
		
		lblIdPropietario = new JLabel("Id Propietario");
		lblIdPropietario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdPropietario.setDisplayedMnemonic('N');
		lblIdPropietario.setBounds(32, 44, 107, 14);
		contentPane.add(lblIdPropietario);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarAdquisicion(adquisicion.getCodigoPintura());
					JOptionPane.showMessageDialog( null, "La aduisicion ha sido eliminada exitosamente.");
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error");
				}
			}
		});
		btnBorrar.setBounds(127, 177, 89, 23);
		contentPane.add(btnBorrar);
	}
}
