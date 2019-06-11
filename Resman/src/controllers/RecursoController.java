package controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import code.Recurso;

public class RecursoController {
	EntityManagerFactory emf;
	EntityManager em;
	
	public RecursoController() {
		this.emf = Persistence.createEntityManagerFactory("recurso");
		this.em = emf.createEntityManager();
	}
	
	public void salvar(Recurso r) {
		em.getTransaction().begin();
		em.merge(r);
		em.getTransaction().commit();
		emf.close();
	}
	

}
