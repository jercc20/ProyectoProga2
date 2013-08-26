/**
 * Clase DAOPintura: Objeto de acceso de datos para la clase Pintura
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOPintura {
	
	/**
	 * Crea una instancia en la tabla de pinturas.
	 * @param ppintura: Objeto Pintura.
	 */	
	public static void crear(Pintura ppintura){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(ppintura);
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
	 * Busca una instancia en la tabla de pinturas usando el código de la pintura.
	 * @param pcodigo: Código de la pintura.
	 */	
	public static Pintura buscar(int pcodigo){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Pintura pintura = null;
		try{
			pintura = em.find(Pintura.class, pcodigo);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return pintura;
	}
	
	/**
	 * Actualiza una instancia en la tabla de pinturas.
	 * @param ppintura: Objeto Pintura.
	 */	
	public static void actualizar(Pintura ppintura){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(ppintura);
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
	 * Actualiza una instancia en la tabla de pinturas.
	 * @param ppintura: Objeto Pintura.
	 */		
	public static void borrar(Pintura ppintura){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Pintura pMerge = em.merge(ppintura);
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
