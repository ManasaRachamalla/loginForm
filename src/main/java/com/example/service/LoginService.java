package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.LoginRepository;

@Service
public class LoginService {

	//@Autowired
	//private LoginRepository repository ;
	
	public User fetchUserByUserAndPassword(String userName, String passWord)
	{
		User userObj = new User();
		userObj.setUserName(userName);
		userObj.setPassWord(passWord);
		//userObj.setId(1);
		return userObj;
		//return repository.findByUserAndPassword(userName,  passWord);
		//return repository.findById(id)
	}
}
