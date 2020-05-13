package ma.emsi.gestionstage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String raison_sociale;
	private String nom_directeur;
	private String adresse;
	private String tel;
	private String fax;
	private String nom_responsable_rh;
	
	public String getRaison_sociale() {
		return raison_sociale;
	}
	
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	
	public String getNom_directeur() {
		return nom_directeur;
	}
	
	public void setNom_directeur(String nom_directeur) {
		this.nom_directeur = nom_directeur;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getNom_responsable_rh() {
		return nom_responsable_rh;
	}
	
	public void setNom_responsable_rh(String nom_responsable_rh) {
		this.nom_responsable_rh = nom_responsable_rh;
	}
	
	public int getId() {
		return id;
	}	
}
