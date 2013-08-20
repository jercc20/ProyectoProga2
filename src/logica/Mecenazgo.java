/**
 * Clase Mecenazgo: Representación de un periodo de mecenazgo entre un pintor y un mecenas.
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
//@Table(name="TMecenazgo")

public class Mecenazgo implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaInicio")
	private String fechaInicio;
	
	@Column(name="fechaFin")
	private String fechaFin;
	
	@Column(name="idPintor")
	private String	idPintor;
	
	@Column(name="idMecenas")
	private String	idMecenas;
	
	/*private Pintor	pintor;
	private Mecenas	mecenas;*/
	
	/**
	 * Constructor
	 * @param pfechaInicio: Fecha de inicio del mecenazgo.
	 * @param pfechaFin: Fecha de finalización del mecenazgo.
	 * @param pidPintor: Identificador del pintor al que se le dió el mecenazgo.
	 * @param pidMecenas: Identificador del mecenas que brindó el mecenazgo.
	 */	
	public Mecenazgo(String pfechaInicio, String pfechaFin, String pidPintor, String pidMecenas){
		setFechaInicio(pfechaInicio);
		setFechaFin(pfechaFin);
		setIdPintor(pidPintor);
		setIdMecenas(pidMecenas);
		/*pintor = null;
		mecenas = null;*/
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
	 *@param pfechaInicio: Fecha de inicio del mecenazgo.
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
	 * @param pfechaFin: Fecha de finalización del mecenazgo.
	 */
	public void setFechaFin(String pfechaFin) {
		fechaFin = pfechaFin;
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
	 * @param pidPintor: Identificador del pintor al que se le dió el mecenazgo.
	 */
	public void setIdPintor(String pidPintor) {
		idPintor = pidPintor;
	}
	
	/**
	 * Getter
	 * @return idMecenas
	 */
	public String getIdMecenas() {
		return idMecenas;
	}
	
	/**
	 * Setter
	 * @param pidMecenas: Identificador del mecenas que brindó el mecenazgo.
	 */
	public void setIdMecenas(String pidMecenas) {
		idMecenas = pidMecenas;
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
	
	public Mecenas getMecenas() throws Exception {
		if (mecenas == null) {
			setMecenas((new MultiMecenas()).buscarMecenas(idMecenas));
		}
		return mecenas;
	}

	public void setMecenas(Mecenas pmecenas){
		mecenas = pmecenas;
	}*/

}
