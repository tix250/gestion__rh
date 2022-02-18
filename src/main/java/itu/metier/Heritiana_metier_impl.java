package itu.metier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import itu.entities.Departement;

public class Heritiana_metier_impl implements Heritiana_metier{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Departement inseretDepartement(Departement d) {
		em.persist(d);
		return null;
	}

}
