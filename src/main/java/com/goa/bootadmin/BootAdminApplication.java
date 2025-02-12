package com.goa.bootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class BootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminApplication.class, args);
	}
	
}

