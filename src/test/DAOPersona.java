/**
 * @autor Jerson Chinchilla
 */
package test;

import javax.persistence.*;
import logica.*;

public class DAOPersona {
	
	public static void create( Persona pPersona ){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			em.persist( pPersona );
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
	
	public static Persona find( int pId ){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Persona persona = null;
		try{
			persona = em.find( Persona.class, pId );
		}
		catch ( Exception ex ){
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
		return persona;
	}
	
	public static void update( Persona pPersona ){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			em.merge( pPersona );
			tx.commit();
			System.out.println("Actualizacion exitosa");
		}
		catch( Exception ex ){
			tx.rollback();
			System.out.println("Error");
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
	}
	
	public static void delete( Persona pPersona ){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try{
			Persona pMerge = em.merge( pPersona );
		    em.remove( pMerge );
			em.getTransaction().commit();
			System.out.println("Borrado exitoso");
		}
		catch ( Exception ex ){
			ex.printStackTrace();
		}
		finally{
			em.close();
		}
	}

}
