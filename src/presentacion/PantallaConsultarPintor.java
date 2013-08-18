package capaPresentacionLocal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import capaLogica.Gestor;
import capaLogica.Pintor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaConsultarPintor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConsultarPintor frame = new PantallaConsultarPintor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaConsultarPintor() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setResizable(false);
		setTitle("Consultar Pintor");
		setBounds(100, 100, 311, 131);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPorNombre = new JLabel("Por Nombre");
		lblPorNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorNombre.setDisplayedMnemonic('N');
		lblPorNombre.setBounds(10, 11, 102, 14);
		contentPane.add(lblPorNombre);
		
		txtNombre = new JTextField();
		lblPorNombre.setLabelFor(txtNombre);
		txtNombre.setBounds(122, 8, 117, 20);
		txtNombre.setEditable(false);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Pintor pintor = Gestor.consultarPintor(Integer.parseInt( txtId.getText() ));
					PantallaActualizarPintor pantallaPintor = new PantallaActualizarPintor( pintor );
					pantallaPintor.setVisible(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "No se ha podido encontrar por el id indicado");
				}
			}
		});
		btnConsultar.setBounds(206, 69, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblPorId = new JLabel("Por Id");
		lblPorId.setDisplayedMnemonic('I');
		lblPorId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorId.setBounds(66, 36, 46, 14);
		contentPane.add(lblPorId);
		
		txtId = new JTextField();
		lblPorId.setLabelFor(txtId);
		txtId.setBounds(122, 33, 117, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(107, 69, 89, 23);
		contentPane.add(btnCancel);
	}
}
