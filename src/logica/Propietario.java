/**
 * Clase Propietario: Representación de un propietario de pinturas.
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

//@Entity
//@Table(name="TPropietarios")

public abstract class Propietario implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="id")
	private String id;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	/*private Vector listaAdquisiciones;*/
	
	/**
	 * Constructor
	 * @param pnombre: Nombre del propietario de la o las pinturas.
	 * @param pid: Identificador del propietario.
	 * @param pdireccion: Dirección del propietario.
.	 * @param ptelefono: Teléfono del propietario.
	 */	
	public Propietario(String pnombre, String pid, String pdireccion, String ptelefono){
		setNombre(pnombre);
		setId(pid);
		setDireccion(pdireccion);
		setTelefono(ptelefono);
		/*listaAdquisiciones = null;*/
	}
	
	/**
	 * Getter
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter
	 * @param pnombre: Nombre del propietario de la o las pinturas.
	 */
	public void setNombre(String pnombre) {
		nombre = pnombre;
	}
	
	/**
	 * Getter
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Setter
	 * @param pid: Identificador del propietario.
	 */
	public void setId(String pid) {
		id = pid;
	}
	
	/**
	 * Getter
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Setter
	 * @param pdireccion: Dirección del propietario.
	 */
	public void setDireccion(String pdireccion) {
		direccion = pdireccion;
	}
	
	/**
	 * Getter
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * Setter
	 * @param ptelefono: Teléfono del propietario.
	 */
	public void setTelefono(String ptelefono) {
		telefono = ptelefono;
	}

	/*public Vector getListaAdquisiciones() throws Exception {
		if (listaAdquisiciones== null) {
			setListaAdquisiciones((new MultiAdquisicion()).buscarAdquisiciones(id));
		}
		return listaAdquisiciones;
	}

	public void setAdquisicion(Vector plistaAdquisiciones){
		listaAdquisiciones = plistaAdquisiciones;
	}*/

}
