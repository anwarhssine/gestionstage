package ma.emsi.gestionstage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Professeur extends Personne{
	@ManyToOne
	@JoinColumn(name = "id_jury")
	private Jury jury;

	
	public Jury getJury() {
		return jury;
	}

	public void setJury(Jury jury) {
		this.jury = jury;
	}
	
	
}
