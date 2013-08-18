package logica;

import java.util.Vector;

public class Exposicion {
	private String 		fechaInicio;
	private String 		fechaFin;
	private String			idGaleria;
	private Vector			listaPinturas;
	private Galeria		galeria;
	
	public Exposicion(String pfechaInicio, String pfechaFin,  String pidGaleria) {
		setFechaInicio(pfechaInicio);
		setFechaFin(pfechaFin);
		setIdGaleria(pidGaleria);
		pintura = null;
		galeria = null;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String pfechaInicio) {
		fechaInicio = pfechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String pfechaFin) {
		fechaFin = pfechaFin;
	}
	
	public String getIdGaleria() {
		return idGaleria;
	}

	public void setIdGaleria(String pidGaleria) {
		idGaleria = pidGaleria;
	}

	public Vector getListaPinturas() throws Exception {
		if (listaPinturas == null) {
			setListaPinturas((new MultiPintura()).buscarPinturas(idGaleria));
		}
		return listaPinturas;
	}

	public void setListaPinturas(Vector plistaPinturas){
		listaPinturas = plistaPinturas;
	}
	
	public Galeria getGaleria() throws Exception {
		if (galeria == null) {
			setGaleria((new MultiGaleria()).buscarGaleria(idGaleria));
		}
		return galeria;
	}

	public void setGaleria(Galeria pgaleria){
		galeria = pgaleria;
	}

}
