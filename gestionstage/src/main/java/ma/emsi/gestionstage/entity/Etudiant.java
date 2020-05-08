package ma.emsi.gestionstage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Etudiant extends Personne{
	@ManyToOne
	@JoinColumn(name="id_filiere")
	private Filiere filiere;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
}
