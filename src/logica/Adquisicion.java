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

@Entity
@Table(name="TAdquisiciones")

public class Adquisicion implements Serializable {
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaAdquisicion")
	private String fechaAdquisicion;
	
	@Column(name="condicionAdquisicion")
	private String condicionAdquisicion;
	
	@Column(name="costoAdquisicion")
	private double costoAdquisicion;
	
	@Column(name="codigoPintura")
	private String	codigoPintura;
	
	@Column(name="idPropietario")
	private String	idPropietario;
	
	/*private Propietario propietario;
	private Pintura pintura;*/
	
	/**
	 * Constructor
	 * @param pfechaAquisicion: Fecha de adquisición de la pintura.
	 * @param pcondicionAdquisicion: Condición en que se adquirió la pintura (excelente, buena, regular o mala).
	 * @param pcostoAdquisicion: Costo de adquisición de la pintura.
	 * @param pcodigoPintura: Código de la pintura adquirida.
	 * @param pidPropietario: Identificador del propietario de la pintura adquirida.
	 */
	
	public Adquisicion(String pfechaAdquisicion, String pcondicionAdquisicion, double pcostoAdquisicion,
			String pcodigoPintura, String pidPropietario) {
		setFechaAdquisicion(pfechaAdquisicion);
		setCondicionAdquisicion(pcondicionAdquisicion);
		setCostoAdquisicion(pcostoAdquisicion);
		setCodigoPintura(pcodigoPintura);
		setIdPropietario(pidPropietario);
		/*pintura = null;
		propietario = null;*/
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
	 * @return condicionAdquisicion
	 */
	public String getCondicionAdquisicion() {
		return condicionAdquisicion;
	}
	
	/**
	 * Setter
	 *  @param pcondicionAdquisicion: Condición en que se adquirió la pintura.
	 */
	public void setCondicionAdquisicion(String pcondicionAdquisicion) {
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
	 * @return codigoPintura
	 */
	public String getCodigoPintura() {
		return codigoPintura;
	}
	
	/**
	 * Setter
	 *@param pcodigoPintura: Código de la pintura adquirida.
	 */
	public void setCodigoPintura(String pcodigoPintura) {
		codigoPintura = pcodigoPintura;
	}
	
	/**
	 * Getter
	 * @return idPropietario
	 */
	public String getIdPropietario() {
		return idPropietario;
	}
	
	/**
	 * Setter
	 * @param pidPropietario: Identificador del propietario de la pintura adquirida.
	 */
	public void setIdPropietario(String pidPropietario) {
		idPropietario = pidPropietario;
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
