package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PaytmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceApplication.class, args);
		System.out.println("paytm service is up on server port 8484");
	}
	
	// This method is reponsible to create the object by us 
	// but maintain by container or called by container. 
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
