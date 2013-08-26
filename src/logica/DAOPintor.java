/**
 * Clase DAOPintor: Objeto de acceso de datos para la clase Pintor
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;

public class DAOPintor {
	
	/**
	 * Crea una instancia en la tabla de pintores.
	 * @param ppintor: Objeto Pintor.
	 */	
	public static void crear(Pintor ppintor){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(ppintor);
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
	 * Busca una instancia en la tabla de pintores usando el id del pintor.
	 * @param pidPintor: id del pintor.
	 */	
	public static Pintor buscar(String pidPintor){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Pintor pintor = null;
		try{
			pintor = em.find(Pintor.class, pidPintor);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return pintor;
	}
	
	/**
	 * Actualiza una instancia en la tabla de pintores.
	 * @param ppintor: Objeto Pintor.
	 */	
	public static void actualizar(Pintor ppintor){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(ppintor);
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
	 * Actualiza una instancia en la tabla de pintores.
	 * @param ppintor: Objeto Pintor.
	 */		
	public static void borrar(Pintor ppintor){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Pintor pMerge = em.merge(ppintor);
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
