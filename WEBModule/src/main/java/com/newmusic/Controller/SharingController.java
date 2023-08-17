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

import com.newmusic.IService.ISharing;
import com.newmusic.Model.Role;
import com.newmusic.Model.Sharing;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class SharingController {

	private ISharing iSharing;

	public SharingController(ISharing iSharing) {
		
		this.iSharing = iSharing;
	}
	
	@GetMapping("/sharings")
	public List<Sharing>getAll(){
		
		return this.iSharing.getAll();
	}
	
	@GetMapping("/role/{id}")
	public Sharing getSharing(@PathVariable long id) {
		
		return this.iSharing.get(id);
	}
	
	@PostMapping("/sharing")
	public Sharing create(@RequestBody Sharing sharing) {
		
		return this.iSharing.create(sharing);
	}
	
	@PutMapping("/sharing")
	public Sharing update(@RequestBody Sharing sharing) {
		
		return this.iSharing.update(sharing);
	}
	
	@DeleteMapping("/sharing/{id}")
	public void delete (@PathVariable long id) {
		
		this.iSharing.delete(id);
	}
	
}
