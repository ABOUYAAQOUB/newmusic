package com.newmusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newmusic.IService.IFriend;
import com.newmusic.Model.Friend;
import com.newmusic.Repository.FriendRepository;

@Service
public class FriendService implements IFriend{

	private FriendRepository friendRepository;
	
	public FriendService(FriendRepository friendRepository) {
		
		this.friendRepository = friendRepository;
	}

	@Override
	public List<Friend> getAll() {
		
		return this.friendRepository.findAll();
	}

	@Override
	public Friend get(long id) {
		
		return this.friendRepository.getById(id);
	}

	@Override
	public Friend create(Friend friend) {
		
		return this.friendRepository.save(friend);
	}

	@Override
	public Friend update(Friend friend) {
		
		return this.friendRepository.save(friend);
	}

	@Override
	public void delete(long id) {
		
		this.friendRepository.delete(this.friendRepository.getById(id));
	}

}
