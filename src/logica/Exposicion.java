/**
 * Clase Exposicion: Representación de una exposicion a realizar una galería.
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="TExposiciones")

public class Exposicion implements Serializable{
	
	private static final long serialVersionUID = -436540065081698326L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private int id;
	
	@Column(name="fecha_inicio")
	private Date fechaInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name="id_galeria")
	private Galeria galeria;
	
	@ManyToMany
	@JoinTable(name="TPinturasXExposicion",
				joinColumns=@JoinColumn(name="id_exposicion"),
				inverseJoinColumns=@JoinColumn(name="id_pintura"))
	private Set<Pintura> pinturas;
	
	public Exposicion(){
		
	}
	
	/**
	 * Constructor
	 * @param pfechaInicio: Fecha de inicio de la exposicion.
	 * @param pfechaFin: Fecha de finalizacion de la exposicion.
	 * @param pGaleria: Identificador de la galeria que tendra la exposicion.
	 */
	
	public Exposicion(Galeria pGaleria, String pfechaInicio, String pfechaFin, ArrayList<Pintura> pListaPinturas ) {
		setGaleria(pGaleria);
		setFechaInicio(pfechaInicio);
		setFechaFin(pfechaFin);
		setPinturas(pListaPinturas);
	}
	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria pgaleria){
		galeria = pgaleria;
	}
	
	
	/**
	 * Getter
	 * @return fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio.toString();
	}
	
	/**
	 * Setter
	 * @param pfechaInicio: Fecha de inicio de la exposicion.
	 */
	public void setFechaInicio(String pfechaInicio) {
		fechaInicio = Date.valueOf(pfechaInicio);
	}
	
	/**
	 * Setter
	 * @param pfechaInicio: Fecha de inicio de la exposicion.
	 */
	public void setFechaInicio(Date pfechaInicio) {
		fechaInicio = pfechaInicio;
	}
	
	/**
	 * Getter
	 * @return fechaFin
	 */
	public String getFechaFin() {
		return fechaFin.toString();
	}
	
	/**
	 * Setter
	 * @param pfechaFin: Fecha de finalizacion de la exposicion.
	 */
	public void setFechaFin(String pfechaFin) {
		fechaFin = Date.valueOf(pfechaFin);
	}
	
	/**
	 * Setter
	 * @param pfechaFin: Fecha de finalizacion de la exposicion.
	 */
	public void setFechaFin(Date pfechaFin) {
		fechaFin = pfechaFin;
	}
	
	public Set<Pintura> getPinturas() {
		return pinturas;
	}

	public void setPinturas(ArrayList<Pintura> pPinturas){
		pinturas = (Set) pPinturas;
	}
	public void setPintura(Pintura pPintura){
		pinturas.add(pPintura);
	}

}
