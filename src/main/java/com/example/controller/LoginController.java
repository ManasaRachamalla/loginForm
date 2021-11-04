package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.LoginService;

@RequestMapping
@RestController
public class LoginController {

	private LoginService service;
	
	
	@PostMapping("/login")
	//@CrossOrigin(origins="https://localhost:4200")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user ) throws Exception
	{
		System.out.println(user.getUserName() + user.getPassWord()  );
		//System.out.println(user.getPassWord()  );
		String tmpUser = user.getUserName();
		String tmpPwd = user.getPassWord();
		User userObj = new User() ; 
		//8a44a0ae8c5ae037bb1363d1342b9c5c
		if (tmpUser.equals("ADMIn") && tmpPwd.equals("8a44a0ae8c5ae037bb1363d1342b9c5c"))
		{
			//userObj.setUserName(tmpUser);
			//userObj.setPassWord(tmpPwd);
			//userObj.setId(1);
			//return userObj;
			service = new LoginService();
			userObj=service.fetchUserByUserAndPassword(tmpUser,tmpPwd);
		}
		
		//else(userObj==null)
		else 
		{
			throw new Exception("invalid credentials");
			
		}
		
		return userObj;
	}
	
	
	
	@PostMapping(path="/data",produces ="application/json")
	public String display()
	{
		
		return "abc";
	}
}
