package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Jury;

public interface JuryRepo extends JpaRepository<Jury, Integer> {

}
