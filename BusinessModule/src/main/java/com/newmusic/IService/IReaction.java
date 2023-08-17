package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Reaction;

public interface IReaction {

	public List<Reaction>getAll();
	public Reaction get(long id);
	public Reaction create(Reaction reaction);
	public Reaction update(Reaction reaction);
	public void delete(long id);
}
