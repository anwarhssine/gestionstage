package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.ResponsableFiliere;

public interface ResponsableRepo extends JpaRepository<ResponsableFiliere, Integer> {
	
}
