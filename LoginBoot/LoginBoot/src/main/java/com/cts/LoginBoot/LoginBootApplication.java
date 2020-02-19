package com.cts.LoginBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class LoginBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginBootApplication.class, args);
	}

}
