package com.jk2bpn.onlinetripbookingsystem.services;
import com.jk2bpn.onlinetripbookingsystem.entities.User;

public interface IUserService {
	public User addnewUser(User user);
	public User signIn(User user);
	public User signOut(User user);
	
}
