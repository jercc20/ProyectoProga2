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
	private JTextField txtFechaAdquisicion;
	private JComboBox<String> cmbCondicionAdquisicion;
	private JComboBox<String> cmbCondicionActual;
	private JLabel lblCondicionActual;
	private JLabel lblCostoAdquisicion;
	private JTextField txtCostoAdquisicion;
	private JLabel lblFamosa;
	private JComboBox<String> cmbFamosa;
	private JLabel lblHistoria;
	private JTextArea txtHistoria;
	private JScrollPane scrollPane;
	private JButton btnCrear;
	private JButton btnCancel;
	
	private Gestor gestor;

	public PantallaCrearPintura() {
		
		setTitle("Crear Pintura");
		setResizable(false);
		setBounds(100, 100, 441, 445);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setDisplayedMnemonic('C');
		lblCodigo.setBounds(10, 11, 128, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setBounds(92, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDimensiones = new JLabel("Dimensiones");
		lblDimensiones.setDisplayedMnemonic('D');
		lblDimensiones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDimensiones.setBounds(58, 61, 80, 14);
		contentPane.add(lblDimensiones);
		
		JLabel lblFechaCreacion = new JLabel("Fecha de creaci\u00F3n");
		lblFechaCreacion.setDisplayedMnemonic('F');
		lblFechaCreacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaCreacion.setBounds(10, 86, 128, 14);
		contentPane.add(lblFechaCreacion);
		
		JLabel lblTiempoTardado = new JLabel("Tiempo tardado");
		lblTiempoTardado.setDisplayedMnemonic('e');
		lblTiempoTardado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTiempoTardado.setBounds(20, 111, 118, 14);
		contentPane.add(lblTiempoTardado);
		
		JLabel lblTcnica = new JLabel("T\u00E9cnica");
		lblTcnica.setDisplayedMnemonic('T');
		lblTcnica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcnica.setBounds(92, 136, 46, 14);
		contentPane.add(lblTcnica);
		
		JLabel lblFechaAdquisicion = new JLabel("Fecha de adquisici\u00F3n");
		lblFechaAdquisicion.setDisplayedMnemonic('q');
		lblFechaAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaAdquisicion.setBounds(10, 163, 128, 14);
		contentPane.add(lblFechaAdquisicion);
		
		JLabel lblCondicionAdquisicion = new JLabel("Condici\u00F3n de adquisici\u00F3n");
		lblCondicionAdquisicion.setDisplayedMnemonic('A');
		lblCondicionAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionAdquisicion.setBounds(0, 188, 138, 14);
		contentPane.add(lblCondicionAdquisicion);
		
		lblCondicionActual = new JLabel("Condici\u00F3n actual");
		lblCondicionActual.setDisplayedMnemonic('i');
		lblCondicionActual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionActual.setLabelFor(cmbCondicionActual);
		lblCondicionActual.setBounds(10, 213, 128, 14);
		contentPane.add(lblCondicionActual);
		
		lblCostoAdquisicion = new JLabel("Costo de adquisici\u00F3n");
		lblCostoAdquisicion.setDisplayedMnemonic('o');
		lblCostoAdquisicion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostoAdquisicion.setBounds(10, 238, 128, 14);
		contentPane.add(lblCostoAdquisicion);
		lblCostoAdquisicion.setLabelFor(txtCostoAdquisicion);
		
		lblFamosa = new JLabel("Famosa");
		lblFamosa.setDisplayedMnemonic('s');
		lblFamosa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFamosa.setBounds(92, 263, 46, 14);
		contentPane.add(lblFamosa);
		lblFamosa.setLabelFor(cmbFamosa);
		
		lblHistoria = new JLabel("Historia");
		lblHistoria.setDisplayedMnemonic('H');
		lblHistoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHistoria.setBounds(92, 288, 46, 14);
		contentPane.add(lblHistoria);
		lblHistoria.setLabelFor(txtHistoria);
		
		txtCodigo = new JTextField();
		lblCodigo.setLabelFor(txtCodigo);
		txtCodigo.setBounds(148, 8, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		lblNombre.setLabelFor(txtNombre);
		txtNombre.setBounds(148, 33, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDimensiones = new JTextField();
		lblDimensiones.setLabelFor(txtDimensiones);
		txtDimensiones.setBounds(148, 58, 86, 20);
		contentPane.add(txtDimensiones);
		txtDimensiones.setColumns(10);
		
		txtFechaCreacion = new JTextField();
		lblFechaCreacion.setLabelFor(txtFechaCreacion);
		txtFechaCreacion.setBounds(148, 83, 86, 20);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setColumns(10);
		
		txtTiempoTardado = new JTextField();
		lblTiempoTardado.setLabelFor(txtTiempoTardado);
		txtTiempoTardado.setBounds(148, 108, 86, 20);
		contentPane.add(txtTiempoTardado);
		txtTiempoTardado.setColumns(10);
		
		txtTecnica = new JTextField();
		lblTcnica.setLabelFor(txtTecnica);
		txtTecnica.setBounds(148, 133, 86, 20);
		contentPane.add(txtTecnica);
		txtTecnica.setColumns(10);
		
		txtFechaAdquisicion = new JTextField();
		lblFechaAdquisicion.setLabelFor(txtFechaAdquisicion);
		txtFechaAdquisicion.setBounds(148, 160, 86, 20);
		contentPane.add(txtFechaAdquisicion);
		txtFechaAdquisicion.setColumns(10);
		
		cmbCondicionAdquisicion = new JComboBox<String>();
		lblCondicionAdquisicion.setLabelFor(cmbCondicionAdquisicion);
		cmbCondicionAdquisicion.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionAdquisicion.setBounds(148, 185, 86, 20);
		contentPane.add(cmbCondicionAdquisicion);
		
		cmbCondicionActual = new JComboBox<String>();
		cmbCondicionActual.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionActual.setBounds(148, 210, 86, 20);
		contentPane.add(cmbCondicionActual);
		
		txtCostoAdquisicion = new JTextField();
		txtCostoAdquisicion.setBounds(148, 235, 86, 20);
		contentPane.add(txtCostoAdquisicion);
		txtCostoAdquisicion.setColumns(10);
		
		cmbFamosa = new JComboBox<String>();
		cmbFamosa.setModel(new DefaultComboBoxModel<String>(new String[] {"S\u00ED", "No"}));
		cmbFamosa.setBounds(148, 260, 86, 20);
		contentPane.add(cmbFamosa);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 283, 177, 45);
		contentPane.add(scrollPane);
		
		txtHistoria = new JTextArea();
		txtHistoria.setLineWrap(true);
		scrollPane.setViewportView(txtHistoria);
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					gestor.crearPintura(Integer.parseInt( txtCodigo.getText() ), txtNombre.getText(), txtDimensiones.getText(), txtFechaCreacion.getText(), txtTiempoTardado.getText(), txtTecnica.getText(), txtFechaAdquisicion.getText(), cmbCondicionAdquisicion.getSelectedIndex(), cmbCondicionActual.getSelectedIndex(), txtCostoAdquisicion.getText(), cmbFamosa.getSelectedIndex(), txtHistoria.getText(), 0, 0);
					JOptionPane.showMessageDialog( null, "La pintura ha sido creada exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
					e1.printStackTrace();
				}
			}
		});
		btnCrear.setBounds(336, 383, 89, 23);
		contentPane.add(btnCrear);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(237, 383, 89, 23);
		contentPane.add(btnCancel);
	}

}
