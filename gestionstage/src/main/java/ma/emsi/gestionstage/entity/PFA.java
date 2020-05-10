package ma.emsi.gestionstage.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PFA extends Projet{
	@ManyToOne
	@JoinColumn(name = "id_groupe")
	private GroupeEtudiant groupe;
	
	public GroupeEtudiant getGroupe() {
		return groupe;
	}

	public void setGroupe(GroupeEtudiant groupe) {
		this.groupe = groupe;
	}
	
	
}
