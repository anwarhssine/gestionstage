package ma.emsi.gestionstage.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class EncadrantEntreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String tele;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "entreprise_id")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "encadrant_entreprise")
	private List<Stage> stages;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getTele() {
		return tele;
	}
	
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}
	
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	public int getId() {
		return id;
	}
	public List<Stage> getStages() {
		return stages;
	}
	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	
	
	
	
}
