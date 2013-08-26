/**
 * Clase DAOColeccionista: Objeto de acceso de datos para la clase Coleccionista
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOColeccionista {
	
	/**
	 * Crea una instancia en la tabla de coleccionistas.
	 * @param pexposicion: Objeto Coleccionista
	 */	
	public static void crear(Coleccionista pcoleccionista){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(pcoleccionista);
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
	 * Busca una instancia en la tabla de coleccionistas usando el id del coleccionista.
	 * @param pidColeccionista: id del coleccionista.
	 */	
	public static Coleccionista buscar(int pidColeccionista){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Coleccionista coleccionista = null;
		try{
			coleccionista = em.find(Coleccionista.class, pidColeccionista);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return coleccionista;
	}
	
	/**
	 * Actualiza una instancia en la tabla de coleccionistas.
	 * @param pcoleccionista: Objeto Coleccionista.
	 */	
	public static void actualizar(Coleccionista pcoleccionista){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(pcoleccionista);
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
	 * Actualiza una instancia en la tabla de coleccionistas.
	 * @param pcoleccionista: Objeto Exposicion.
	 */		
	public static void borrar(Coleccionista pcoleccionista){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Coleccionista pMerge = em.merge(pcoleccionista);
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
