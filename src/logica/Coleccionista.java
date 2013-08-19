/**
 * Clase Coleccionista: Representación de un coleccionista de pinturas.
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
@Table(name="TColeccionistas")

public class Coleccionista extends Propietario implements Serializable{
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="fechaInicio")
	private String fechaInicio;
	
	/**
	 * Constructor
	 * @param pnombre: Nombre del coleccionista.
	 * @param pid: Identificador del coleccionista.
	 * @param pdireccion: Dirección del coleccionista.
.	 * @param ptelefono: Teléfono del coleccionista.
	 * @param pfechaInicio: Fecha de inicio como coleccionista.
	 */	
	public Coleccionista(String pnombre, String pid, String pdireccion, String ptelefono, String pfechaInicio) {
		super(pnombre, pid, pdireccion, ptelefono);
		setFechaInicio(pfechaInicio);
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
	 * @param pfechaInicio: Fecha de inicio como coleccionista.
	 */
	public void setFechaInicio(String pfechaInicio) {
		fechaInicio = pfechaInicio;
	}
}
