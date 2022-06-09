package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	

	// 1st way to set username and password using java classes 
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		// TODO Auto-generated method stub
//		//return super.userDetailsService();
//		
//		List<UserDetails> listOfUser = new ArrayList<UserDetails>();
//		listOfUser.add(User.withDefaultPasswordEncoder().username("Ajay").password("123").roles("USER_ROLE").build());
//		listOfUser.add(User.withDefaultPasswordEncoder().username("Vijay").password("567").roles("USER_ROLE").build());
//		
//		return new InMemoryUserDetailsManager(listOfUser);
//		
//	}

	//2nd way to set username and password using java classes 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//auth.inMemoryAuthentication().withUser("Raj").password("{noop}123").roles("USER_ROLE"); // NoOpasswordencoder
 		//super.configure(auth);
		String myEncodedPassword = passwordEncoder().encode("123");
		boolean res = passwordEncoder().matches("1234", myEncodedPassword);
		System.out.println(res);
		System.out.println("My Password is "+myEncodedPassword);
		auth.inMemoryAuthentication().withUser("Raj").password(myEncodedPassword).roles("USER_ROLE");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
}
