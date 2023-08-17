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

import com.newmusic.IService.IReaction;
import com.newmusic.Model.Reaction;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class ReactionController {

	private IReaction iReaction;

	public ReactionController(IReaction iReaction) {
		
		this.iReaction = iReaction;
	}
	
	@GetMapping("/reactions")
	public List<Reaction>getAll(){
		
		return this.iReaction.getAll();
	}
	
	@GetMapping("/reaction/{id}")
	public Reaction getReaction(@PathVariable long id) {
		
		return this.iReaction.get(id);
	}
	
	@PostMapping("/reaction")
	public Reaction create(@RequestBody Reaction reaction) {
		
		return this.iReaction.create(reaction);
	}
	
	@PutMapping("/reaction")
	public Reaction update(@RequestBody Reaction reaction) {
		
		return this.iReaction.update(reaction);
	}
	
	@DeleteMapping("/reaction/{id}")
	public void delete (@PathVariable long id) {
		
		this.iReaction.delete(id);
	}
}
