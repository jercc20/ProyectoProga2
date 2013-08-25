package presentacion;

import java.sql.Date;

import javax.swing.SwingUtilities;

import test.DAOPersona;
import test.Persona;
import logica.*; //TMP!!!
import logica.*; //TMP!!!

public class Principal {

	public static void main(String[] args) {
		
		/*TEST*/
		
		//Escuela
		//Escuela e1= new Escuela("test", "cr", "2010-10-10", "testing");
		//DAOEscuela.crear( e1 );
		//Escuela e2 = new Escuela("test2", "cr2", "2011-11-11", "testing2");
		//DAOEscuela.crear( e2 );
		//Escuela e3 = DAOEscuela.buscar(2);
		//System.out.println( e3.getNombre() );
		//e3.setNombre("test2_update");
		//DAOEscuela.actualizar( e3 );
		//System.out.println( "Id generado y agregado a la instancia:" +  e1.getId() );
		//DAOEscuela.borrar( e1 );
		
		//Pintor
		//Pintor p1 = new Pintor("pint1", "nombre", "a", "cr", "sj", "2010-10-10", "2011-11-11", "Bueno");
		//DAOPintor.crear( p1 );
		//Pintor p2 = new Pintor("pint2", "nombre2", "a2", "cr", "sj", "1980-12-25", "2011-11-11", "Bueno");
		//DAOPintor.crear( p2 );
		//Pintor p3 = DAOPintor.buscar("pint2");
		//System.out.println( p3.getId() );
		//p3.setNombre("name_update");
		//p3.setEscuela( DAOEscuela.buscar(1) );
		//System.out.println( p3.getMaestros().size() );
		//p3.setMaestro( DAOPintor.buscar("pint3") );
		//DAOPintor.actualizar( p3 );
		//System.out.println( p3.getEscuela().getNombre() );
		//System.out.println( p3.getMaestros().size() );
		//DAOPintor.borrar( p1 );
		
		//Mecenas
		//Mecenas m1= new Mecenas("mece1", "nombre Mecenas", "cr", "sj", "2014-09-08");
		//DAOMecenas.crear( m1 );
		//Mecenas m2 = new Mecenas("mece2", "nombre Mecenas", "cr", "sj", "2014-09-08");
		//DAOMecenas.crear( m2 );
		//Mecenas m3 = DAOMecenas.buscar("mece2");
		//System.out.println( m3.getNombre() );
		//m3.setNombre("name_update");
		//DAOMecenas.actualizar( m3 );
		//DAOMecenas.borrar( m1 );
		
		/*END*/
		
		/*SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				PantallaPrincipal pantConsulta = new PantallaPrincipal();
				pantConsulta.setVisible(true);
				
			}
		});*/
		
	}

}
