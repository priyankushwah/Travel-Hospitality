package com.priyankk.user_microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priyankk.user_microservice.entity.User;
import com.priyankk.user_microservice.service.UserService;

@RestController
public class SignUpController {
	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@RequestBody User user){
		
		User fetchedUser = userService.signMeUp(user);
		if(fetchedUser == null) {
			return new ResponseEntity<>("Account already Exists",HttpStatus.IM_USED);
		}
		
		return new ResponseEntity<>("Account Created, Login Now",HttpStatus.OK);
	}
	
}
