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

import com.newmusic.IService.IRole;
import com.newmusic.Model.Role;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class RoleController {

	private IRole iRole;

	public RoleController(IRole iRole) {
		
		this.iRole = iRole;
	}
	
	@GetMapping("/roles")
	public List<Role>getAll(){
		
		return this.iRole.getAll();
	}
	
	@GetMapping("/role/{id}")
	public Role getRole(@PathVariable long id) {
		
		return this.iRole.get(id);
	}
	
	@PostMapping("/role")
	public Role create(@RequestBody Role role) {
		
		return this.iRole.create(role);
	}
	
	@PutMapping("/commant")
	public Role update(@RequestBody Role role) {
		
		return this.iRole.update(role);
	}
	
	@DeleteMapping("/role/{id}")
	public void delete (@PathVariable long id) {
		
		this.iRole.delete(id);
	}
	
}
