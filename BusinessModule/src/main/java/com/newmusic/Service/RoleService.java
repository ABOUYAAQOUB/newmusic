package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IRole;
import com.newmusic.Model.Role;
import com.newmusic.Repository.RoleRepository;

@Service
public class RoleService implements IRole{

	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository) {
		
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> getAll() {
		
		return this.roleRepository.findAll();
	}

	@Override
	public Role get(long id) {
		
		return this.roleRepository.getById(id);
	}

	@Override
	public Role create(Role role) {
		
		return this.roleRepository.save(role);
	}

	@Override
	public Role update(Role role) {
		
		return this.roleRepository.save(role);
	}

	@Override
	public void delete(long id) {
		
		this.roleRepository.delete(this.roleRepository.getById(id));
	}

}
