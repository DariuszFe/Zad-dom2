package com.example.DariuszFe.service;

import java.util.ArrayList;
import java.util.List;

import com.example.DariuszFe.domain.User;

public class UserService {
	
	private List<User> db = new ArrayList<User>();
	
	public void add(User user){
		User newUser = new User(user.getlogin(), user.getpassword());
		db.add(newUser);
	}
	
	public List<User> getAllUsers(){
		return db;
	}

}
