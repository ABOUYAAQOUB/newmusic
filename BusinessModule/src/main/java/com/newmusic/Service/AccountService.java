package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IAccount;
import com.newmusic.Model.Account;
import com.newmusic.Repository.AccountRepository;

@Service
public class AccountService implements IAccount{

	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository) {
		
		this.accountRepository = accountRepository;
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

}
