package com.newmusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newmusic.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	@Query("select r from Role where r.rolename = :rolename")
	public Role getByRoleName(@Param("rolename") String roleName);
}
