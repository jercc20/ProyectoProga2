package presentacion;

import javax.swing.SwingUtilities;

import test.DAOPersona;
import test.Persona;
import logica.Escuela; //TMP!!!
import logica.DAOEscuela; //TMP!!!

public class Principal {

	public static void main(String[] args) {
		
		/*TEST*/
		Escuela e1= new Escuela("test", "cr", "10-10-2010", "testing");
		DAOEscuela.crear( e1 );
		Escuela e2 = new Escuela("test2", "cr2", "11-11-2011", "testing2");
		DAOEscuela.crear( e2 );
		Escuela e3 = DAOEscuela.buscar(2);
		System.out.println( e3.getNombre() );
		e3.setNombre("test2_update");
		DAOEscuela.actualizar( e3 );
		System.out.println( "Id generado y agregado a la instancia:" +  e1.getId() );
		DAOEscuela.borrar( e1 );
		/*END*/
		
		/*SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				PantallaPrincipal pantConsulta = new PantallaPrincipal();
				pantConsulta.setVisible(true);
				
			}
		});*/
		
	}

}
