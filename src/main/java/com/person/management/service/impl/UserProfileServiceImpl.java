package com.person.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.person.management.entity.UserProfile;
import com.person.management.repository.UserProfileRepository;
import com.person.management.service.UserProfileService;


@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired
	UserProfileRepository dao;
	
	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public UserProfile findByType(String type){
		return dao.findByType(type);
	}

	public List<UserProfile> findAll() {
		return dao.findAll();
	}
}
