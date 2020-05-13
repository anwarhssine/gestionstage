package ma.emsi.gestionstage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Stage extends Projet{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private EncadrantEntreprise encadrant_entreprise;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ResponsableFiliere responsable_filiere;

	public EncadrantEntreprise getEncadrant_entreprise() {
		return encadrant_entreprise;
	}

	public void setEncadrant_entreprise(EncadrantEntreprise encadrant_entreprise) {
		this.encadrant_entreprise = encadrant_entreprise;
	}

	public ResponsableFiliere getResponsable_filiere() {
		return responsable_filiere;
	}

	public void setResponsable_filiere(ResponsableFiliere responsable_filiere) {
		this.responsable_filiere = responsable_filiere;
	}

	public int getId() {
		return id;
	}
	
	
	
}
