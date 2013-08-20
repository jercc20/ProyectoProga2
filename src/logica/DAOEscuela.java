/**
 * Clase DAOEscuela: Objeto de acceso de datos para la clase Escuela
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOEscuela {
	
	/**
	 * Crea una instancia en la tabla de escuelas.
	 * @param pescuela: Objeto Escuela
	 */	
	public static void crear(Escuela pescuela){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(pescuela);
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
	 * Busca una instancia en la tabla de escuela usando el nombre de la escuela.
	 * @param pnombre: Nombre de la escuela.
	 */	
	public static Escuela buscar(int pid){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Escuela escuela = null;
		try{
			escuela = em.find(Escuela.class, pid);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return escuela;
	}
	
	/**
	 * Actualiza una instancia en la tabla de escuelas.
	 * @param pescuela: Objeto Escuela.
	 */	
	public static void actualizar(Escuela pescuela){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(pescuela);
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
	 * Actualiza una instancia en la tabla de escuelas.
	 * @param pescuela: Objeto Escuela.
	 */		
	public static void borrar(Escuela pescuela){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Escuela pMerge = em.merge(pescuela);
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
