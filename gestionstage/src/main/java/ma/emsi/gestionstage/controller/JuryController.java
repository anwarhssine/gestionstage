package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.gestionstage.entity.Jury;
import ma.emsi.gestionstage.repository.JuryRepo;

@RestController
public class JuryController {
	@Autowired
	JuryRepo repo;
	
	@PostMapping("/jury/save")
	public void save(@RequestBody Jury jury ) {
		repo.save(jury);
	}
	
	@GetMapping("/jury/all")
	public List<Jury> findAll() {
		return repo.findAll();
	}
	
	@DeleteMapping("/jury/delete/{id_jury}")
	public void delete(@PathVariable String id_jury) {
		repo.delete(repo.getOne(Integer.parseInt(id_jury)));
	}
	
	
	@PostMapping("/jury/update/{id_jury}")
	public void update(@PathVariable String id_jury, @RequestBody Jury j) {
		Jury jury = repo.getOne(Integer.parseInt(id_jury));
		jury.setProfesseurs(j.getProfesseurs());
		repo.save(jury);
	}
}
