/**
 * Clase DAOAdquisicion: Objeto de acceso de datos para la clase Adquisicion
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;

public class DAOAdquisicion {
	
	/**
	 * Crea una instancia en la tabla de adquisiciones.
	 * @param padquisicion: Objeto Adquisicion.
	 */	
	public static void crear(Adquisicion padquisicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(padquisicion);
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
	 * Actualiza una instancia en la tabla de adquisiciones.
	 * @param padquisicion: Objeto Adquisicion.
	 */	
	public static void actualizar(Adquisicion padquisicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(padquisicion);
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
	 * Actualiza una instancia en la tabla de adquisiciones.
	 * @param padquisicion: Objeto Adquisicion.
	 */		
	public static void borrar(Adquisicion padquisicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Adquisicion pMerge = em.merge(padquisicion);
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
