package tn.Imane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Attribut {
	@Id
	@GeneratedValue
	private Integer id ;
	private String Nom ;
	private String Value ;
	private Integer regle ;
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
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public Integer getRegle() {
		return regle;
	}
	public void setRegle(Integer regle) {
		this.regle = regle;
	}
	public Attribut(Integer id, String nom, String value, Integer regle) {
		super();
		this.id = id;
		Nom = nom;
		Value = value;
		this.regle = regle;
	}
	public Attribut(){
		
	}

}
