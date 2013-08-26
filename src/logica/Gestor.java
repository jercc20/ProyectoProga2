package logica;

import java.sql.Date;

public class Gestor {
	
	/////////////////////////
	/////// Escuela /////////
	/////////////////////////
	public static void crearEscuela(String pNombre, String pPais, String pFecha, String pCaracteristicas) throws Exception {
	
		DAOEscuela.crear( ( new Escuela(pNombre, pPais, pFecha, pCaracteristicas) ) );
		
	}
	
	
	public static Escuela consultarEscuela(int pId) throws Exception {
	
		Escuela escuela = DAOEscuela.buscar(pId);
		return escuela;
		
	}
	
	
	public static void actualizarEscuela(int pId, String pNombre, String pPais, String pFecha, String pCaracteristicas) throws Exception{
	
		Escuela escuela = DAOEscuela.buscar(pId);
		
		escuela.setNombre(pNombre);
		escuela.setPaisOrigen(pPais);
		escuela.setFechaOrigen(pFecha);
		escuela.setCaracteristicas(pCaracteristicas);
		
		DAOEscuela.actualizar( escuela );
		
	}
	
	
	public static void borrarEscuela(int pId) throws java.sql.SQLException, Exception {
	
		DAOEscuela.borrar( DAOEscuela.buscar( pId ) );
		
	}
	
	/////////////////////////
	/////// Pintor  /////////
	/////////////////////////
	public static void crearPintor(int pId, String pNombre, String pNombreArtistico, String pCiudadNacimiento, String pPaisNacimiento, String pFechaNacimiento, String pFechaMuerte, String pTipo, int pIdMaestro, int pIdEscuela) throws Exception{
	
		DAOPintor.crear( new Pintor(pId, pNombre, pNombreArtistico, pCiudadNacimiento, pPaisNacimiento, pFechaNacimiento, pFechaMuerte, pTipo) );
		
	}
	
	
	public static Pintor consultarPintor(int pId) throws Exception {
	
		Pintor pintor = DAOPintor.buscar(pId);
		return pintor;
		
	}
	
	
	public static void actualizarPintor (int pId, String pNombre, String pNombreArtistico, String pCiudadNacimiento, String pPaisNacimiento, String pFechaNacimiento, String pFechaMuerte, String pTipo, int pIdMaestro, int pIdEscuela) throws Exception{
		
		Pintor pintor = DAOPintor.buscar(pId);
		
		pintor.setNombre(pNombre);
		pintor.	setNombreArtistico(pNombreArtistico);
		pintor.	setNacionalidad(pPaisNacimiento);
		pintor.setCiudadNacimiento(pCiudadNacimiento);
		pintor.setFechaNacimiento(pFechaNacimiento);
		pintor.setFechaMuerte(pFechaMuerte);
		pintor.setTipo(pTipo);
		
		DAOPintor.actualizar( pintor );
		
	}
	
	
	public static String borrarPintor(int pId) throws java.sql.SQLException, Exception {
	
		DAOPintor.borrar( DAOPintor.buscar(pId));
		return "Se ha borrado el pintor.";
		
	}
	
	
	/////////////////////////
	/////// Pintura /////////
	/////////////////////////
	public static void crearPintura(int pCodigo, String pNombre, String pDimensiones, String pFechaCreacion, String pTiempoTardado, String pTecnicaCreacion, String pFechaLlegada, int pCondicionLlegada, int pCondicionActual, String pCostoAdquirida, int pFamosa, String pDesc, int pIdGaleria, int pIdPintor) throws Exception {
	
		DAOPintura.crear( new Pintura(pCodigo, pNombre, pDimensiones, pFechaCreacion, pTiempoTardado, pTecnicaCreacion, pFechaLlegada, pCondicionLlegada, pCondicionActual, pCostoAdquirida, pFamosa, pDesc) );
		
	}
	
	
	public static Pintura consultarPintura(int pId) throws Exception {
	
		Pintura pintura = DAOPintura.buscar(pId);
		return pintura;
		
	}
	
	
	public static void actualizarPintura(int pCodigo, String pNombre, String pDimensiones, String pFechaCreacion, String pTiempoTardado, String pTecnicaCreacion, int pCondicionActual,  int pFamosa, String pHistoria) throws Exception{
		
		Pintura pintura = DAOPintura.buscar(pCodigo);
		
		pintura.setCodigo(pCodigo);
		pintura.setNombre(pNombre);
		pintura.setDimensiones(pDimensiones);
		pintura.setFechaCreacion(pFechaCreacion);
		pintura.setTiempoTardado(pTiempoTardado);
		pintura.setTecnica(pTecnicaCreacion);
		pintura.setCondicionActual(pCondicionActual);
		pintura.setEsFamosa(pFamosa);
		pintura.setHistoria(pHistoria);
		
		DAOPintura.actualizar(pintura);
		
	}
	
	
	public static void borrarPintura(int pCodigo) throws java.sql.SQLException, Exception {
		
		DAOPintura.borrar(DAOPintura.buscar(pCodigo));
		
	}
	
	
	/////////////////////////
	/////// Mecenas /////////
	/////////////////////////
	public static void crearMecenas(int pId, String pNombre, String pNacionalidad, String pCiudadNacimiento, String pFechaMuerte) throws Exception{
	
		DAOMecenas.crear(pId, pNombre, pNacionalidad, pCiudadNacimiento, pFechaMuerte);
		
	}
	
	
	public static Mecenas consultarMecenas(int pId) throws Exception {
	
		Mecenas mecenas = DAOMecenas.buscar(pId);
		return mecenas;
		
	}
	
	
	public static String actualizarMecenas (int pId, String pNombre, String pNacionalidad, String pCiudadNacimiento, String pFechaMuerte) throws Exception{
	
		(new DAOMecenas()).actualizar(pId, pNombre, pNacionalidad, pCiudadNacimiento, pFechaMuerte);
		return "El mecenas ha sido actualizado.";
		
	}
	
	
	public static String borrarMecenas(int pId) throws java.sql.SQLException, Exception {
	
		(new DAOMecenas()).borrar(pId);
		return "Se ha borrado el mecenas.";
		
	}
	
