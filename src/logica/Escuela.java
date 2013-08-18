package logica;

import java.util.Vector;

public class Escuela {
	private String 		nombre;
	private String 		pais;
	private String 		fecha;
	private String 		caracteristicas;
	private String 		idPintor;
	private Pintor			pintor;
	
	public Escuela(String pnombre, String ppais, String pfecha, String pcaracteristicas, String pidPintor) {
		setNombre(pnombre);
		setPaisOrigen(ppais);
		setFechaOrigen(pfecha);
		setCaracteristicas(pcaracteristicas);
		setIdPintor(pidPintor);
		pintor = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pnombre) {
		nombre = pnombre;
	}

	public String getPaisOrigen() {
		return pais;
	}

	public void setPaisOrigen(String ppaisOrigen) {
		pais = ppaisOrigen;
	}

	public String getFechaOrigen() {
		return fecha;
	}

	public void setFechaOrigen(String pfechaOrigen) {
		fecha = pfechaOrigen;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setIdPintor(String pidPintor) {
		idPintor = pidPintor;
	}
	
	public String getIdPintor() {
		return idPintor;
	}

	public void setCaracteristicas(String pcaracteristicas) {
		caracteristicas = pcaracteristicas;
	}
	
	public Pintor getPintor() throws Exception {
		if (pintor == null) {
			setPintor((new MultiPintor()).buscarPintor(idPintor));
		}
		return pintor;
	}

	public void setPintor(Pintor ppintor){
		pintor = ppintor;
	}

}
