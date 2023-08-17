package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IPoste;
import com.newmusic.Model.Poste;
import com.newmusic.Repository.PosteRepository;

@Service
public class PosteService implements IPoste{

	private PosteRepository posteRepository;
	
	public PosteService(PosteRepository posteRepository) {
	
		this.posteRepository = posteRepository;
	}

	@Override
	public List<Poste> getAll() {
		
		return this.posteRepository.findAll();
	}

	@Override
	public Poste get(long id) {
		
		return this.posteRepository.getById(id);
	}

	@Override
	public Poste create(Poste poste) {
		
		return this.posteRepository.save(poste);
	}

	@Override
	public Poste update(Poste poste) {
		
		return this.posteRepository.save(poste);
	}

	@Override
	public void delete(long id) {
		
		this.posteRepository.delete(this.posteRepository.getById(id));
	}

}
