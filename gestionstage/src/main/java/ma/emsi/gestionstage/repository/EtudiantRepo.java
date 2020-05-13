package ma.emsi.gestionstage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.gestionstage.entity.Etudiant;

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer>{
	List<Etudiant> findByPrenom(String prenom);
}
