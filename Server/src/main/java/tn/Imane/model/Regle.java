package tn.Imane.model;

import java.util.HashMap;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Regle {
	@Id
	@GeneratedValue
	private Integer id ;
	private String Nom ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Regle(Integer id, String nom) {
		super();
		this.id = id;
		Nom = nom;
	}
	public Regle() {
		
	}
}
