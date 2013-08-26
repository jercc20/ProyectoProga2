/**
 * Clase Escuela: Representación de una escuela de arte.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */

package logica;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Date;
import java.util.Vector;

@Entity
@Table(name="TEscuelas")

public class Escuela implements Serializable {
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pais")
	private String pais;
	
	//Format = yyyy-mm-dd
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="caracteristicas")
	private String caracteristicas;
	
	/*private Vector listaPintores;*/
	
	/**
	 * Constructor
	 */
	public Escuela(){
		
	}
	
	/**
	 * Constructor
	 * @param pnombre: Nombre de la escuela.
	 * @param ppais: País donde apareció la escuela.
	 * @param pfecha: Fecha cuando apareció la escuela.
	 * @param pcaracteristicas: Descripción de la escuela.
	 */	
	public Escuela(int pid, String pnombre, String ppais, String pfecha, String pcaracteristicas) {
		setId(pid);
		setNombre(pnombre);
		setPaisOrigen(ppais);
		setFechaOrigen(pfecha);
		setCaracteristicas(pcaracteristicas);
		/*listaPintores = null;*/
	}
	/**
	 * Getter
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter
	 * @param pid: Id de la escuela.
	 */
	public void setId(int pid) {
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
	 * @param pnombre: Nombre de la escuela.
	 */
	public void setNombre(String pnombre) {
		nombre = pnombre;
	}
	
	/**
	 * Getter
	 * @return pais
	 */
	public String getPaisOrigen() {
		return pais;
	}
	
	/**
	 * Setter
	 * @param ppais: País donde apareció la escuela.
	 */
	public void setPaisOrigen(String ppaisOrigen) {
		pais = ppaisOrigen;
	}
	
	/**
	 * Getter
	 * @return fecha
	 */
	public String getFechaOrigen() {
		return fecha.toString();
	}
	
	/**
	 * Setter
	 * @param pfecha: Fecha cuando apareció la escuela.
	 */
	public void setFechaOrigen(Date pfechaOrigen) {
		fecha = pfechaOrigen;
	}
	
	/**
	 * Setter
	 * @param pfecha: Fecha cuando apareció la escuela.
	 */
	public void setFechaOrigen(String pfechaOrigen) {
		fecha = Date.valueOf(pfechaOrigen);
	}
	
	/**
	 * Getter
	 * @return caracteristicas
	 */
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	/**
	 * Setter
	 * @param pcaracteristicas: Descripción de la escuela.
	 */
	public void setCaracteristicas(String pcaracteristicas) {
		caracteristicas = pcaracteristicas;
	}
	
	/*public Vector getListaPintores() throws Exception {
		if (listaPintores == null) {
			setListaPintores((new MultiPintor()).buscarPintores(nombre));
		}
		return listaPintores;
	}

	public void setListaPintores(Pintor plistaPintores){
		listaPintores = plistaPintores;
	}*/

}
