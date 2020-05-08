package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Filiere;

public interface FiliereRepo extends JpaRepository<Filiere, Integer> {
	
}
