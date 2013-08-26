/**
 * Clase Mecenazgo: Representación de una adquisicion de una pintura por parte de un propietario.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */

package logica;

import java.io.Serializable;

import javax.persistence.*;

//@Entity
//@Table(name="TAdquisiciones")

public class Adquisicion implements Serializable {
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaAdquisicion")
	private String fechaAdquisicion;
	
	@Column(name="condicionAdquisicion")
	private int condicionAdquisicion;
	
	@Column(name="costoAdquisicion")
	private double costoAdquisicion;
	
	@Column(name="historia")
	private String	historia;
	
	@Column(name="codigoPintura")
	private String	codigoPintura;
	
	@ManyToOne
	@JoinColumn(name="id_pintura")
	private Pintura pintura;
	
	@ManyToOne
	@JoinColumn(name="id_propietario")
	private Propietario propietario;
	
	/**
	 * Constructor
	 * @param pfechaAquisicion: Fecha de adquisición de la pintura.
	 * @param pcondicionAdquisicion: Condición en que se adquirió la pintura (excelente, buena, regular o mala).
	 * @param pcostoAdquisicion: Costo de adquisición de la pintura.
	 */
	
	public Adquisicion(Pintura ppintura, Propietario ppropietario, String pfechaAdquisicion, int pcondicionAdquisicion, double pcostoAdquisicion, String pHistoria) {
		setPintura(ppintura);
		setPropietario(ppropietario);	
		setFechaAdquisicion(pfechaAdquisicion);
		setCondicionAdquisicion(pcondicionAdquisicion);
		setCostoAdquisicion(pcostoAdquisicion);
		setHistoria( pHistoria );
	}
	
	/**
	 * Getter
	 * @return pintura
	 */
	public Pintura getPintura() {
		return pintura;
	}
	
	/**
	 * Setter
	 * Pintura
	 */
	public void setPintura(Pintura ppintura) {
		pintura = ppintura;
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
	}*/

}
