package com.example.app.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.app.jpa.UserRepositoryEntity;
import com.example.app.app.users.Users;


@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
		Users users = new Users();
		users.addUserEmailPg("Me", "love@other.com");
	}

}
