package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.List;
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
import javax.swing.JList;

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
	private List listAdquisiciones;

	public PantallaActualizarPintura( Pintura pPintura ) {
		
		pintura = pPintura;
		setTitle("Actualizar Pintura");
		setResizable(false);
		setBounds(100, 100, 430, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setDisplayedMnemonic('C');
		lblCodigo.setBounds(60, 14, 128, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setBounds(142, 39, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDimensiones = new JLabel("Dimensiones");
		lblDimensiones.setDisplayedMnemonic('D');
		lblDimensiones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDimensiones.setBounds(108, 64, 80, 14);
		contentPane.add(lblDimensiones);
		
		JLabel lblFechaCreacion = new JLabel("Fecha de creaci\u00F3n");
		lblFechaCreacion.setDisplayedMnemonic('F');
		lblFechaCreacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaCreacion.setBounds(60, 89, 128, 14);
		contentPane.add(lblFechaCreacion);
		
		JLabel lblTiempoTardado = new JLabel("Tiempo tardado");
		lblTiempoTardado.setDisplayedMnemonic('e');
		lblTiempoTardado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTiempoTardado.setBounds(70, 114, 118, 14);
		contentPane.add(lblTiempoTardado);
		
		JLabel lblTcnica = new JLabel("T\u00E9cnica");
		lblTcnica.setDisplayedMnemonic('T');
		lblTcnica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcnica.setBounds(142, 139, 46, 14);
		contentPane.add(lblTcnica);
		
		lblCondicionActual = new JLabel("Condici\u00F3n actual");
		lblCondicionActual.setDisplayedMnemonic('i');
		lblCondicionActual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondicionActual.setLabelFor(cmbCondicionActual);
		lblCondicionActual.setBounds(60, 164, 128, 14);
		contentPane.add(lblCondicionActual);
		
		lblFamosa = new JLabel("Famosa");
		lblFamosa.setDisplayedMnemonic('s');
		lblFamosa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFamosa.setBounds(142, 189, 46, 14);
		contentPane.add(lblFamosa);
		lblFamosa.setLabelFor(cmbFamosa);
		
		JLabel lblPintor = new JLabel("Id Pintor");
		lblPintor.setDisplayedMnemonic('p');
		lblPintor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPintor.setBounds(117, 214, 66, 14);
		contentPane.add(lblPintor);
		lblPintor.setLabelFor(txtIdPintor);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		lblCodigo.setLabelFor(txtCodigo);
		txtCodigo.setBounds(198, 11, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setText(pintura.getCodigo());
		
		txtNombre = new JTextField();
		lblNombre.setLabelFor(txtNombre);
		txtNombre.setBounds(198, 36, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setText(pintura.getNombre());
		
		txtDimensiones = new JTextField();
		lblDimensiones.setLabelFor(txtDimensiones);
		txtDimensiones.setBounds(198, 61, 86, 20);
		contentPane.add(txtDimensiones);
		txtDimensiones.setText(pintura.getDimensiones());
		
		txtFechaCreacion = new JTextField();
		lblFechaCreacion.setLabelFor(txtFechaCreacion);
		txtFechaCreacion.setBounds(198, 86, 86, 20);
		contentPane.add(txtFechaCreacion);
		txtFechaCreacion.setText(pintura.getFechaCreacion());
		
		txtTiempoTardado = new JTextField();
		lblTiempoTardado.setLabelFor(txtTiempoTardado);
		txtTiempoTardado.setBounds(198, 111, 86, 20);
		contentPane.add(txtTiempoTardado);
		txtTiempoTardado.setText(pintura.getTiempoTardado());
		
		txtTecnica = new JTextField();
		lblTcnica.setLabelFor(txtTecnica);
		txtTecnica.setBounds(198, 136, 86, 20);
		contentPane.add(txtTecnica);
		txtTecnica.setText(pintura.getTecnica());
		
		cmbCondicionActual = new JComboBox<String>();
		cmbCondicionActual.setModel(new DefaultComboBoxModel<String>(new String[] {"Excelente", "Buena", "Regular", "Mala"}));
		cmbCondicionActual.setBounds(198, 161, 86, 20);
		contentPane.add(cmbCondicionActual);
		cmbCondicionActual.setSelectedIndex(pintura.getCondicionActual());
		
		cmbFamosa = new JComboBox<String>();
		cmbFamosa.setModel(new DefaultComboBoxModel<String>(new String[] {"S\u00ED", "No"}));
		cmbFamosa.setBounds(198, 186, 86, 20);
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
		btnActualizar.setBounds(325, 387, 89, 23);
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
		btnBorrar.setBounds(226, 387, 89, 23);
		contentPane.add(btnBorrar);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(127, 387, 89, 23);
		contentPane.add(btnCancel);
		
		txtIdPintor = new JTextField();
		txtIdPintor.setBounds(198, 214, 86, 20);
		txtIdPintor.setEditable(false);
		txtIdPintor.setText(pintura.getPintor().getId());
		contentPane.add(txtIdPintor);
		
		JButton btnCrearAdquisicion = new JButton("Agregar Adquisici\u00F3n");
		btnCrearAdquisicion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnCrearAdquisicion_mouseClicked(e);
			}
		});
		btnCrearAdquisicion.setBounds(4, 320, 134, 23);
		contentPane.add(btnCrearAdquisicion);
		
		listAdquisiciones = new List();
		listAdquisiciones.setBounds(148, 242, 266, 134);
		contentPane.add(listAdquisiciones);
		
		JButton btnBuscarAdquisiciones = new JButton("Buscar Adquisiciones");
		btnBuscarAdquisiciones.setBounds(4, 257, 134, 23);
		contentPane.add(btnBuscarAdquisiciones);
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
