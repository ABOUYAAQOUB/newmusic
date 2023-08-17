package com.newmusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newmusic.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
