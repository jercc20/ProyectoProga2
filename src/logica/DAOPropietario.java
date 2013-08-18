/**
 * Clase DAOPropietario: Objeto de acceso de datos para la clase Propietario
 * 
 * @author Jerson Chinchilla
 * @author Matthew Bertelsen
 * @author Mauricio Fernandez
 * 	@version 18/08/2013		 
 */
package logica;

import javax.persistence.*;
import logica.*;

public class DAOPropietario {
	
	/**
	 * Crea una instancia en la tabla de propietarios.
	 * @param pexposicion: Objeto Coleccionista
	 */	
	public static void crear(Propietario ppropietario){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist(ppropietario);
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
	 * Busca una instancia en la tabla de propietarios usando el id del propietario.
	 * @param pidPropietario: id del propietario.
	 */	
	public static Propietario buscar(String pidPropietario){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Propietario propietario = null;
		try{
			propietario = em.find(Propietario.class, pidPropietario);
		}
		catch (Exception ex){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return propietario;
	}
	
	/**
	 * Actualiza una instancia en la tabla de propietarios.
	 * @param pcoleccionista: Objeto Coleccionista.
	 */	
	public static void actualizar(Propietario ppropietario){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge(ppropietario);
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
	 * Actualiza una instancia en la tabla de propietarios.
	 * @param pcoleccionista: Objeto Exposicion.
	 */		
	public static void borrar(Propietario ppropietario){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Propietario pMerge = em.merge(ppropietario);
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
