package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Poste;

public interface IPoste {

	public List<Poste>getAll();
	public Poste get(long id);
	public Poste create(Poste poste);
	public Poste update(Poste poste);
	public void delete(long id);
}
