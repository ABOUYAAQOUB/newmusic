package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.ICommant;
import com.newmusic.Model.Commant;
import com.newmusic.Repository.CommantRepository;

@Service
public class CommantService implements ICommant{

	private CommantRepository commantRepository;
	
	public CommantService(CommantRepository commantRepository) {
		
		this.commantRepository = commantRepository;
	}

	@Override
	public List<Commant> getAll() {
		
		return this.commantRepository.findAll();
	}

	@Override
	public Commant get(long id) {
		
		return this.commantRepository.getById(id);
	}

	@Override
	public Commant create(Commant commant) {
		
		return this.commantRepository.save(commant);
	}

	@Override
	public Commant update(Commant commant) {
		
		return this.commantRepository.save(commant);
	}

	@Override
	public void delete(long id) {
		
		this.commantRepository.delete(this.commantRepository.getById(id));
	}

}
