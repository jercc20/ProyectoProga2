/**
 * Clase Mecenas: Representación de un mecenas del arte.
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
//@Table(name="TMecenas")

public class Mecenas implements Serializable{
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="id")
	private String id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@Column(name="ciudadNacimiento")
	private String ciudadNacimiento;
	
	@Column(name="fechaMuerte")
	private String fechaMuerte;
	
	/*private Vector  		listaMecenazgos;*/
	
	/**
	 * Constructor
	 * @param pid: Identificador del mecenas.
	 * @param pnombre: Nombre del mecenas.
	 * @param pnacionalidad: Nacionalidad del mecenas.
	 * @param pciudadNacimiento: Ciudad de nacimiento del mecenas.
	 * @param pfechaMuerte: Fecha de fallecimiento del mecenas.
	 */
	
	public Mecenas(String pid, String pnombre, String pnacionalidad, String pciudadNacimiento, String pfechaMuerte){
		setId(pid);
		setNombre(pnombre);
		setNacionalidad(pnacionalidad);
		setCiudadNacimiento(pciudadNacimiento);
		setFechaMuerte(pfechaMuerte);
		/*listaMecenazgos = null;*/
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
	 * @param pid: Identificador del mecenas.
	 */
	public void setId(String pid) {
		id = pid;
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
	 * @param pnombre: Nombre del mecenas.
	 */
	public void setNombre(String pnombre) {
		nombre = pnombre;
	}
	
	/**
	 * Getter
	 * @return nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	/**
	 * Setter
	 * @param pnacionalidad: Nacionalidad del mecenas.
	 */
	public void setNacionalidad(String pnacionalidad) {
		nacionalidad = pnacionalidad;
	}
	
	/**
	 * Getter
	 * @return ciudadNacimiento
	 */
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	
	/**
	 * Setter
	 * @param pciudadNacimiento: Ciudad de nacimiento del mecenas.
	 */
	public void setCiudadNacimiento(String pciudadNacimiento) {
		ciudadNacimiento = pciudadNacimiento;
	}
	
	/**
	 * Getter
	 * @return fechaAdquisicion
	 */
	public String getFechaMuerte() {
		return fechaMuerte;
	}
	
	/**
	 * Setter
	 * @param pfechaMuerte: Fecha de fallecimiento del mecenas.
	 */
	public void setFechaMuerte(String pfechaMuerte) {
		fechaMuerte = pfechaMuerte;
	}
	
	/*public Vector getListaMecenazgos() throws Exception {
		if (listaMecenazgos == null) {
			setMecenazgos((new MultiMecenazgo()).buscarMecenazgos(id));
		}
		return listaMecenazgos;
	}

	public void setListaMecenazgos(Vector plistaMecenazgos){
		listaMecenazgos = plistaMecenazgos;
	}*/

}
