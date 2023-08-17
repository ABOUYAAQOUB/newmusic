package com.newmusic.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newmusic.IService.IPoste;
import com.newmusic.Model.Poste;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class PosteController {

	private IPoste iPoste;

	public PosteController(IPoste iPoste) {
		
		this.iPoste = iPoste;
	}
	
	@GetMapping("/postes")
	public List<Poste>getAll(){
		
		return this.iPoste.getAll();
	}
	
	@GetMapping("/poste/{id}")
	public Poste getPoste(@PathVariable long id) {
		
		return this.iPoste.get(id);
	}
	
	@PostMapping("/poste")
	public Poste create(@RequestBody Poste poste) {
		
		return this.iPoste.create(poste);
	}
	
	@PutMapping("/poste")
	public Poste update(@RequestBody Poste poste) {
		
		return this.iPoste.update(poste);
	}
	
	@DeleteMapping("/poste/{id}")
	public void delete (@PathVariable long id) {
		
		this.iPoste.delete(id);
	}
	
}
