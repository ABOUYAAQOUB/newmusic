package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Account;

public interface IAccount {
	
	public List<Account>getAll();
	public Account get(long id);
	public Account create(Account account);
	public Account update(Account account);
	public void delete(long id);
	
}
