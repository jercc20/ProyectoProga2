/**
 * Clase Galeria: Representaci�n de una galer�a de arte.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Date;
import java.util.Set;
import java.util.Vector;

@Entity
@Table(name="TGalerias")

public class Galeria extends Propietario implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Column(name="fecha_inaguracion")
	private Date fechaInaguracion;
	
	@Column(name="encargado")
	private String encargado;
	
	@Column(name="metrosCuadrados")
	private String metrosCuadrados;
	
	@OneToOne
	@JoinColumn(name="id_galeria")
	private Set<Exposicion> exposiciones;
	
	/**
	 * Constructor
	 */
	private Galeria(){
		
	}
	
	/**
	 * Constructor
	 * @param pnombre: Nombre de la galer�a.
	 * @param pid: Identificador del galer�a.
	 * @param pdireccion: Direcci�n del galer�a.
.	 * @param ptelefono: Tel�fono del galer�a.
	 * @param pfechaInicio: Fecha de inaguraci�n de la galer�a.
	 * @param pencargado: Nombre del encargado de la galer�a.
	 * @param pmetrosCuadrados: Cantidad de metros cuadrados de la galer�a.
	 */	
	
	public Galeria( String pid, String pnombre, String pdireccion, String ptelefono, String pfechaInaguracion,
			String pencargado, String pmetrosCuadrados) {
		super(pid, pnombre, pdireccion, ptelefono);
		setFechaInaguracion(pfechaInaguracion);
		setEncargado(pencargado);
		setMetrosCuadrados(pmetrosCuadrados);
	}
	
	/**
	 * Getter
	 * @return fechaInaguracion
	 */
	public String getFechaInauguracion() {
		return fechaInaguracion.toString();
	}
	
	/**
	 * Setter
	 * @param pfechaInauguracion: Fecha de inaguraci�n de la galer�a.
	 */
	public void setFechaInaguracion(String pfechaInaguracion) {
		fechaInaguracion = Date.valueOf(pfechaInaguracion);
	}
	
	/**
	 * Setter
	 * @param pfechaInauguracion: Fecha de inaguraci�n de la galer�a.
	 */
	public void setFechaInaguracion(Date pfechaInaguracion) {
		fechaInaguracion = pfechaInaguracion;
	}
	
	/**
	 * Getter
	 * @return encargado
	 */
	public String getEncargado() {
		return encargado;
	}
	
	/**
	 * Setter
	 * @param pencargado: Nombre del encargado de la galer�a.
	 */
	public void setEncargado(String pencargado) {
		encargado = pencargado;
	}
	
	/**
	 * Getter
	 * @return metrosCuadrados
	 */
	public String getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	/**
	 * Setter
	 * @param pmetrosCuadrados: Cantidad de metros cuadrados de la galer�a.
	 */
	public void setMetrosCuadrados(String pmetrosCuadrados) {
		metrosCuadrados = pmetrosCuadrados;
	}
	
	public Set<Exposicion> getExposiciones() {
		return exposiciones;
	}

	public void setExposiciones(Set<Exposicion> pExposiciones){
		exposiciones = pExposiciones;
	}

}
