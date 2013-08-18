/**
 * Clase Pintor: Representación de un pintor.
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
@Table(name="TAdquisiciones")

public class Pintor implements Serializable {
	
private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="id")
	private String id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nombreArtistico")
	private String nombreArtistico;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@Column(name="ciudadNacimiento")
	private String ciudadNacimiento;
	
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;
	
	@Column(name="fechaMuerte")
	private String fechaMuerte;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="idMaestro")
	private String	idMaestro;
	
	@Column(name="nombreEscuela")
	private String	nombreEscuela;
	
	/*private Pintor maestro;
	private Vector	listaMecenazgos;
	private Vector	listaPinturas;
	private Escuela escuela;*/
	
	/**
	 * Constructor
	 * @param pid: Identificador del pintor.
	 * @param pnombre: Nombre del pintor.
	 * @param pnombreArtistico: Nombre artistico del pintor.
	 * @param pnacionalidad: Nacionalidad del pintor.
	 * @param pciudadNacimiento: Ciudad de nacimiento del pintor.
	 * @param pfechaNacimiento: Fecha de nacimiento del pintor.
	 * @param pfechaMuerte: Fecha de fallecimiento del pintor.
	 * @param ptipo: Indicador del tipo del pintor (Famoso, reconocido, poco conocido).
	 * @param pidMaestro: Identificador del maestro del pintor si es que lo tiene.
	 * @param pnombreEscuela: Nombre de la escuela del pintor si es que la tiene.
	 */	
	public Pintor(String pid, String pnombre, String pnombreArtistico,	String pnacionalidad, String pciudadNacimiento,
			String pfechaNacimiento,	String pfechaMuerte, String ptipo, String pidMaestro, String pnombreEscuela) {
		setId(pid);
		setNombre(pnombre);
		setNombreArtistico(pnombreArtistico);
		setNacionalidad(pnacionalidad);
		setCiudadNacimiento(pciudadNacimiento);
		setFechaNacimiento(pfechaNacimiento);
		setFechaMuerte(pfechaMuerte);
		setTipo(ptipo);
		setIdMaestro(pidMaestro);
		setNombreEscuela(pnombreEscuela);
		/*maestro = null;
		listaMecenazgos = null;
		listaPinturas = null;
		escuela = null;*/
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
	 * @param pid: Identificador del pintor.
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
	 * @param pnombre: Nombre del pintor.
	 */
	public void setNombre(String pnombreReal) {
		nombre = pnombreReal;
	}
	
	/**
	 * Getter
	 * @return nombreArtistico
	 */
	public String getNombreArtistico() {
		return nombreArtistico;
	}
	
	/**
	 * Setter
	 * @param pnombreArtistico: Nombre artistico del pintor.
	 */
	public void setNombreArtistico(String ppseudonimo) {
		nombreArtistico = ppseudonimo;
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
	 * @param pnacionalidad: Nacionalidad del pintor.
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
	 * @param pciudadNacimiento: Ciudad de nacimiento del pintor.
	 */
	public void setCiudadNacimiento(String pciudadNacimiento) {
		ciudadNacimiento = pciudadNacimiento;
	}
	
	/**
	 * Getter
	 * @return fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Setter
	 * @param pfechaNacimiento: Fecha de nacimiento del pintor.
	 */
	public void setFechaNacimiento(String pfechaNacimiento) {
		fechaNacimiento = pfechaNacimiento;
	}
	
	/**
	 * Getter
	 * @return fechaMuerte
	 */
	public String getFechaMuerte() {
		return fechaMuerte;
	}
	
	/**
	 * Setter
	 * @param pfechaMuerte: Fecha de fallecimiento del pintor.
	 */
	public void setFechaMuerte(String pfechaMuerte) {
		fechaMuerte = pfechaMuerte;
	}
	
	/**
	 * Getter
	 * @return tipo
	 */
	public String getTipoPintor() {
		return tipo;
	}
	
	/**
	 * Setter
	 * @param ptipo: Indicador del tipo del pintor (Famoso, reconocido, poco conocido).
	 */
	public void setTipo(String ptipo) {
		tipo = ptipo;
	}
	
	/**
	 * Getter
	 * @return idMaestro
	 */
	public String getIdMaestro() {
		return idMaestro;
	}
	
	/**
	 * Setter
	 * @param pidMaestro: Identificador del maestro del pintor si es que lo tiene.
	 */
	public void setIdMaestro(String pidMaestro) {
		idMaestro = pidMaestro;
	}
	
	/**
	 * Getter
	 * @return nombreEscuela
	 */
	public String getNombreEscuela() {
		return nombreEscuela;
	}
	
	/**
	 * Setter
	 * @param pnombreEscuela: Nombre de la escuela del pintor si es que la tiene.
	 */
	public void setNombreEscuela(String pnombreEscuela) {
		nombreEscuela = pnombreEscuela;
	}
	
	/*public Pintor getMaestro() throws Exception {
		if (maestro == null) {
			setMaestro((new MultiMaestro()).bucarMaestro(idMaestro));
		}
		return maestro;
	}

	public void setMaestro(Pintor pmaestro){
		maestro = pmaestro;
	}
	
	public Vector getListaMecenazgos() throws Exception {
		if (listaMecenazgos == null) {
			setListaMecenazgos((new MultiMecenas()).buscarMecenas(id));
		}
		return listaMecenazgos;
	}

	public void setListaMecenazgos(Vector plistaMecenas){
		listaMecenazgos = plistaMecenas;
	}

	public Vector getListaPinturas() throws Exception {
		if (listaPinturas == null) {
			setListaPinturas((new MultiPinturas()).buscarPinturas(id));
		}
		return listaPinturas;
	}

	public void setListaPinturas(Vector plistaPinturas){
		listaPinturas = plistaPinturas;
	}
	
	public Escuela getEscuela() throws Exception {
		if (escuela== null) {
			setEscuela((new MultiEscuela()).buscarEscuela(nombreEscuela));
		}
		return escuela;
	}

	public void setEscuela(Escuela pescuela){
		escuela = pescuela;
	}*/

}
