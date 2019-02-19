package com.webdev.angularjs.facade;

import java.util.List;

import com.webdev.angularjs.model.User;



public interface UserFacade {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
