/**
 * Clase DAOMecenas: Objeto de acceso de datos para la clase Mecenas
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOMecenas {
	
	/**
	 * Crea una instancia en la tabla de mecenas.
	 * @param pmecenas: Objeto Mecenas.
	 */	
	public static void crear(Mecenas pmecenas){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(pmecenas);
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
	 * Busca una instancia en la tabla de mecenas usando el id del mecenas.
	 * @param pidMecenas: id del mecenas.
	 */	
	public static Mecenas buscar(String pidMecenas){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Mecenas mecenas = null;
		try{
			mecenas = em.find(Mecenas.class, pidMecenas);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return mecenas;
	}
	
	/**
	 * Actualiza una instancia en la tabla de mecenas.
	 * @param pmecenas: Objeto Mecenas.
	 */	
	public static void actualizar(Mecenas pmecenas){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(pmecenas);
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
	 * Actualiza una instancia en la tabla de mecenas.
	 * @param pmecenas: Objeto Mecenas.
	 */		
	public static void borrar(Mecenas pmecenas){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Mecenas pMerge = em.merge(pmecenas);
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
