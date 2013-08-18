package logica;

import java.util.Vector;

public class Pintor {
	private String 		id;
	private String 		nombre;
	private String 		nombreArtistico;
	private String 		nacionalidad;
	private String 		ciudadNacimiento;
	private String 		fechaNacimiento;
	private String 		fechaMuerte;
	private String 		tipo;
	private String			idMaestro;
	private String			nombreEscuela;
	private Pintor			maestro;
	private Vector			listaMecenazgos;
	private Vector			listaPinturas;
	private Escuela		escuela;
	
	public Pintor(String pid, String pnombre, String pnombreArtistico,	String pnacionalidad, String pciudadNacimiento,
			String pfechaNacimiento,	String pfechaMuerte, String ptipo, String pidMaestro, String pnombreEscuela) {
		setId(pid);
		setNombre(pnombre);
		setNombreArtistico(pnombreArtistico);
		setNacionalidad(pnacionalidad);
		setCiudadNacimiento(pciudadNacimiento);
		setFechaNacimiento(pfechaNacimiento);
		setFechaMuerte(pfechaMuerte);
		setTipo(ptipo);
		setIdMaestro(pidMaestro);
		setNombreEscuela(pnombreEscuela);
		maestro = null;
		listaMecenazgos = null;
		listaPinturas = null;
		escuela = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String pid) {
		id = pid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pnombreReal) {
		nombre = pnombreReal;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String ppseudonimo) {
		nombreArtistico = ppseudonimo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String pnacionalidad) {
		nacionalidad = pnacionalidad;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String pciudadNacimiento) {
		ciudadNacimiento = pciudadNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String pfechaNacimiento) {
		fechaNacimiento = pfechaNacimiento;
	}

	public String getFechaMuerte() {
		return fechaMuerte;
	}

	public void setFechaMuerte(String pfechaMuerte) {
		fechaMuerte = pfechaMuerte;
	}
	
	public String getTipoPintor() {
		return tipo;
	}

	public void setTipo(String ptipo) {
		tipo = ptipo;
	}

	public String getIdMaestro() {
		return idMaestro;
	}

	public void setIdMaestro(String pidMaestro) {
		idMaestro = pidMaestro;
	}
	
	public String getNombreEscuela() {
		return nombreEscuela;
	}

	public void setNombreEscuela(String pnombreEscuela) {
		nombreEscuela = pnombreEscuela;
	}
	
	public Pintor getMaestro() throws Exception {
		if (maestro == null) {
			setMaestro((new MultiMaestro()).bucarMaestro(idMaestro));
		}
		return maestro;
	}

	public void setMaestro(Pintor pmaestro){
		maestro = pmaestro;
	}
	
	public Vector getListaMecenazgos() throws Exception {
		if (listaMecenazgos == null) {
			setListaMecenazgos((new MultiMecenas()).buscarMecenas(id));
		}
		return listaMecenazgos;
	}

	public void setListaMecenazgos(Vector plistaMecenas){
		listaMecenazgos = plistaMecenas;
	}

	public Vector getListaPinturas() throws Exception {
		if (listaPinturas == null) {
			setListaPinturas((new MultiPinturas()).buscarPinturas(id));
		}
		return listaPinturas;
	}

	public void setListaPinturas(Vector plistaPinturas){
		listaPinturas = plistaPinturas;
	}
	
	public Escuela getEscuela() throws Exception {
		if (escuela== null) {
			setEscuela((new MultiEscuela()).buscarEscuela(nombreEscuela));
		}
		return escuela;
	}

	public void setEscuela(Escuela pescuela){
		escuela = pescuela;
	}

}
