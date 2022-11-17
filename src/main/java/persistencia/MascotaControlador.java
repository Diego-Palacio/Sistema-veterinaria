package persistencia;

import logica.Mascota;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class MascotaControlador implements Serializable{

	public MascotaControlador(EntityManagerFactory emf) {
		this.emf=emf;
	}
	
	private EntityManagerFactory emf=null;
    
	public MascotaControlador() {
		emf= Persistence.createEntityManagerFactory("prueba");
	}
	
	public  EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void create(Mascota mascota) {
		EntityManager em = null;
		
		try {
			em= getEntityManager();
			em.getTransaction().begin();
			em.persist(mascota);
			em.getTransaction().commit();
		}
		
		finally {
			if(em!=null) {
				em.close();
			}
		}
	}
	
}
