/**
 * Clase DAOExposicion: Objeto de acceso de datos para la clase Exposicion
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;

public class DAOExposicion {
	
	/**
	 * Crea una instancia en la tabla de exposiciones.
	 * @param pexposicion: Objeto Exposicion
	 */	
	public static void crear(Exposicion pexposicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(pexposicion);
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
	 * Busca una instancia en la tabla de exposiciones usando el id de la galería.
	 * @param pid: id de la exposición.
	 */	
	public static Exposicion buscar(int pid){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Exposicion exposicion = null;
		try{
			exposicion = em.find(Exposicion.class, pid);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return exposicion;
	}
	
	/**
	 * Actualiza una instancia en la tabla de exposiciones.
	 * @param pexposicion: Objeto Exposicion.
	 */	
	public static void actualizar(Exposicion pexposicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(pexposicion);
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
	 * Actualiza una instancia en la tabla de exposiciones.
	 * @param pexposicion: Objeto Exposicion.
	 */		
	public static void borrar(Exposicion pexposicion){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Exposicion pMerge = em.merge(pexposicion);
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
