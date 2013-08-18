package logica;

public class Adquisicion {
	private String 		fechaAdquisicion;
	private String			condicionAdquisicion;
	private double 		costoAdquisicion;
	private String			codigoPintura;
	private String			idPropietario;
	private Pintura		pintura;
	private Propietario	propietario;
	
	public Adquisicion(String pfechaAdquisicion, String pcondicionAdquisicion, double pcostoAdquisicion,
			String pcodigoPintura, String pidPropietario) {
		setFechaAdquisicion(pfechaAdquisicion);
		setCondicionAdquisicion(pcondicionAdquisicion);
		setCostoAdquisicion(pcostoAdquisicion);
		setCodigoPintura(pcodigoPintura);
		setIdPropietario(pidPropietario);
		pintura = null;
		propietario = null;
	}

	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(String pfechaAdquisicion) {
		fechaAdquisicion = pfechaAdquisicion;
	}

	public String getCondicionAdquisicion() {
		return condicionAdquisicion;
	}

	public void setCondicionAdquisicion(String pcondicionAdquisicion) {
		condicionAdquisicion = pcondicionAdquisicion;
	}

	public double getCostoAdquisicion() {
		return costoAdquisicion;
	}

	public void setCostoAdquisicion(double pcostoAdquisicion) {
		costoAdquisicion = pcostoAdquisicion;
	}
	
	public String getCodigoPintura() {
		return codigoPintura;
	}

	public void setCodigoPintura(String pcodigoPintura) {
		codigoPintura = pcodigoPintura;
	}
	
	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String pidPropietario) {
		idPropietario = pidPropietario;
	}

	public Pintura getPintura() throws Exception {
		if (pintura == null) {
			setPintura((new MultiPintura()).buscarPintura(codigoPintura));
		}
		return pintura;
	}

	public void setPintura(Pintura ppintura){
		pintura = ppintura;
	}
	
	public Propietario getPropietario() throws Exception {
		if (propietario == null) {
			setPropietario((new MultiPropietario()).buscarPropietario(idPropietario));
		}
		return propietario;
	}

	public void setPropietario(Propietario ppropietario){
		propietario = ppropietario;
	}

}
