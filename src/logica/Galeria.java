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

import java.util.Vector;

//@Entity
//@Table(name="TGalerias")

public class Galeria extends Propietario implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaInaguracion")
	private String fechaInaguracion;
	
	@Column(name="encargado")
	private String encargado;
	
	@Column(name="metrosCuadrados")
	private String metrosCuadrados;
	
	/*private Vector	listaExposiciones;*/
	
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
	
	public Galeria(String pnombre, String pid, String pdireccion, String ptelefono, String pfechaInaguracion,
			String pencargado, String pmetrosCuadrados) {
		super(pnombre, pid, pdireccion, ptelefono);
		setFechaInaguracion(pfechaInaguracion);
		setEncargado(pencargado);
		setMetrosCuadrados(pmetrosCuadrados);
		/*listaExposiciones = null;*/
	}
	
	/**
	 * Getter
	 * @return fechaInaguracion
	 */
	public String getFechaInauguracion() {
		return fechaInaguracion;
	}
	
	/**
	 * Setter
	 * @param pfechaInauguracion: Fecha de inaguraci�n de la galer�a.
	 */
	public void setFechaInaguracion(String pfechaInaguracion) {
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
	
	/*public Vector getListaExposiciones() throws Exception {
		if (listaExposiciones== null) {
			setListaExposiciones((new MultiExposicion()).buscarExposiciones(super.getId()));
		}
		return listaExposiciones;
	}

	public void setListaExposiciones(Vector plistaExposiciones){
		listaExposiciones = plistaExposiciones;
	}*/

}
