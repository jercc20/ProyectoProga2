package presentacion;

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
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.Gestor;
import logica.Pintura;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaActualizarPintura extends JFrame {

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
	private JTextField txtIdPintor;
	
	private Pintura pintura;
	private JButton btnCancel;

	public PantallaActualizarPintura( Pintura pPintura ) {
		
		pintura = pPintura;
		setTitle("Actualizar Pintura");
		setResizable(false);
		setBounds(100, 100, 441, 335);
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
		
		lblCondicionActual = new JLabel("Condici\u00F3n actual");
		lblCondicionActual.setDisplayedMnemonic('i');
		lblCondicionActual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionActual.setLabelFor(cmbCondicionActual);
		lblCondicionActual.setBounds(10, 161, 128, 14);
		contentPane.add(lblCondicionActual);
		
		lblFamosa = new JLabel("Famosa");
		lblFamosa.setDisplayedMnemonic('s');
		lblFamosa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFamosa.setBounds(92, 186, 46, 14);
		contentPane.add(lblFamosa);
		lblFamosa.setLabelFor(cmbFamosa);
		
		JLabel lblPintor = new JLabel("Id Pintor");
		lblPintor.setDisplayedMnemonic('p');
		lblPintor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPintor.setBounds(67, 211, 66, 14);
		contentPane.add(lblPintor);
		lblPintor.setLabelFor(txtIdPintor);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		lblCodigo.setLabelFor(txtCodigo);
		txtCodigo.setBounds(148, 8, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setText(pintura.getCodigo());
		
		txtNombre = new JTextField();
		lblNombre.setLabelFor(txtNombre);
		txtNombre.setBounds(148, 33, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setText(pintura.getNombre());
		
		txtDimensiones = new JTextField();
		lblDimensiones.setLabelFor(txtDimensiones);
		txtDimensiones.setBounds(148, 58, 86, 20);
		contentPane.add(txtDimensiones);
		txtDimensiones.setText(pintura.getDimensiones());
		
		txtFechaCreacion = new JTextField();
		lblFechaCreacion.setLabelFor(txtFechaCreacion);
		txtFechaCreacion.setBounds(148, 83, 86, 20);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setText(pintura.getFechaCreacion());
		
		txtTiempoTardado = new JTextField();
		lblTiempoTardado.setLabelFor(txtTiempoTardado);
		txtTiempoTardado.setBounds(148, 108, 86, 20);
		contentPane.add(txtTiempoTardado);
		txtTiempoTardado.setText(pintura.getTiempoTardado());
		
		txtTecnica = new JTextField();
		lblTcnica.setLabelFor(txtTecnica);
		txtTecnica.setBounds(148, 133, 86, 20);
		contentPane.add(txtTecnica);
		txtTecnica.setText(pintura.getTecnica());
		
		cmbCondicionActual = new JComboBox<String>();
		cmbCondicionActual.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionActual.setBounds(148, 158, 86, 20);
		contentPane.add(cmbCondicionActual);
		cmbCondicionActual.setSelectedIndex(pintura.getCondicionActual());
		
		cmbFamosa = new JComboBox<String>();
		cmbFamosa.setModel(new DefaultComboBoxModel<String>(new String[] {"S\u00ED", "No"}));
		cmbFamosa.setBounds(148, 183, 86, 20);
		contentPane.add(cmbFamosa);
		cmbFamosa.setSelectedIndex(pintura.getEsFamosa());
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.actualizarPintura( txtCodigo.getText(), txtNombre.getText(), txtDimensiones.getText(), txtFechaCreacion.getText(), txtTiempoTardado.getText(), txtTecnica.getText(), cmbCondicionActual.getSelectedIndex(), cmbFamosa.getSelectedIndex());
					JOptionPane.showMessageDialog( null, "La pintura ha sido creada exitosamente!" );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnActualizar.setBounds(336, 269, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.borrarPintura(pintura.getCodigo());
					JOptionPane.showMessageDialog( null, "La pintura ha sido borrada exitosamente!" );
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnBorrar.setBounds(237, 269, 89, 23);
		contentPane.add(btnBorrar);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(145, 269, 89, 23);
		contentPane.add(btnCancel);
		
		txtIdPintor = new JTextField();
		txtIdPintor.setBounds(148, 211, 86, 20);
		txtIdPintor.setEditable(false);
		txtIdPintor.setText(pintura.getPintor().getId());
		contentPane.add(txtIdPintor);
		
		JButton btnCrearAdquisicion = new JButton("Crear Adquisici\u00F3n");
		btnCrearAdquisicion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnCrearAdquisicion_mouseClicked(e);
			}
		});
		btnCrearAdquisicion.setBounds(261, 132, 134, 23);
		contentPane.add(btnCrearAdquisicion);
	}
	
	public void btnCrearAdquisicion_mouseClicked(MouseEvent e) {
		try {
			PantallaCrearAdquisicion p;
			p = new PantallaCrearAdquisicion(txtCodigo.getText());
			p.setVisible(true);
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this,"","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
