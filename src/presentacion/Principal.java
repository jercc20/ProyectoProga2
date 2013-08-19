package presentacion;

import javax.swing.SwingUtilities;

public class Principal {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				PantallaPrincipal pantConsulta = new PantallaPrincipal();
				pantConsulta.setVisible(true);
				
			}
		});
		
	}

}
