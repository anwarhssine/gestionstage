package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.gestionstage.entity.ResponsableFiliere;
import ma.emsi.gestionstage.repository.ResponsableRepo;

@RestController
public class ResponsableFiliereController {
	@Autowired
	ResponsableRepo repo;
	
	@PostMapping("/responsablefiliere/save")
	public void save(@RequestBody ResponsableFiliere respo) {
		repo.save(respo);
	}
	
	@GetMapping("/responsablefiliere/all")
	public List<ResponsableFiliere> findAll(){
		return repo.findAll();
	}
	
	@DeleteMapping("/responsablefiliere/delete/{id_responsable}")
	public void delete(@PathVariable(required = true) String id_responsable) {
		repo.delete(repo.findById(Integer.parseInt(id_responsable)).get());
	}
	
	@PostMapping("/responsablefiliere/update/{id_responsable}")
	public void update(@PathVariable(required = true) String id_responsable, @RequestBody ResponsableFiliere responsable) {
		ResponsableFiliere r = repo.getOne(Integer.parseInt(id_responsable));
		r.setNom(responsable.getNom());
		r.setPrenom(responsable.getPrenom());
		r.setAdresse(responsable.getAdresse());
		r.setFiliere(responsable.getFiliere());
		repo.save(r);
	}
}
