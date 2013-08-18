package logica;

import java.util.Vector;

public class Propietario {
	private String 		nombre;
	private String 		id;
	private String 		direccion;
	private String 		telefono;
	private String 		fechaInicio;
	private Vector 		listaAdquisiciones;
	
	public Propietario(String pnombre, String pid, String pdireccion, String ptelefono, String pfechaInicio){
		setNombre(pnombre);
		setId(pid);
		setDireccion(pdireccion);
		setTelefono(ptelefono);
		setFechaInicio(pfechaInicio);		
		listaAdquisiciones = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pnombre) {
		nombre = pnombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String pid) {
		id = pid;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String pdireccion) {
		direccion = pdireccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String ptelefono) {
		telefono = ptelefono;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String pfechaInicio) {
		fechaInicio = pfechaInicio;
	}
	
	public Vector getListaAdquisiciones() throws Exception {
		if (listaAdquisiciones== null) {
			setListaAdquisiciones((new MultiAdquisicion()).buscarAdquisiciones(id));
		}
		return listaAdquisiciones;
	}

	public void setAdquisicion(Vector plistaAdquisiciones){
		listaAdquisiciones = plistaAdquisiciones;
	}

}
