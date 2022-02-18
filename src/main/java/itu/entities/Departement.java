package itu.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue
	private int id_departement;
	private String nom_departement;
	
	
	public int getId_departement() {
		return id_departement;
	}
	public void setId_departement(int id_departement) {
		this.id_departement = id_departement;
	}
	public String getNom_departement() {
		return nom_departement;
	}
	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}
	public Departement() {
		super();
	}
	public Departement(String nom_departement) {
		super();
		this.nom_departement = nom_departement;
	}
	
}
