package logica;

import java.util.Vector;

public class Pintura {
	private String 		codigo;
	private String			nombre;
	private String 		dimensiones;
	private String			fechaCreacion;
	private String 		tiempoTardado;
	private String 		tecnica;
	private String 		condicionActual;
	private String 		esFamosa;
	private String			historia;
	private String			idPintor;
	private Pintor			pintor;
	private Vector			listaAdquisiciones;
	private Exposicion 	exposicion;
	
	public Pintura(String pcodigo, String pnombre, String pdimensiones, String pfechaCreacion, String ptiempoTardado,
			String ptecnica, String pcondicionActual, String pesFamosa, String phistoria, String pidPintor) {
		setCodigo(pcodigo);
		setNombre(pnombre);
		setDimensiones(pdimensiones);
		setFechaCreacion(pfechaCreacion);
		setTiempoTardado(ptiempoTardado);
		setTecnica(ptecnica);
		setCondicionActual(pcondicionActual);
		setEsFamosa(pesFamosa);
		setHistoria(phistoria);
		setIdPintor(pidPintor);
		pintor = null;
		listaAdquisiciones = null;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String pcodigo) {
		codigo = pcodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pnombre) {
		nombre = pnombre;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String pdimensiones) {
		dimensiones = pdimensiones;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String pfechaCreacion) {
		fechaCreacion = pfechaCreacion;
	}

	public String getTiempoTardado() {
		return tiempoTardado;
	}

	public void setTiempoTardado(String ptiempoTardado) {
		tiempoTardado = ptiempoTardado;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String ptecnica) {
		tecnica = ptecnica;
	}

	public String getCondicionActual() {
		return condicionActual;
	}

	public void setCondicionActual(String pcondicionActual) {
		condicionActual = pcondicionActual;
	}

	public String getEsFamosa() {
		return esFamosa;
	}

	public void setEsFamosa(String pesFamosa) {
		esFamosa = pesFamosa;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String phistoria) {
		historia = phistoria;
	}
	
	public String getIdPintor() {
		return idPintor;
	}

	public void setIdPintor(String pidPintor) {
		idPintor = pidPintor;
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
	
	public Vector getListaAdquisiciones() throws Exception {
		if (listaAdquisiciones == null) {
			setListaAdquisiciones((new MultiAdquisiciones()).buscarPintura(codigo));
		}
		return listaAdquisiciones;
	}

	public void setListaAdquisiciones(Vector plistaAdquisiciones){
		listaAdquisiciones = plistaAdquisiciones;
	}
	
	public Exposicion getExposicion() throws Exception {
		if (exposicion == null) {
			setExposicion((new MultiExposicion()).buscarExposicion(idPintor));
		}
		return exposicion;
	}

	public void setPintor(Exposicion pexposicion){
		exposicion = pexposicion;
	}

}
