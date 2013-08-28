package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Adquisicion;
import logica.DAOGaleria;
import logica.DAOPintura;
import logica.Galeria;
import logica.Gestor;
import logica.Pintura;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class PantallaCrearExposicion extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdGaleria;
	private JTextField txtFechaInicio;
	private JTextField txtFechaFinal;
	private List listPinturas;
	private JLabel lblPinturasAExponer;
	private List listPorExponer;
	private JButton btnAgregar;
	private JButton btnCancel;
	private JButton btnCrear;
	private JButton btnRemover;
	private Galeria galeria;
	private ArrayList<Pintura> listaPinturas;
	private ArrayList<Pintura> listaPorExponer;
	

	/**
	 * Create the frame.
	 */
	public PantallaCrearExposicion(Galeria pGaleria) {
		
		galeria =pGaleria;
		
		setTitle("Crear Exposici\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdGaleria = new JLabel("Id Galeria");
		lblIdGaleria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdGaleria.setBounds(10, 13, 96, 14);
		contentPane.add(lblIdGaleria);
		
		txtIdGaleria = new JTextField();
		txtIdGaleria.setBounds(116, 11, 99, 17);
		contentPane.add(txtIdGaleria);
		txtIdGaleria.setColumns(10);
		txtIdGaleria.setText(galeria.getId());
		txtIdGaleria.setEnabled(false);
		
		txtFechaInicio = new JTextField();
		txtFechaInicio.setBounds(116, 32, 99, 17);
		contentPane.add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		txtFechaFinal = new JTextField();
		txtFechaFinal.setColumns(10);
		txtFechaFinal.setBounds(116, 53, 99, 17);
		contentPane.add(txtFechaFinal);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setBounds(20, 34, 86, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final");
		lblFechaFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaFinal.setBounds(20, 55, 86, 14);
		contentPane.add(lblFechaFinal);
		
		JLabel lblListaPinturas = new JLabel("Lista Pinturas");
		lblListaPinturas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblListaPinturas.setBounds(10, 80, 96, 14);
		contentPane.add(lblListaPinturas);
		
		listPinturas = new List();
		listPinturas.setBounds(116, 75, 235, 90);
		contentPane.add(listPinturas);
		
		lblPinturasAExponer = new JLabel("Pinturas a Exponer");
		lblPinturasAExponer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPinturasAExponer.setBounds(10, 180, 96, 14);
		contentPane.add(lblPinturasAExponer);
		
		listPorExponer = new List();
		listPorExponer.setBounds(116, 179, 235, 100);
		contentPane.add(listPorExponer);
		
		if( galeria.getAdquisiciones().size() > 0) {
			for ( Adquisicion a : galeria.getAdquisiciones()) {
				listPinturas.add( "Pintura: " + a.getPintura().getNombre() );
				listaPinturas.add(DAOPintura.buscar(a.getPintura().getCodigo()));
			}
		}
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccion = listPinturas.getSelectedIndex();
				listPorExponer.add(listaPinturas.get(seleccion).getNombre());
				listaPorExponer.add(listaPinturas.get(seleccion));
			}
		});
		btnAgregar.setBounds(20, 115, 89, 23);
		contentPane.add(btnAgregar);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(216, 319, 89, 23);
		contentPane.add(btnCancel);
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.crearExposicion( galeria , txtFechaInicio.getText(), txtFechaFinal.getText(), listaPorExponer);
					JOptionPane.showMessageDialog( null, "El mecenazgo ha sido creado exitosamente!" );
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "Hubo un error\nPor favor revise los datos ingresados");
				}
			}
		});
		btnCrear.setBounds(315, 319, 89, 23);
		contentPane.add(btnCrear);
		
		btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnRemover.setBounds(17, 215, 89, 23);
		contentPane.add(btnRemover);
		
	}
}
