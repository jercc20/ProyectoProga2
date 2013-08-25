package logica;

public class Gestor {
	
	public static Pintor crearPintor(int pId, String pNombre, String pNombreArtistico, String pCiudadNacimiento, String pPaisNacimiento, String pFechaNacimiento, String pFechaMuerte, String pTipo, int pIdMaestro, int pIdEscuela) throws Exception{
		Pintor pintor = (new DAOPintor()).crear(pId, pNombre, pNombreArtistico, pCiudadNacimiento, pPaisNacimiento, pFechaNacimiento, pFechaMuerte, pTipo, pIdMaestro, pIdEscuela);
		return pintor;
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
	
	public static Pintura crearPintura(int pCodigo, String pNombre, String pDimensiones, String pFechaCreacion, String pTiempoTardado, String pTecnicaCreacion, String pFechaLlegada, int pCondicionLlegada, int pCondicionActual, String pCostoAdquirida, int pFamosa, String pDesc, int pIdGaleria, int pIdPintor) throws Exception {
		Pintura pintura = (new DAOPintura()).crear(pCodigo, pNombre, pDimensiones, pFechaCreacion, pTiempoTardado, pTecnicaCreacion, pFechaLlegada, pCondicionLlegada, pCondicionActual, pCostoAdquirida, pFamosa, pDesc, pIdGaleria, pIdPintor);
		return pintura;
	}
	
	public static Pintura consultarPintura(int pId) throws Exception {
		Pintura pintura = (new DAOPintura()).buscar(pId);
		return pintura;
	}
	
	public static String actualizarPintura(int pCodigo, String pNombre, String pDimensiones, String pFechaCreacion, String pTiempoTardado, String pTecnicaCreacion, String pFechaLlegada, int pCondicionLlegada, int pCondicionActual, String pCostoAdquirida, int pFamosa, String pDesc, int pIdGaleria, int pIdPintor) throws Exception{
		(new DAOPintura()).actualizar(pCodigo, pNombre, pDimensiones, pFechaCreacion, pTiempoTardado, pTecnicaCreacion, pFechaLlegada, pCondicionLlegada, pCondicionActual, pCostoAdquirida, pFamosa, pDesc, pIdGaleria, pIdPintor);
		return "La pintura ha sido actualizada.";
	}
	
	public static String borrarPintura(int pId) throws java.sql.SQLException, Exception {
		(new DAOPintura()).borrar(pId);
		return "Se ha borrado la pintura.";
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
	
	
	public static Mecenazgo crearMecenazgo(int pIdMecenas, int pIdPintor, String pFechaInicio, String pFechaFin) throws Exception{
		Mecenazgo mecenazgo = (new DAOMecenazgo()).crear(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		return mecenazgo;
	}
	
	public static String actualizarMecenazgo (int pIdMecenas, int pIdPintor, String pFechaInicio, String pFechaFin) throws Exception{
		(new DAOMecenazgo()).actualizar(pIdMecenas, pIdPintor, pFechaInicio, pFechaFin);
		return "El mecenazgo ha sido actualizado.";
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
	
	
	public static Escuela crearEscuela(int pId, String pNombre, String pPais, String pFecha, String pCaracteristicas) throws Exception {
		Escuela escuela = (new DAOEscuela()).crear(pId, pNombre, pPais, pFecha, pCaracteristicas);
		return escuela;
	}
	
	public static Escuela consultarEscuela(int pId) throws Exception {
		Escuela escuela = (new DAOEscuela()).buscar(pId);
		return escuela;
	}
	
	public static String actualizarEscuela(int pId, String pNombre, String pPais, String pFecha, String pCaracteristicas) throws Exception{
		(new DAOEscuela()).actualizar(pId, pNombre, pPais, pFecha, pCaracteristicas);
		return "La escuela ha sido actualizada.";
	}
	
	public static String borrarEscuela(int pId) throws java.sql.SQLException, Exception {
		(new DAOEscuela()).borrar(pId);
		return "Se ha borrado la escuela.";
	}

}
