package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IAccount;
import com.newmusic.Model.Account;
import com.newmusic.Model.Role;
import com.newmusic.Repository.AccountRepository;
import com.newmusic.Repository.RoleRepository;

@Service
public class AccountService implements IAccount{

	private AccountRepository accountRepository;
	private RoleRepository roleRepository;
	
	public AccountService(AccountRepository accountRepository,RoleRepository roleRepository) {
		
		this.accountRepository = accountRepository;
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Account> getAll() {
		
		return this.accountRepository.findAll();
	}

	@Override
	public Account get(long id) {
		
		return this.accountRepository.getById(id);
	}

	@Override
	public Account create(Account account) {
		
		if(		this.accountRepository.findByUsername(account.getUsername()) == null &&
				this.accountRepository.findByEmail(account.getEmail()) == null
		  ) {
				return this.accountRepository.save(account);
		    }
		return null;
	}

	@Override
	public Account update(Account account) {
		
		if( this.accountRepository.findByUsername(account.getUsername()) == null ||
			this.accountRepository.findByUsername(account.getUsername()).getId() == account.getId()
		  ) {
			if( this.accountRepository.findByEmail(account.getEmail()) == null ||
				this.accountRepository.findByEmail(account.getEmail()).getId() == account.getId()
			  ) {
					this.accountRepository.save(account);
			    }
		    }
		
		return null;
	}

	@Override
	public void delete(long id) {
		
		this.accountRepository.delete(this.accountRepository.getById(id));		
	}

	@Override
	public void roleToAccount(String userName, String roleName) {
		
		Role role = this.roleRepository.getByRoleName(roleName);
		Account account = this.accountRepository.findByUsername(userName);
		
		account.getRoles().add(role);
		this.accountRepository.save(account);
	}

}
