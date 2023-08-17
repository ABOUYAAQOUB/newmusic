package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Role;

public interface IRole {
	
	public List<Role>getAll();
	public Role get(long id);
	public Role create(Role role);
	public Role update(Role role);
	public void delete(long id);
}
