package ma.emsi.gestionstage.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class GroupeEtudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String libelle;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<PFA> getPfa() {
		return pfa;
	}

	public void setPfa(List<PFA> pfa) {
		this.pfa = pfa;
	}

	@OneToMany(mappedBy = "groupe", cascade = {CascadeType.ALL})
	@JsonIgnore
	private List<Etudiant> etudiants;
	
	@OneToMany(mappedBy = "groupe", cascade = {CascadeType.ALL})
	@JsonIgnore
	private List<PFA> pfa;

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
}
