package com.priyankk.user_microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyankk.user_microservice.entity.User;
import com.priyankk.user_microservice.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public User signMeUp(User user) {
		
		User checkIfUser = userRepo.findByEmail(user.getEmail());
		if(checkIfUser == null) {
			userRepo.save(user);
			return user;
		}
		
		return null;	
	}
	
}
