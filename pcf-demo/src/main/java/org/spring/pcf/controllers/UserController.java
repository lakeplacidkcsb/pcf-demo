package org.spring.pcf.controllers;

import org.spring.pcf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable Long id){
		return new ResponseEntity<>(userRepository.findById(id).map(user -> user).orElse(null), HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getAllUser(){
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}
	
}
