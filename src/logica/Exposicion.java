/**
 * Clase Exposicion: Representación de una exposicion a realizar una galería.
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
//@Table(name="TExposiciones")

public class Exposicion implements Serializable{
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaInicio")
	private String fechaInicio;
	
	@Column(name="fechaFin")
	private String fechaFin;
	
	@Column(name="idGaleria")
	private String	idGaleria;
	
	/*private Vector			listaPinturas;
	private Galeria		galeria;*/
	
	/**
	 * Constructor
	 * @param pfechaInicio: Fecha de inicio de la exposicion.
	 * @param pfechaFin: Fecha de finalizacion de la exposicion.
	 * @param pidGaleria: Identificador de la galeria que tendra la exposicion.
	 */
	
	public Exposicion(String pfechaInicio, String pfechaFin,  String pidGaleria) {
		setFechaInicio(pfechaInicio);
		setFechaFin(pfechaFin);
		setIdGaleria(pidGaleria);
		/*pintura = null;
		galeria = null;*/
	}
	
	/**
	 * Getter
	 * @return fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}
	
	/**
	 * Setter
	 * @param pfechaInicio: Fecha de inicio de la exposicion.
	 */
	public void setFechaInicio(String pfechaInicio) {
		fechaInicio = pfechaInicio;
	}
	
	/**
	 * Getter
	 * @return fechaFin
	 */
	public String getFechaFin() {
		return fechaFin;
	}
	
	/**
	 * Setter
	 * @param pfechaFin: Fecha de finalizacion de la exposicion.
	 */
	public void setFechaFin(String pfechaFin) {
		fechaFin = pfechaFin;
	}
	
	/**
	 * Getter
	 * @return idGaleria
	 */
	public String getIdGaleria() {
		return idGaleria;
	}
	
	/**
	 * Setter
	 * @param pidGaleria: Identificador de la galeria que tendra la exposicion.
	 */
	public void setIdGaleria(String pidGaleria) {
		idGaleria = pidGaleria;
	}

	/*public Vector getListaPinturas() throws Exception {
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
	}*/

}
