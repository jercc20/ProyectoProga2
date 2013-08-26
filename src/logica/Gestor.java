package logica;

import java.sql.Date;

public class Gestor {
	
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
	
	public static void borrarEscuela(int pId) throws Exception {
		DAOEscuela.borrar( DAOEscuela.buscar( pId ) );
	}
	
	public static void crearPintor(String pId, String pNombre, String pNombreArtistico, String pCiudadNacimiento, String pPaisNacimiento, String pFechaNacimiento, String pFechaMuerte, String pTipo) throws Exception{
		DAOPintor.crear( ( new Pintor(pId, pNombre, pNombreArtistico, pCiudadNacimiento, pPaisNacimiento, pFechaNacimiento, pFechaMuerte, pTipo) ) );
	}
	
	public static Pintor consultarPintor(int pId) throws Exception {
		Pintor pintor = (new DAOPintor()).buscar(pId);
		return pintor;
	}
	
	public static String actualizarPintor (int pId, String pNombre, String pNombreArtistico, String pCiudadNacimiento, String pPaisNacimiento, String pFechaNacimiento, String pFechaMuerte, String pTipo, int pIdMaestro, int pIdEscuela) throws Exception{
		(new DAOPintor()).actualizar(pId, pNombre, pNombreArtistico, pCiudadNacimiento, pPaisNacimiento, pFechaNacimiento, pFechaMuerte, pTipo, pIdMaestro, pIdEscuela);
		return "El pintor ha sido actualizado.";
	}
	public static String borrarPintor(int pId) throws java.sql.SQLException, Exception {
		(new DAOPintor()).borrar(pId);
		return "Se ha borrado el pintor.";
	}
	
	public static void crearPintura(String pCodigo, String pNombre, String pidPintor, String pDimensiones, String pFechaCreacion, String pTiempoTardado, String pTecnicaCreacion, int pCondicionActual, int pFamosa, String pHistoria) throws Exception {
		Pintor pintor = DAOPintor.buscar(pidPintor);
		DAOPintura.crear( ( new Pintura(pCodigo, pNombre, pDimensiones, pFechaCreacion, pTiempoTardado, pTecnicaCreacion, pCondicionActual, pFamosa, pHistoria, pintor ) ) );
	}
	
	public static Pintura consultarPintura(int pCodigo) throws Exception {
		Pintura pintura = DAOPintura.buscar(pCodigo);
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
	
	public static Mecenas crearMecenas(int pId, String pNombre, String pNacionalidad, String pCiudadNacimiento, String pFechaMuerte) throws Exception{
		Mecenas mecenas = (new DAOMecenas()).crear(pId, pNombre, pNacionalidad, pCiudadNacimiento, pFechaMuerte);
		return mecenas;
	}
	
	public static Mecenas consultarMecenas(int pId) throws Exception {
		Mecenas mecenas = (new DAOMecenas()).buscar(pId);
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
	
	
	public static Mecenazgo crearMecenazgo(String pFechaInicio, String pFechaFin, int pIdMecenas, int pIdPintor) throws Exception{
		Mecenazgo mecenazgo = (new DAOMecenazgo()).crear(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		return mecenazgo;
	}
	
	public static String actualizarMecenazgo (String pFechaInicio, String pFechaFin, int pIdMecenas, int pIdPintor) throws Exception{
		(new DAOMecenazgo()).actualizar(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		return "El mecenazgo ha sido actualizado.";
	}
	
	public static String borrarMecenazgo(int pId) throws java.sql.SQLException, Exception {
		(new DAOMecenazgo()).borrar(pId);
		return "Se ha borrado el mecenazgo.";
	}
	
	
	public static Galeria crearGaleria(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInauguracion, String pNombreEncargado, String pArea) throws Exception {
		Galeria galeria = (new DAOGaleria()).crear(pId, pNombre, pDireccion, pTelefono, pFechaInauguracion, pNombreEncargado, pArea);
		return galeria;
	}
	
	public static Galeria consultarGaleria(int pId) throws Exception {
		Galeria galeria = (new DAOGaleria()).buscar(pId);
		return galeria;
	}
	
	
	public static String actualizarGaleria(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInauguracion, String pNombreEncargado, String pArea) throws Exception{
		(new DAOGaleria()).actualizar(pId, pNombre, pDireccion, pTelefono, pFechaInauguracion, pNombreEncargado, pArea);
		return "La galeria ha sido actualizada.";
	}
	
	public static String borrarGaleria(int pId) throws java.sql.SQLException, Exception {
		(new DAOGaleria()).borrar(pId);
		return "Se ha borrado la galeria.";
	}
	
	public static Coleccionista crearColeccionista(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInicio) throws Exception {
		Coleccionista coleccionista = (new DAOColeccionista()).crear(pId, pNombre, pDireccion, pTelefono, pFechaInicio);
		return coleccionista;
	}
	
	public static Coleccionista consultarColeccionista(int pId) throws Exception {
		Coleccionista coleccionista = (new DAOGaleria()).buscar(pId);
		return coleccionista;
	}
	
	
	public static String actualizarColeccionista(int pId, String pNombre, String pDireccion, String pTelefono, String pFechaInicio) throws Exception{
		(new DAOGaleria()).actualizar(pId, pNombre, pDireccion, pTelefono, pFechaInicio);
		return "El coleccionista ha sido actualizado.";
	}
	
	public static String borrarColeccionista(int pId) throws java.sql.SQLException, Exception {
		(new DAOGaleria()).borrar(pId);
		return "Se ha borrado el coleccionista.";
	}

}
