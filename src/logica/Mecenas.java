package logica;

import java.util.Vector;

public class Mecenas {
	private String 		id;
	private String 		nombre;
	private String 		nacionalidad;
	private String 		ciudadNacimiento;
	private String 		fechaMuerte;
	private Vector  		listaMecenazgos;
	
	public Mecenas(String pid, String pnombre, String pnacionalidad, String pciudadNacimiento, String pfechaMuerte){
		setId(pid);
		setNombre(pnombre);
		setNacionalidad(pnacionalidad);
		setCiudadNacimiento(pciudadNacimiento);
		setFechaMuerte(pfechaMuerte);
		listaMecenazgos = null;
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

	public void setNombre(String pnombre) {
		nombre = pnombre;
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

	public String getFechaMuerte() {
		return fechaMuerte;
	}

	public void setFechaMuerte(String pfechaMuerte) {
		fechaMuerte = pfechaMuerte;
	}
	
	public Vector getListaMecenazgos() throws Exception {
		if (listaMecenazgos == null) {
			setMecenazgos((new MultiMecenazgo()).buscarMecenazgos(id));
		}
		return listaMecenazgos;
	}

	public void setListaMecenazgos(Vector plistaMecenazgos){
		listaMecenazgos = plistaMecenazgos;
	}

}
