package presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import logica.Gestor;
import logica.Pintura;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaConsultarPintura extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;

	public PantallaConsultarPintura() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setResizable(false);
		setTitle("Consultar Pintura");
		setBounds(100, 100, 311, 131);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Pintura pintura = Gestor.consultarPintura( txtId.getText() );
					PantallaActualizarPintura pantallaPintura = new PantallaActualizarPintura( pintura );
					pantallaPintura.setVisible(true);
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null, "No se ha podido encontrar por el codigo indicado");
				}
			}
		});
		btnConsultar.setBounds(206, 69, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblPorId = new JLabel("Codigo");
		lblPorId.setDisplayedMnemonic('I');
		lblPorId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorId.setBounds(64, 27, 46, 14);
		contentPane.add(lblPorId);
		
		txtId = new JTextField();
		lblPorId.setLabelFor(txtId);
		txtId.setBounds(120, 24, 117, 20);
		contentPane.add(txtId);
		
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
