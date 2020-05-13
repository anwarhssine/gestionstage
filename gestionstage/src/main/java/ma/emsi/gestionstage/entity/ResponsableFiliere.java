package ma.emsi.gestionstage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ResponsableFiliere extends Personne {
	@OneToOne(mappedBy = "responsable")
	private Filiere filiere;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Projet projets;
	
	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
}
