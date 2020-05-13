package ma.emsi.gestionstage.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jury {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToMany(mappedBy = "jury")
	@JsonIgnore
	private List<Professeur> professeurs;
	
	@OneToOne(mappedBy = "jury")
	private Projet projet;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	
	
	
}
