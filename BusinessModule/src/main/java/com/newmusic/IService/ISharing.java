package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Sharing;

public interface ISharing {
	
	public List<Sharing>getAll();
	public Sharing get(long id);
	public Sharing create(Sharing sharing);
	public Sharing update(Sharing sharingy);
	public void delete(long id);
}
