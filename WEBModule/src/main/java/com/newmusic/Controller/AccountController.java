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

import com.newmusic.IService.IAccount;
import com.newmusic.Model.Account;
import com.newmusic.Model.RoleAccount;

@CrossOrigin("*")
@RestController
@RequestMapping("/newmusic")
public class AccountController {

	private IAccount iAccount;

	public AccountController(IAccount iAccount) {
		
		this.iAccount = iAccount;
	}
	
	@GetMapping("/accounts")
	public List<Account>getAll(){
		
		return this.iAccount.getAll();
	}
	
	@GetMapping("/account/{id}")
	public Account getAccount(@PathVariable long id) {
		
		return this.iAccount.get(id);
	}
	
	@PostMapping("/account")
	public Account create(@RequestBody Account account) {
		
		return this.iAccount.create(account);
	}
	
	@PutMapping("/account")
	public Account update(@RequestBody Account account) {
		
		return this.iAccount.update(account);
	}
	
	@DeleteMapping("/account/{id}")
	public void delete(@PathVariable long id) {
		
		this.iAccount.delete(id);
	}
	
	public void addRoleToAccount(@RequestBody RoleAccount roleAccount) {
		
		this.iAccount.roleToAccount(roleAccount.getAccountName(), roleAccount.getRoleName());
	}
}
