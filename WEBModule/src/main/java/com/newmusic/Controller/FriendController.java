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

import com.newmusic.IService.IFriend;
import com.newmusic.Model.Friend;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class FriendController {

	private IFriend iFriend;

	public FriendController(IFriend iFriend) {
		
		this.iFriend = iFriend;
	}
	
	@GetMapping("/friends")
	public List<Friend>getAll(){
		
		return this.iFriend.getAll();
	}
	
	@GetMapping("/friend/{id}")
	public Friend getFriend(@PathVariable long id) {
		
		return this.iFriend.get(id);
	}
	
	@PostMapping("/friend")
	public Friend create(@RequestBody Friend friend) {
		
		return this.iFriend.create(friend);
	}
	
	@PutMapping("/friend")
	public Friend update(@RequestBody Friend friend) {
		
		return this.iFriend.update(friend);
	}
	
	@DeleteMapping("/friend/{id}")
	public void delete (@PathVariable long id) {
		
		this.iFriend.delete(id);
	}
	
}
