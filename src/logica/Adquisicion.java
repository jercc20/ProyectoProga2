/**
 * Clase Adquisicion: Representación de una adquisicion de una pintura por parte de un propietario.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */

package logica;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="TAdquisiciones")

public class Adquisicion implements Serializable {
	
	private static final long serialVersionUID = -436540065081698326L;
	
	//Format = yyyy-mm-dd
	@Column(name="fecha_adquisicion")
	private Date fechaAdquisicion;
	
	@Column(name="condicion_adquisicion")
	private int condicionAdquisicion;
	
	@Column(name="costo_adquisicion")
	private double costoAdquisicion;
	
	@Column(name="historia")
	private String	historia;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_propietario")
	private Propietario propietario;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_pintura")
	private Pintura pintura;
	
	public Adquisicion(){
		
	}
	
	/**
	 * Constructor
	 * @param pfechaAquisicion: Fecha de adquisición de la pintura.
	 * @param pcondicionAdquisicion: Condición en que se adquirió la pintura (excelente, buena, regular o mala).
	 * @param pcostoAdquisicion: Costo de adquisición de la pintura.
	 */
	
	public Adquisicion(Propietario pPropietario, Pintura pPintura, String pfechaAdquisicion, int pcondicionAdquisicion, double pcostoAdquisicion, String pHistoria) {
		setPropietario(pPropietario);
		setPintura(pPintura);
		setFechaAdquisicion(pfechaAdquisicion);
		setCondicionAdquisicion(pcondicionAdquisicion);
		setCostoAdquisicion(pcostoAdquisicion);
		setHistoria( pHistoria );
	}
	
	/**
	 * Getter
	 * @return fechaAdquisicion
	 */
	public String getFechaAdquisicion() {
		return fechaAdquisicion.toString();
	}
	
	/**
	 * Setter
	 * @param pfechaAdquisicion: Fecha de adquisición de la pintura.
	 */
	public void setFechaAdquisicion(String pfechaAdquisicion) {
		fechaAdquisicion = Date.valueOf(pfechaAdquisicion);
	}
	
	/**
	 * Setter
	 * @param pfechaAdquisicion: Fecha de adquisición de la pintura.
	 */
	public void setFechaAdquisicion(Date pfechaAdquisicion) {
		fechaAdquisicion = pfechaAdquisicion;
	}
	
	/**
	 * Getter
	 * @return condicionAdquisicion
	 */
	public int getCondicionAdquisicion() {
		return condicionAdquisicion;
	}
	
	/**
	 * Setter
	 *  @param pcondicionAdquisicion: Condición en que se adquirió la pintura.
	 */
	public void setCondicionAdquisicion(int pcondicionAdquisicion) {
		condicionAdquisicion = pcondicionAdquisicion;
	}
	
	/**
	 * Getter
	 * @return costoAdquisicion
	 */
	public double getCostoAdquisicion() {
		return costoAdquisicion;
	}
	
	/**
	 * Setter
	 *@param pcostoAdquisicion: Costo de adquisición de la pintura.
	 */
	public void setCostoAdquisicion(double pcostoAdquisicion) {
		costoAdquisicion = pcostoAdquisicion;
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

	public Pintura getPintura() {
		return pintura;
	}

	public void setPintura(Pintura ppintura){
		pintura = ppintura;
	}
	
	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario ppropietario){
		propietario = ppropietario;
	}

}
