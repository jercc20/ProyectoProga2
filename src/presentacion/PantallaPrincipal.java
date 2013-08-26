package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grupoRdBtns = new ButtonGroup();
	private String seleccionado;
	
	public PantallaPrincipal() {
		
		setResizable(false);
		setTitle("Sistema de Galer\u00EDas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 230);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnEscuela = new JRadioButton("Escuela");
		rdbtnEscuela.setMnemonic('e');
		grupoRdBtns.add(rdbtnEscuela);
		rdbtnEscuela.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnEscuela.setBounds(6, 9, 109, 23);
		rdbtnEscuela.setSelected(true);
		seleccionado = "Escuela";
		contentPane.add(rdbtnEscuela);
		rdbtnEscuela.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		
		JRadioButton rdbtnPintor = new JRadioButton("Pintor");
		rdbtnPintor.setMnemonic('o');
		grupoRdBtns.add(rdbtnPintor);
		rdbtnPintor.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnPintor.setBounds(6, 41, 109, 23);
		contentPane.add(rdbtnPintor);
		rdbtnPintor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		
		JRadioButton rdbtnPintura = new JRadioButton("Pintura");
		rdbtnPintura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		rdbtnPintura.setMnemonic('P');
		grupoRdBtns.add(rdbtnPintura);
		rdbtnPintura.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnPintura.setBounds(6, 73, 109, 23);
		contentPane.add(rdbtnPintura);
		
		JRadioButton rdbtnGaleria = new JRadioButton("Galer\u00EDa");
		rdbtnGaleria.setMnemonic('g');
		grupoRdBtns.add(rdbtnGaleria);
		rdbtnGaleria.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnGaleria.setBounds(6, 105, 109, 23);
		contentPane.add(rdbtnGaleria);
		rdbtnGaleria.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		
		JRadioButton rdbtnColeccionista = new JRadioButton("Coleccionista");
		rdbtnColeccionista.setMnemonic('m');
		grupoRdBtns.add(rdbtnColeccionista);
		rdbtnColeccionista.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnColeccionista.setBounds(6, 137, 109, 23);
		contentPane.add(rdbtnColeccionista);
		rdbtnColeccionista.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		
		JRadioButton rdbtnMecenas = new JRadioButton("Mecenas");
		rdbtnMecenas.setMnemonic('m');
		grupoRdBtns.add(rdbtnMecenas);
		rdbtnMecenas.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnMecenas.setBounds(6, 169, 109, 23);
		contentPane.add(rdbtnMecenas);
		rdbtnMecenas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (((JRadioButton)e.getSource()).isSelected()){
					seleccionado = ((JRadioButton)e.getSource()).getText();
				}
			}
		});
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(138, 33, 89, 23);
		contentPane.add(btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPantallaCrear(seleccionado);
			}
		});
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(138, 67, 89, 23);
		contentPane.add(btnConsultar);
		
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPantallaConsultar(seleccionado);
			}
		});
	}
	
	public void mostrarPantallaCrear(String seleccionado){
		
		switch (seleccionado){
			
			case "Pintura":
				PantallaCrearPintura pantallaPintura = new PantallaCrearPintura();
				pantallaPintura.setVisible(true);
				break;
				
			case "Pintor":
				PantallaCrearPintor pantallaPintor = new PantallaCrearPintor();
				pantallaPintor.setVisible(true);
				break;
			
			case "Galer\u00EDa":
				PantallaCrearGaleria pantallaGaleria = new PantallaCrearGaleria();
				pantallaGaleria.setVisible(true);
				break;
				
			case "Escuela":
				PantallaCrearEscuela pantallaEscuela = new PantallaCrearEscuela();
				pantallaEscuela.setVisible(true);
				break;
				
			case "Mecenas":
				PantallaCrearMecenas pantallaMecenas = new PantallaCrearMecenas();
				pantallaMecenas.setVisible(true);
				break;
				
			case "Coleccionista":
				PantallaCrearColeccionista pantallaColeccionista = new PantallaCrearColeccionista();
				pantallaColeccionista.setVisible(true);
				break;
		}
		
		
	}
	
	public void mostrarPantallaConsultar(String seleccionado){
		
		switch (seleccionado){
			
			case "Pintura":
				PantallaConsultarPintura pantallaPintura = new PantallaConsultarPintura();
				pantallaPintura.setVisible(true);
				break;
				
			case "Pintor":
				PantallaConsultarPintor pantallaPintor = new PantallaConsultarPintor();
				pantallaPintor.setVisible(true);
				break;
			
			case "Galer\u00EDa":
				PantallaConsultarGaleria pantallaGaleria = new PantallaConsultarGaleria();
				pantallaGaleria.setVisible(true);
				break;
				
			case "Escuela":
				PantallaConsultarEscuela pantallaEscuela = new PantallaConsultarEscuela();
				pantallaEscuela.setVisible(true);
				break;
				
			case "Mecenas":
				PantallaConsultarMecenas pantallaMecenas = new PantallaConsultarMecenas();
				pantallaMecenas.setVisible(true);
				break;
				
			case "Coleccionista":
				PantallaConsultarColeccionista pantallaColeccionista = new PantallaConsultarColeccionista();
				pantallaColeccionista.setVisible(true);
				break;
		}
		
		
	}
}
