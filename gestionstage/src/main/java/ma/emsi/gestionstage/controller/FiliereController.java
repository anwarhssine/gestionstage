package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import ma.emsi.gestionstage.entity.Filiere;
import ma.emsi.gestionstage.repository.FiliereRepo;

@RestController
public class FiliereController {
	@Autowired
	private FiliereRepo repo;
	
	@PostMapping("/filiere/save")
	public void save(@RequestBody Filiere filiere) {
		repo.save(filiere);
	}
	
	
	@GetMapping("/filiere/all")
	public List<Filiere>findAll(){
		return repo.findAll();
	}
	
	@DeleteMapping("/filiere/delete/{id}")
	public void delete(@PathVariable(required=true) String id) {
		repo.delete(repo.findById(Integer.parseInt(id)).get());
	}
	
	@PostMapping("/filiere/update/{id}")
	public void update(@PathVariable(required=true) String id, @RequestBody Filiere f) {
		Filiere filiere = repo.findById(Integer.parseInt(id)).get();
		filiere.setLibelle(f.getLibelle());
		repo.save(filiere);
	}
	
}
