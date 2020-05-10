package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.gestionstage.entity.Professeur;
import ma.emsi.gestionstage.repository.ProfesseurRepo;

@RestController
public class ProfesseurController {
	@Autowired
	ProfesseurRepo repo;
	
	
	
	@PostMapping("/professeur/save")
	public void save(@RequestBody Professeur p) {
		repo.save(p);
	}
	
	@GetMapping("/professeur/all")
	public List<Professeur>findAll() {
		return repo.findAll();
	}
	
	@DeleteMapping("/professeur/delete/{id_professeur}")
	public void delete(@PathVariable(required=true) String id_professeur) {
		repo.delete(repo.getOne(Integer.parseInt(id_professeur)));
	}
	
	
	@PostMapping("/professeur/update/{id_professeur}")
	public void update(@PathVariable(required = true) String id_professeur, @RequestBody Professeur prof) {
		Professeur p = repo.getOne(Integer.parseInt(id_professeur));
		p.setNom(prof.getNom());
		p.setPrenom(prof.getPrenom());
		p.setAdresse(prof.getAdresse());
		p.setTele(prof.getTele());
		repo.save(p);
	}
	
}
