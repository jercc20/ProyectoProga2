/**
 * Clase DAOGaleria: Objeto de acceso de datos para la clase Galeria
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOGaleria {
	
	/**
	 * Crea una instancia en la tabla de galerías.
	 * @param pgaleria: Objeto Galeria.
	 */	
	public static void crear(Galeria pgaleria){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(pgaleria);
			em.getTransaction().commit();
		}
		catch ( Exception ex ){
			em.getTransaction().rollback();
			System.out.println("Error al guardar");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
	}
	
	/**
	 * Busca una instancia en la tabla de galerías usando el id de la galería.
	 * @param pidGaleria: id de la galería.
	 */	
	public static Galeria buscar(int pidGaleria){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Galeria galeria = null;
		try{
			galeria = em.find(Galeria.class, pidGaleria);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return galeria;
	}
	
	/**
	 * Actualiza una instancia en la tabla de galerías.
	 * @param pgaleria: Objeto Galeria.
	 */	
	public static void actualizar(Galeria pgaleria){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(pgaleria);
			tx.commit();
			System.out.println("Actualizacion exitosa");
		}
		catch(Exception ex){
			tx.rollback();
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
	}
	
	/**
	 * Actualiza una instancia en la tabla de galerias.
	 * @param pgaleria: Objeto Galeria.
	 */		
	public static void borrar(Galeria pgaleria){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Galeria pMerge = em.merge(pgaleria);
		    em.remove(pMerge);
			em.getTransaction().commit();
			System.out.println("Borrado exitoso");
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
	}

}
