package com.newmusic.IService;

import java.util.List;

import com.newmusic.Model.Friend;

public interface IFriend {
	
	public List<Friend>getAll();
	public Friend get(long id);
	public Friend create(Friend friend);
	public Friend update(Friend friend);
	public void delete(long id);
}
