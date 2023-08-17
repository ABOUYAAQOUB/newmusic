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

import com.newmusic.IService.ICommant;
import com.newmusic.Model.Commant;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class CommantController {

	public ICommant iCommant;

	public CommantController(ICommant iCommant) {
		
		this.iCommant = iCommant;
	}
	
	@GetMapping("/commants")
	public List<Commant>getAll(){
		
		return this.iCommant.getAll();
	}
	
	@GetMapping("/commant/{id}")
	public Commant getCommant(@PathVariable long id) {
		
		return this.iCommant.get(id);
	}
	
	@PostMapping("/commant")
	public Commant create(@RequestBody Commant commant) {
		
		return this.iCommant.create(commant);
	}
	
	@PutMapping("/commant")
	public Commant update(@RequestBody Commant commant) {
		
		return this.iCommant.update(commant);
	}
	
	@DeleteMapping("/commant/{id}")
	public void delete (@PathVariable long id) {
		
		this.iCommant.delete(id);
	}
}
