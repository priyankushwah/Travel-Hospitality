package com.priyankk.user_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyankk.user_microservice.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	public User findByEmail(String email);
}
