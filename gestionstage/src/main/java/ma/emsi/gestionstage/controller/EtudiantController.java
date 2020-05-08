package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.gestionstage.entity.Etudiant;
import ma.emsi.gestionstage.repository.EtudiantRepo;

@RestController
public class EtudiantController {
	@Autowired
	private EtudiantRepo repo;
	
	
	@PostMapping("/etudiant/save")
	public void save(@RequestBody Etudiant e) {
		repo.save(e);
	}
	
	@GetMapping("/etudiant/all")
	public List<Etudiant> findAll() {
		return repo.findAll();
	}
	
	@DeleteMapping("/etudiant/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		repo.deleteById(Integer.parseInt(id));
	}
	
	@PostMapping("/etudiant/update/{id}")
	public void update(@PathVariable(required=true) String id, @RequestBody(required = true) Etudiant new_etudiant) {
		Etudiant e = repo.findById(Integer.parseInt(id)).get();
		e.setNom(new_etudiant.getNom());
		e.setPrenom(new_etudiant.getPrenom());
		e.setAdresse(new_etudiant.getAdresse());
		e.setTele(new_etudiant.getTele());
		e.setFiliere(new_etudiant.getFiliere());
		repo.save(e);
	}
	
}
