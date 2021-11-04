package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface LoginRepository extends JpaRepository<User, Integer> {

	public User findByUserAndPassword(String userName,String passWord);
}
