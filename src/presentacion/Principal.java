package presentacion;

import javax.swing.SwingUtilities;

import logica.*; //TMP!!!
import logica.*; //TMP!!!

public class Principal {

	public static void main(String[] args) {
		
		//TEST
		
		//Escuela
		/*
		Escuela e1= new Escuela("test", "cr", "2010-10-10", "testing");
		DAOEscuela.crear( e1 );
		Escuela e2 = new Escuela("test2", "cr2", "2011-11-11", "testing2");
		DAOEscuela.crear( e2 );
		Escuela e3 = DAOEscuela.buscar(2);
		System.out.println( e3.getNombre() );
		e3.setNombre("test2_update");
		DAOEscuela.actualizar( e3 );
		System.out.println( "Id generado y agregado a la instancia:" +  e1.getId() );
		DAOEscuela.borrar( e1 );
		*/
		
		//Pintor
		/*
		Pintor p1 = new Pintor("pint1", "nombre", "a", "cr", "sj", "2010-10-10", "2011-11-11", "Bueno");
		DAOPintor.crear( p1 );
		Pintor p2 = new Pintor("pint2", "nombre2", "a2", "cr", "sj", "1980-12-25", "2011-11-11", "Bueno");
		DAOPintor.crear( p2 );
		Pintor p3 = DAOPintor.buscar("pint1");
		System.out.println( p3.getId() );
		p3.setNombre("name_update");
		p3.setEscuela( DAOEscuela.buscar(1) );
		System.out.println( p3.getMaestros().size() );
		p3.setMaestro( DAOPintor.buscar("pint3") );
		DAOPintor.actualizar( p3 );
		System.out.println( p3.getEscuela().getNombre() );
		System.out.println( p3.getMaestros().size() );
		System.out.println( p3.getMecenazgos().size() );
		System.out.println( p3.getPinturas().size() );
		DAOPintor.borrar( p1 );
		*/
		
		//Mecenas
		/*
		Mecenas m1= new Mecenas("mece1", "nombre Mecenas", "cr", "sj", "2014-09-08");
		DAOMecenas.crear( m1 );
		Mecenas m2 = new Mecenas("mece2", "nombre Mecenas", "cr", "sj", "2014-09-08");
		DAOMecenas.crear( m2 );
		Mecenas m3 = DAOMecenas.buscar("mece2");
		System.out.println( m3.getNombre() );
		m3.setNombre("name_update");
		DAOMecenas.actualizar( m3 );
		System.out.println( m3.getMecenazgos().size() );
		DAOMecenas.borrar( m1 );
		*/
		
		//Mecenazgo
		/*
		Mecenazgo me1 = new Mecenazgo("2000-01-24", "2013-10-08", DAOPintor.buscar("pint2"), DAOMecenas.buscar("mece1"));
		DAOMecenazgo.crear(me1);
		me1.setFechaFin("2014-09-09");
		DAOMecenazgo.actualizar(me1);
		DAOMecenazgo.borrar(me1);
		*/
		
		//Pintura
		/*
		Pintura pi1 = new Pintura("pin2", "pintura", "100x100", "1975-10-10", "2h", "Tec", 2, 1, DAOPintor.buscar("pint1"));
		DAOPintura.crear(pi1);
		Pintura pi2 = DAOPintura.buscar("pin2");
		pi2.setDimensiones("120x140");
		DAOPintura.actualizar(pi2);
		System.out.println( pi2.getAdquisiciones().size() );
		DAOPintura.borrar(pi1);
		*/
		
		//Propietario - Galeria/Coleccionista
		/*
		Galeria g1 = new Galeria("gal", "id4", "dir", "22", "1984-02-07", "Ruiz", "200mts");
		DAOGaleria.crear(g1);
		Coleccionista c1 = new Coleccionista("cc", "id5", "dir3", "88", "2001-09-09");
		DAOColeccionista.crear(c1);
		Propietario g2 = new Galeria("gal2", "id6", "dir", "22", "1987-07-07", "Ruiz", "200mts");
		DAOPropietario.crear(g2);
		Propietario pr1 = DAOPropietario.buscar("id4");
		pr1.setDireccion("New dir");
		System.out.println(pr1);
		Galeria pr2 = (Galeria) DAOPropietario.buscar("id4");
		System.out.println(pr2);
		pr2.setEncargado("Encargado");
		DAOPropietario.actualizar(pr1);
		System.out.println( pr2.getAdquisiciones().size() );
		DAOPropietario.borrar(g2);
		*/
		
		//Aquisiciones
		/*
		Adquisicion a1 = new Adquisicion(DAOPropietario.buscar("id5"), DAOPintura.buscar("pin2"), "2011-09-09", 1, 120, "his");
		DAOAdquisicion.crear(a1);
		Adquisicion a2 = new Adquisicion(DAOPropietario.buscar("id5"), DAOPintura.buscar("pin2"), "2011-09-09", 1, 120, "his");
		DAOAdquisicion.crear(a2);
		a2.setCondicionAdquisicion(2);
		DAOAdquisicion.actualizar(a2);
		DAOAdquisicion.borrar(a1);
		*/
		
		//Exposiciones
		/*
		Exposicion ex1 = new Exposicion("1988-10-10", "1990-10-10", DAOGaleria.buscar("id4"));
		DAOExposicion.crear(ex1);
		Exposicion ex2 = DAOExposicion.buscar(1);
		ex2.setPintura( DAOPintura.buscar("pin2") );
		DAOExposicion.actualizar(ex2);
		System.out.println( ex2.getPinturas().size() );
		DAOExposicion.borrar(ex1);
		*/
		
		//END
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				PantallaPrincipal pantConsulta = new PantallaPrincipal();
				pantConsulta.setVisible(true);
				
			}
		});
		
	}

}
