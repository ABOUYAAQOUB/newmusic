package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IReaction;
import com.newmusic.Model.Reaction;
import com.newmusic.Repository.ReactionRepository;

@Service
public class ReactionService implements IReaction{

	private ReactionRepository reactionRepository;
	
	public ReactionService(ReactionRepository reactionRepository) {
		
		this.reactionRepository = reactionRepository;
	}

	@Override
	public List<Reaction> getAll() {
		
		return this.reactionRepository.findAll();
	}

	@Override
	public Reaction get(long id) {
		
		return this.reactionRepository.getById(id);
	}

	@Override
	public Reaction create(Reaction reaction) {
		
		return this.reactionRepository.save(reaction);
	}

	@Override
	public Reaction update(Reaction reaction) {
		
		return this.reactionRepository.save(reaction);
	}

	@Override
	public void delete(long id) {
		
		this.reactionRepository.delete(this.reactionRepository.getById(id));
	}

}
