package ma.emsi.gestionstage.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Professeur extends Personne{
	@ManyToOne
	@JoinColumn(name = "id_jury")
	private Jury jury;
	
	@OneToMany(mappedBy = "encadrant_pedagogique")
	private List<Projet> projets;
	
	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	
}
