package logica;

public class Mecenazgo {
	private String 		fechaInicio;
	private String 		fechaFin;
	private String			idPintor;
	private String			idMecenas;
	private Pintor			pintor;
	private Mecenas		mecenas;
	
	public Mecenazgo(String pfechaInicio, String pfechaFin, String pidPintor, String pidMecenas){
		setFechaInicio(pfechaInicio);
		setFechaFin(pfechaFin);
		setIdPintor(pidPintor);
		setIdMecenas(pidMecenas);
		pintor = null;
		mecenas = null;
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
	
	public String getIdPintor() {
		return idPintor;
	}

	public void setIdPintor(String pidPintor) {
		idPintor = pidPintor;
	}
	
	public String getIdMecenas() {
		return idMecenas;
	}

	public void setIdMecenas(String pidMecenas) {
		idMecenas = pidMecenas;
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
	
	public Mecenas getMecenas() throws Exception {
		if (mecenas == null) {
			setMecenas((new MultiMecenas()).buscarMecenas(idMecenas));
		}
		return mecenas;
	}

	public void setMecenas(Mecenas pmecenas){
		mecenas = pmecenas;
	}

}
