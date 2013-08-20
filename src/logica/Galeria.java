/**
 * Clase Galeria: Representación de una galería de arte.
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
	 * @param pnombre: Nombre de la galería.
	 * @param pid: Identificador del galería.
	 * @param pdireccion: Dirección del galería.
.	 * @param ptelefono: Teléfono del galería.
	 * @param pfechaInicio: Fecha de inaguración de la galería.
	 * @param pencargado: Nombre del encargado de la galería.
	 * @param pmetrosCuadrados: Cantidad de metros cuadrados de la galería.
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
	 * @param pfechaInauguracion: Fecha de inaguración de la galería.
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
	 * @param pencargado: Nombre del encargado de la galería.
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
	 * @param pmetrosCuadrados: Cantidad de metros cuadrados de la galería.
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
