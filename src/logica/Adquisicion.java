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
	
<<<<<<< HEAD
	@Id
=======
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
	@ManyToOne
	@JoinColumn(name="id_pintura")
	private Pintura pintura;
	
<<<<<<< HEAD
	public Adquisicion(){
		
	}
=======
	@ManyToOne
	@JoinColumn(name="id_propietario")
	private Propietario propietario;
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
	
	/**
	 * Constructor
	 * @param pfechaAquisicion: Fecha de adquisición de la pintura.
	 * @param pcondicionAdquisicion: Condición en que se adquirió la pintura (excelente, buena, regular o mala).
	 * @param pcostoAdquisicion: Costo de adquisición de la pintura.
	 */
	
<<<<<<< HEAD
	public Adquisicion(Propietario pPropietario, Pintura pPintura, String pfechaAdquisicion, int pcondicionAdquisicion, double pcostoAdquisicion, String pHistoria) {
		setPropietario(pPropietario);
		setPintura(pPintura);
=======
	public Adquisicion(Pintura ppintura, Propietario ppropietario, String pfechaAdquisicion, int pcondicionAdquisicion, double pcostoAdquisicion, String pHistoria) {
		setPintura(ppintura);
		setPropietario(ppropietario);	
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
		setFechaAdquisicion(pfechaAdquisicion);
		setCondicionAdquisicion(pcondicionAdquisicion);
		setCostoAdquisicion(pcostoAdquisicion);
		setHistoria( pHistoria );
	}
	
	/**
	 * Getter
	 * @return pintura
	 */
<<<<<<< HEAD
	public String getFechaAdquisicion() {
		return fechaAdquisicion.toString();
=======
	public Pintura getPintura() {
		return pintura;
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
	}
	
	/**
	 * Setter
	 * Pintura
	 */
<<<<<<< HEAD
	public void setFechaAdquisicion(String pfechaAdquisicion) {
		fechaAdquisicion = Date.valueOf(pfechaAdquisicion);
	}
	
	/**
	 * Setter
	 * @param pfechaAdquisicion: Fecha de adquisición de la pintura.
	 */
	public void setFechaAdquisicion(Date pfechaAdquisicion) {
		fechaAdquisicion = pfechaAdquisicion;
=======
	public void setPintura(Pintura ppintura) {
		pintura = ppintura;
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
	}
	
	/**
	 * Getter
	 * @return propietario
	 */
	public Propietario getPropietario() {
		return propietario;
	}
	
	/**
	 * Setter
	 * pPintor:Pintor que elaboró la pintura.
	 */
	public void setPropietario(Propietario ppropietario) {
		propietario = ppropietario;
	}
	
	/**
	 * Getter
	 * @return fechaAdquisicion
	 */
	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	
	/**
	 * Setter
	 * @param pfechaAdquisicion: Fecha de adquisición de la pintura.
	 */
	public void setFechaAdquisicion(String pfechaAdquisicion) {
		fechaAdquisicion = pfechaAdquisicion;
	}
	
	/**
	 * Getter
<<<<<<< HEAD
	 * @return condicionAdquisicion
=======
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
<<<<<<< HEAD

	public Pintura getPintura() {
=======
	
	/**
	 * Getter
	 * @return codigoPintura
>>>>>>> d327e7ade5b8dc51f89e0281be0c9a17227f0b90
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
	
	/*public Pintura getPintura() throws Exception {
		if (pintura == null) {
			setPintura((new MultiPintura()).buscarPintura(codigoPintura));
		}
>>>>>>> 28a31a90e843860b9a9a3975d9e30aff81afdf4e
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
