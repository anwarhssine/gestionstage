package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Entreprise;

public interface EntrepriseRepo extends JpaRepository<Entreprise, Integer> {

}
