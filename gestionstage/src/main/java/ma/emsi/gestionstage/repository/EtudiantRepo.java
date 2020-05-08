package ma.emsi.gestionstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Etudiant;

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer>{

}
