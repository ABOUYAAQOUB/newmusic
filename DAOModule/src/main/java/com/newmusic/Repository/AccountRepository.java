package com.newmusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newmusic.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	@Query("select a from Account where a.username = :username")
	public Account findByUsername(@Param("username") String username);
	
	@Query("select a from Account where a.email = :email")
	public Account findByEmail(@Param("email") String email);
}
