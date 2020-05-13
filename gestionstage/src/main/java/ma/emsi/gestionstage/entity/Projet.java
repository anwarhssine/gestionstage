package ma.emsi.gestionstage.entity;

import java.util.Date;

import javax.persistence.*;

@MappedSuperclass
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date date_debut;
	private Date date_fin;
	private String sujet;
	@ManyToOne
	@JoinColumn(name="id_encadrant")
	private Professeur encadrant_pedagogique;
	private Date date_soutenance;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="jury_id")
	private Jury jury;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_responsable_filiere")
	private ResponsableFiliere responsable_filiere;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_groupe")
	private GroupeEtudiant groupe;
		
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public Date getDate_soutenance() {
		return date_soutenance;
	}
	public void setDate_soutenance(Date date_soutenance) {
		this.date_soutenance = date_soutenance;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public Professeur getEncadrant_pedagogique() {
		return encadrant_pedagogique;
	}
	public void setEncadrant_pedagogique(Professeur encadrant_pedagogique) {
		this.encadrant_pedagogique = encadrant_pedagogique;
	}
	public Jury getJury() {
		return jury;
	}
	public void setJury(Jury jury) {
		this.jury = jury;
	}
	public ResponsableFiliere getResponsable_filiere() {
		return responsable_filiere;
	}
	public void setResponsable_filiere(ResponsableFiliere responsable_filiere) {
		this.responsable_filiere = responsable_filiere;
	}
	public GroupeEtudiant getGroupe() {
		return groupe;
	}
	public void setGroupe(GroupeEtudiant groupe) {
		this.groupe = groupe;
	}

	
	
	
	
	
	
}
