package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.ISharing;
import com.newmusic.Model.Sharing;
import com.newmusic.Repository.SharingRepository;

@Service
public class SharingService implements ISharing{

	private SharingRepository sharingRepository;
	
	public SharingService(SharingRepository sharingRepository) {
		
		this.sharingRepository = sharingRepository;
	}

	@Override
	public List<Sharing> getAll() {
		
		return this.sharingRepository.findAll();
	}

	@Override
	public Sharing get(long id) {
		
		return this.sharingRepository.getById(id);
	}

	@Override
	public Sharing create(Sharing sharing) {
		
		return this.sharingRepository.save(sharing);
	}

	@Override
	public Sharing update(Sharing sharingy) {
		
		return this.sharingRepository.save(sharingy);
	}

	@Override
	public void delete(long id) {
		
		this.sharingRepository.delete(this.sharingRepository.getById(id));
	}

}
