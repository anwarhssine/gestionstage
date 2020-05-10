package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Professeur;

public interface ProfesseurRepo extends JpaRepository<Professeur, Integer> {
	
}
