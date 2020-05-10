package ma.emsi.gestionstage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ResponsableFiliere extends Personne {
	@OneToOne
	@JoinColumn(name = "id_filiere", referencedColumnName = "id")
	private Filiere filiere;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
}
