/**
 * Clase Propietario: Representación de un propietario de pinturas.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */

package logica;

import java.util.Set;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TPropietarios")
@Inheritance(strategy=InheritanceType.JOINED)

public abstract class Propietario implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@Basic(optional=false)
	@Column(name="id")
	private String id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@OneToOne
	@JoinColumn(name="id_propietario")
	private Set<Adquisicion> adquisiciones;
	
	/**
	 * Constructor
	 */
	public Propietario(){
		
	}
	
	/**
	 * Constructor
	 * @param pnombre: Nombre del propietario de la o las pinturas.
	 * @param pid: Identificador del propietario.
	 * @param pdireccion: Dirección del propietario.
.	 * @param ptelefono: Teléfono del propietario.
	 */	
	public Propietario( String pid, String pnombre, String pdireccion, String ptelefono){
		setId(pid);
		setNombre(pnombre);		
		setDireccion(pdireccion);
		setTelefono(ptelefono);
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

	public Set<Adquisicion> getAdquisiciones() {
		return adquisiciones;
	}

	public void setAdquisiciones(Set<Adquisicion> pAdquisiciones){
		adquisiciones = pAdquisiciones;
	}

}
