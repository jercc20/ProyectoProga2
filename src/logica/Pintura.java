/**
 * Clase Pintura: Representación de una pintura.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */


package logica;

import java.util.Vector;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="TAdquisiciones")

public class Pintura implements Serializable{
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String	nombre;
	
	@Column(name="dimensiones")
	private String dimensiones;
	
	@Column(name="fechaCreacion")
	private String	fechaCreacion;
	
	@Column(name="tiempoTardado")
	private String tiempoTardado;
	
	@Column(name="tecnica")
	private String tecnica;
	
	@Column(name="condicionActual")
	private String condicionActual;
	
	@Column(name="esFamosa")
	private String esFamosa;
	
	@Column(name="historia")
	private String	historia;
	
	@Column(name="idPintor")
	private String	idPintor;
	
	/*private Pintor pintor;
	private Vector	listaAdquisiciones;
	private Exposicion exposicion;*/
	
	/**
	 * Constructor
	 * @param pcodigo: Código de la pintura.
	 * @param pnombre: Nombre de la pintura.
	 * @param pdimensiones: Dimensiones de la pintura.
	 * @param pfechaCreacion: Fecha de creación de la pintura.
	 * @param ptiempoTardado: Tiempo de elaboración de la pintura.
	 * @param ptecnica: Técnica en la que la pintura fue elaborada.
	 * @param pcondicionActual: Condición actual de la pintura (excelente, buena, regular o mala).
	 * @param pesFamosa: Indicador si es una pintura muy famosa.
	 * @param phistoria: Breve historia de la pintura si es que la posee.
	 * @param pidPintor:Identificador del pintor que elaboró la pintura.
	 */	
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
		/*pintor = null;
		listaAdquisiciones = null;*/
	}
	
	/**
	 * Getter
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Setter
	 * @param pcodigo: Código de la pintura.
	 */
	public void setCodigo(String pcodigo) {
		codigo = pcodigo;
	}
	
	/**
	 * Getter
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter
	 * @param pnombre: Nombre de la pintura.
	 */
	public void setNombre(String pnombre) {
		nombre = pnombre;
	}
	
	/**
	 * Getter
	 * @return dimensiones
	 */
	public String getDimensiones() {
		return dimensiones;
	}
	
	/**
	 * Setter
	 * @param pdimensiones: Dimensiones de la pintura.
	 */
	public void setDimensiones(String pdimensiones) {
		dimensiones = pdimensiones;
	}
	
	/**
	 * Getter
	 * @return fechaCreacion
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	
	/**
	 * Setter
	 * @param pfechaCreacion: Fecha de creación de la pintura.
	 */
	public void setFechaCreacion(String pfechaCreacion) {
		fechaCreacion = pfechaCreacion;
	}
	
	/**
	 * Getter
	 * @return fechaCreacion
	 */
	public String getTiempoTardado() {
		return tiempoTardado;
	}
	
	/**
	 * Setter
	 * @param ptiempoTardado: Tiempo de elaboración de la pintura.
	 */
	public void setTiempoTardado(String ptiempoTardado) {
		tiempoTardado = ptiempoTardado;
	}
	
	/**
	 * Getter
	 * @return tecnica
	 */
	public String getTecnica() {
		return tecnica;
	}
	
	/**
	 * Setter
	 * @param ptecnica: Técnica en la que la pintura fue elaborada.
	 */
	public void setTecnica(String ptecnica) {
		tecnica = ptecnica;
	}
	
	/**
	 * Getter
	 * @return condicionActual
	 */
	public String getCondicionActual() {
		return condicionActual;
	}
	
	/**
	 * Setter
	 * @param pcondicionActual: Condición actual de la pintura (excelente, buena, regular o mala).
	 */
	public void setCondicionActual(String pcondicionActual) {
		condicionActual = pcondicionActual;
	}
	
	/**
	 * Getter
	 * @return esFamosa
	 */
	public String getEsFamosa() {
		return esFamosa;
	}
	
	/**
	 * Setter
	 * @param pesFamosa: Indicador si es una pintura muy famosa.
	 */
	public void setEsFamosa(String pesFamosa) {
		esFamosa = pesFamosa;
	}
	
	/**
	 * Getter
	 * @return historia
	 */
	public String getHistoria() {
		return historia;
	}
	
	/**
	 * Setter
	 * @param phistoria: Breve historia de la pintura si es que la posee.
	 */
	public void setHistoria(String phistoria) {
		historia = phistoria;
	}
	
	/**
	 * Getter
	 * @return idPintor
	 */
	public String getIdPintor() {
		return idPintor;
	}
	
	/**
	 * Setter
	 * pidPintor:Identificador del pintor que elaboró la pintura.
	 */
	public void setIdPintor(String pidPintor) {
		idPintor = pidPintor;
	}
	
	/*public Pintor getPintor() throws Exception {
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
	}*/

}
