package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.Gestor;

public class PantallaAgregarMaestro extends JFrame {

	private JPanel contentPane;
	private JTextField txtidpintor;
	private JTextField txtIdMaestro;

	/**
	 * Create the frame.
	 */
	public PantallaAgregarMaestro(String pidPintor) {
		setTitle("Agregar Maestro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIdPintor = new JLabel("Id Pintor");
		lblIdPintor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdPintor.setBounds(41, 29, 46, 14);
		contentPane.add(lblIdPintor);

		JLabel lblIdMaestro = new JLabel("Id Maestro");
		lblIdMaestro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdMaestro.setBounds(21, 67, 66, 14);
		contentPane.add(lblIdMaestro);

		txtidpintor = new JTextField();
		txtidpintor.setBounds(97, 26, 126, 17);
		contentPane.add(txtidpintor);
		txtidpintor.setColumns(10);
		txtidpintor.setText(pidPintor);
		txtidpintor.setEnabled(false);

		txtIdMaestro = new JTextField();
		txtIdMaestro.setBounds(97, 64, 126, 17);
		contentPane.add(txtIdMaestro);
		txtIdMaestro.setColumns(10);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(21, 106, 89, 23);
		contentPane.add(btnCancel);

		JButton btnCrear = new JButton("Agregar");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor.agregarMaestro(txtidpintor.getText(), txtIdMaestro.getText());
					JOptionPane.showMessageDialog(null, "El maestro ha sido agregado exitosamente!");
				} catch (Exception e1) {
					JOptionPane
							.showMessageDialog(null, 	"Hubo un error\nPor favor revise los datos ingresados");
					e1.printStackTrace();
				}
				setVisible(false);

			}
		});
		btnCrear.setBounds(134, 106, 89, 23);
		contentPane.add(btnCrear);
	}
}
