/**
 * @author Jerson Chinchilla
 */
package presentacion;

import test.*;

public class principal_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona("nomb1", "apell1");
		DAOPersona.create( p );
		Persona p2 = new Persona("nomb2", "apell2");
		DAOPersona.create( p2 );
		Persona p3 = DAOPersona.find(2);
		System.out.println( p3.getNombre() );
		p3.setNombre("TodayTest3");
		DAOPersona.update( p3 );
		System.out.println( "Id generado y agregado a la instancia:" +  p.getId() );
		DAOPersona.delete( p );
	}

}
