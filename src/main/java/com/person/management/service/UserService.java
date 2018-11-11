package com.person.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.person.management.entity.User;

@Service
public interface UserService {
	
	User findById(int id);
	
	User findBySSO(String sso);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}