
package com.example.loginform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.controller"})
//@SpringBootApplication
public class LoginformApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginformApplication.class, args);
	}

}
