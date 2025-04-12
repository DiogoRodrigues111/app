package com.example.app.app.users;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.app.jpa.IUserRepository;
import com.example.app.app.jpa.UserRepositoryEntity;
import com.example.app.app.jpa.UserServiceRepository;

public class Users extends UserServiceRepository {
	
	@Autowired
	UserServiceRepository iUserServRepo;
	
	public Users() {
		
	}

	public UserRepositoryEntity addUserEmailPg(String name, String email) {
		UserRepositoryEntity user = new UserRepositoryEntity();
		
		user.setName(name);
		user.setEmail(email);

		this.save(user);
		
		return user;
	}
}
