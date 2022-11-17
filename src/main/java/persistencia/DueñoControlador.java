package persistencia;

import logica.Dueño;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class DueñoControlador implements Serializable{

	public DueñoControlador(EntityManagerFactory emf) {
		this.emf=emf;
	}
	
	private EntityManagerFactory emf=null;
    
	public DueñoControlador() {
		emf= Persistence.createEntityManagerFactory("prueba");
	}
	
	public  EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void create(Dueño dueño) {
		EntityManager em = null;
		
		try {
			em= getEntityManager();
			em.getTransaction().begin();
			em.persist(dueño);
			em.getTransaction().commit();
		}
		
		finally {
			if(em!=null) {
				em.close();
			}
		}
	}
	
}
