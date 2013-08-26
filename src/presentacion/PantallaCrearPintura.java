package presentacion;

import logica.Gestor;

import java.awt.EventQueue;

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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaCrearPintura extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDimensiones;
	private JTextField txtFechaCreacion;
	private JTextField txtTiempoTardado;
	private JTextField txtTecnica;
	private JComboBox<String> cmbCondicionActual;
	private JLabel lblCondicionActual;
	private JLabel lblFamosa;
	private JComboBox<String> cmbFamosa;
	private JButton btnCrear;
	private JButton btnCancel;

	private JLabel lblIdPintor;
	private JTextField txtIdPintor;

	public PantallaCrearPintura() {
		
		setTitle("Crear Pintura");
		setResizable(false);
		setBounds(100, 100, 441, 440);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setDisplayedMnemonic('C');
		lblCodigo.setBounds(11, 12, 128, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setBounds(93, 38, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDimensiones = new JLabel("Dimensiones");
		lblDimensiones.setDisplayedMnemonic('D');
		lblDimensiones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDimensiones.setBounds(59, 90, 80, 14);
		contentPane.add(lblDimensiones);
		
		JLabel lblFechaCreacion = new JLabel("Fecha de creaci\u00F3n");
		lblFechaCreacion.setDisplayedMnemonic('F');
		lblFechaCreacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaCreacion.setBounds(11, 116, 128, 14);
		contentPane.add(lblFechaCreacion);
		
		JLabel lblTiempoTardado = new JLabel("Tiempo tardado");
		lblTiempoTardado.setDisplayedMnemonic('e');
		lblTiempoTardado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTiempoTardado.setBounds(21, 142, 118, 14);
		contentPane.add(lblTiempoTardado);
		
		JLabel lblTcnica = new JLabel("T\u00E9cnica");
		lblTcnica.setDisplayedMnemonic('T');
		lblTcnica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcnica.setBounds(93, 168, 46, 14);
		contentPane.add(lblTcnica);
		
		lblCondicionActual = new JLabel("Condici\u00F3n actual");
		lblCondicionActual.setDisplayedMnemonic('i');
		lblCondicionActual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionActual.setLabelFor(cmbCondicionActual);
		lblCondicionActual.setBounds(11, 194, 128, 14);
		contentPane.add(lblCondicionActual);
		
		lblFamosa = new JLabel("Famosa");
		lblFamosa.setDisplayedMnemonic('s');
		lblFamosa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFamosa.setBounds(93, 220, 46, 14);
		contentPane.add(lblFamosa);
		lblFamosa.setLabelFor(cmbFamosa);
		
		txtCodigo = new JTextField();
		lblCodigo.setLabelFor(txtCodigo);
		txtCodigo.setBounds(149, 6, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		lblNombre.setLabelFor(txtNombre);
		txtNombre.setBounds(149, 32, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDimensiones = new JTextField();
		lblDimensiones.setLabelFor(txtDimensiones);
		txtDimensiones.setBounds(149, 84, 86, 20);
		contentPane.add(txtDimensiones);
		txtDimensiones.setColumns(10);
		
		txtFechaCreacion = new JTextField();
		lblFechaCreacion.setLabelFor(txtFechaCreacion);
		txtFechaCreacion.setBounds(149, 110, 86, 20);
		txtFechaCreacion.setText("yyyy-mm-dd");
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setColumns(10);
		
		txtTiempoTardado = new JTextField();
		lblTiempoTardado.setLabelFor(txtTiempoTardado);
		txtTiempoTardado.setBounds(149, 136, 86, 20);
		contentPane.add(txtTiempoTardado);
		txtTiempoTardado.setColumns(10);
		
		txtTecnica = new JTextField();
		lblTcnica.setLabelFor(txtTecnica);
		txtTecnica.setBounds(149, 162, 86, 20);
		contentPane.add(txtTecnica);
		txtTecnica.setColumns(10);
		
		cmbCondicionActual = new JComboBox<String>();
		cmbCondicionActual.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionActual.setBounds(149, 188, 86, 20);
		contentPane.add(cmbCondicionActual);
		
		cmbFamosa = new JComboBox<String>();
		cmbFamosa.setModel(new DefaultComboBoxModel<String>(new String[] {"S\u00ED", "No"}));
		cmbFamosa.setBounds(149, 214, 86, 20);
		contentPane.add(cmbFamosa);
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.crearPintura( txtCodigo.getText() , txtNombre.getText(), txtIdPintor.getText(), txtDimensiones.getText(), txtFechaCreacion.getText(), txtTiempoTardado.getText(), txtTecnica.getText(), cmbCondicionActual.getSelectedIndex(), cmbFamosa.getSelectedIndex(), txtIdPintor.getText() );
					JOptionPane.showMessageDialog( null, "La pintura ha sido creada exitosamente!" );
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
					e1.printStackTrace();
				}
			}
		});
		btnCrear.setBounds(336, 350, 89, 23);
		contentPane.add(btnCrear);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(237, 350, 89, 23);
		contentPane.add(btnCancel);
		
		lblIdPintor = new JLabel("Id Pintor");
		lblIdPintor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdPintor.setDisplayedMnemonic('N');
		lblIdPintor.setBounds(67, 64, 66, 14);
		contentPane.add(lblIdPintor);
		
		txtIdPintor = new JTextField();
		txtIdPintor.setColumns(10);
		txtIdPintor.setBounds(149, 58, 86, 20);
		contentPane.add(txtIdPintor);
	}

}
