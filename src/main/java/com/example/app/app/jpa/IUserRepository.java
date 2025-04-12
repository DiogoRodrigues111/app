package com.example.app.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(basePackages = "com.example.app.app.jpa")
public interface IUserRepository 
    extends JpaRepository<UserRepositoryEntity, Long> {
    
}
