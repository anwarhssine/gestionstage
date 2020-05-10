package ma.emsi.gestionstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.gestionstage.entity.GroupeEtudiant;
import ma.emsi.gestionstage.repository.GroupeEtudiantRepo;

@RestController
public class GroupeEtudiantController {
	
	@Autowired
	GroupeEtudiantRepo repo;
	
	@PostMapping("/groupeetudiant/save")
	public void save(@RequestBody GroupeEtudiant g) {
		repo.save(g);
	}
	
	@GetMapping("/groupeetudiant/all")
	public List<GroupeEtudiant> findAll() {
		return repo.findAll();
	}
	
	@DeleteMapping("/groupeetudiant/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		repo.deleteById(Integer.parseInt(id));
	}
	
	@PostMapping("/groupeetudiant/update/{id}")
	public void update(@PathVariable(required=true) String id, @RequestBody(required = true) GroupeEtudiant new_groupe) {
		GroupeEtudiant groupe = repo.findById(Integer.parseInt(id)).get();
		groupe.setEtudiants(new_groupe.getEtudiants());
		repo.save(groupe);	
	}
	
}
