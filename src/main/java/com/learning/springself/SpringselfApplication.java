package com.learning.springself;

import com.learning.springself.config.JwtAuthenticationFilter;
import com.learning.springself.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;

@SpringBootApplication
public class SpringselfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringselfApplication.class, args);
	}
}
