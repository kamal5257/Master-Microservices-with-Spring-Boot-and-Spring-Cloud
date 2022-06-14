package com.rest.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService daoService;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return daoService.findAll();
	}
	
}
