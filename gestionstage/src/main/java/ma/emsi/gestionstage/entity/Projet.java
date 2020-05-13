package ma.emsi.gestionstage.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

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
	private Professeur encadrant;
	private Date date_soutenance;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="jury_id")
	private Jury jury;
	
	
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
	public Professeur getEncadrant() {
		return encadrant;
	}
	public void setEncadrant(Professeur encadrant) {
		this.encadrant = encadrant;
	}
	
	
	
	
	
	
}
