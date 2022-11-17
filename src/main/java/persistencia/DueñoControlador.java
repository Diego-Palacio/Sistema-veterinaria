package persistencia;

import logica.Due�o;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class Due�oControlador implements Serializable{

	public Due�oControlador(EntityManagerFactory emf) {
		this.emf=emf;
	}
	
	private EntityManagerFactory emf=null;
    
	public Due�oControlador() {
		emf= Persistence.createEntityManagerFactory("prueba");
	}
	
	public  EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void create(Due�o due�o) {
		EntityManager em = null;
		
		try {
			em= getEntityManager();
			em.getTransaction().begin();
			em.persist(due�o);
			em.getTransaction().commit();
		}
		
		finally {
			if(em!=null) {
				em.close();
			}
		}
	}
	
}
