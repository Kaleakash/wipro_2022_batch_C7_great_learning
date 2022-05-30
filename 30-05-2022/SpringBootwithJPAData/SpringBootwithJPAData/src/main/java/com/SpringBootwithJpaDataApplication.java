package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	// Enable @RestController, @Service and @Repositoyr 
@EntityScan(basePackages = "com.bean")				// Enable @Entity class 
@EnableJpaRepositories(basePackages = "com.repository")	// Enable JPARepository 
public class SpringBootwithJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootwithJpaDataApplication.class, args);
		System.out.println("Server running on port number 8080");
	}

}
