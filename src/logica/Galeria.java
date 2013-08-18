package logica;

import java.util.Vector;

public class Galeria extends Propietario {
	
	private String 		encargado;
	private String 		metrosCuadrados;
	private Vector			listaExposiciones;

	public Galeria(String pnombre, String pid, String pdireccion, String ptelefono, String pfechaInicio,
			String pencargado, String pmetrosCuadrados) {
		super(pnombre, pid, pdireccion, ptelefono, pfechaInicio);
		setEncargado(pencargado);
		setMetrosCuadrados(pmetrosCuadrados);
		listaExposiciones = null;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String pencargado) {
		encargado = pencargado;
	}

	public String getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(String pmetrosCuadrados) {
		metrosCuadrados = pmetrosCuadrados;
	}
	
	public Vector getListaExposiciones() throws Exception {
		if (listaExposiciones== null) {
			setListaExposiciones((new MultiExposicion()).buscarExposiciones(super.getId()));
		}
		return listaExposiciones;
	}

	public void setListaExposiciones(Vector plistaExposiciones){
		listaExposiciones = plistaExposiciones;
	}

}