	/////////////////////////
	/////// Mecenazgo ///////
	/////////////////////////
	public static void crearMecenazgo(String pFechaInicio, String pFechaFin, int pIdMecenas, int pIdPintor) throws Exception{
	
		DAOMecenazgo.crear(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		
	}
	
	
	public static String actualizarMecenazgo (String pFechaInicio, String pFechaFin, int pIdMecenas, int pIdPintor) throws Exception{
	
		(new DAOMecenazgo()).actualizar(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		return "El mecenazgo ha sido actualizado.";
		
	}
	
	
	public static String borrarMecenazgo(int pId) throws java.sql.SQLException, Exception {
	
		(new DAOMecenazgo()).borrar(pId);
		return "Se ha borrado el mecenazgo.";
		
	}
	
	/////////////////////////
	/////// Galeria /////////
	/////////////////////////
	public static void crearGaleria(String pId, String pNombre, String pDireccion, String pTelefono, String pFechaInauguracion, String pNombreEncargado, String pArea) throws Exception {
		
		DAOGaleria.crear( new Galeria(pId, pNombre, pDireccion, pTelefono, pFechaInauguracion, pNombreEncargado, pArea));
		
	}
	
	
	public static Galeria consultarGaleria(int pId) throws Exception {
	
		Galeria galeria = DAOGaleria.buscar(pId);
		return galeria;
		
	}
	
	
	public static String actualizarGaleria(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInauguracion, String pNombreEncargado, String pArea) throws Exception{
	
		(new DAOGaleria()).actualizar(pId, pNombre, pDireccion, pTelefono, pFechaInauguracion, pNombreEncargado, pArea);
		return "La galeria ha sido actualizada.";
		
	}
	
	
	public static void borrarGaleria(int pId) throws java.sql.SQLException, Exception {
	
		DAOGaleria.borrar( DAOGaleria.buscar(pId) );
		
	}
	
	/////////////////////////
	//// Coleccionista //////
	/////////////////////////
	public static void crearColeccionista(String pId, String pNombre, String pDireccion, String pTelefono, String pFechaInicio) throws Exception {
	
		DAOColeccionista.crear( new Coleccionista(pId, pNombre, pDireccion, pTelefono, pFechaInicio) );
		
	}
	
	
	public static Coleccionista consultarColeccionista(int pId) throws Exception {
	
		Coleccionista coleccionista = DAOColeccionista.buscar(pId);
		return coleccionista;
		
	}
	
	
	public static void actualizarColeccionista(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInicio) throws Exception{
	
		Coleccionista coleccionista = DAOColeccionista.buscar(pId);
		
		coleccionista.setNombre(pNombre);
		coleccionista.setDireccion(pDireccion);
		coleccionista.setTelefono(pTelefono);
		coleccionista.setFechaInicio( Date.valueOf(pFechaInicio) );
		
		DAOColeccionista.actualizar(coleccionista);
		
	}
	
	
	public static void borrarColeccionista(int pId) throws java.sql.SQLException, Exception {
	
		DAOColeccionista.borrar( DAOColeccionista.buscar(pId) );
		
	}
	

}
