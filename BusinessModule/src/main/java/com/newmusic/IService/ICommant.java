package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Commant;

public interface ICommant {

	public List<Commant>getAll();
	public Commant get(long id);
	public Commant create(Commant commant);
	public Commant update(Commant commant);
	public void delete(long id);
}
