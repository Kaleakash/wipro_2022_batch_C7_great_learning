package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		auth.inMemoryAuthentication().withUser("Raj").password(passwordEncoder().encode("123")).roles("USER_ROLE");
		auth.inMemoryAuthentication().withUser("Admin").password(passwordEncoder().encode("Admin")).roles("ADMIN_ROLE");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		http.csrf().disable();
		http.formLogin();
		//http.authorizeRequests().antMatchers("/auth/**").fullyAuthenticated().and().httpBasic();
//http.authorizeRequests().antMatchers("/auth/admin/**").hasRole("ADMIN_ROLE").anyRequest().fullyAuthenticated().and().httpBasic();
//http.authorizeRequests().antMatchers("/auth/user/**").hasAnyRole("ADMIN_ROLE","USER_ROLE").anyRequest().fullyAuthenticated().and().httpBasic();
	
		http.authorizeRequests().antMatchers("/auth/admin/**").hasRole("ADMIN_ROLE").
		antMatchers("/auth/user/**").hasAnyRole("ADMIN_ROLE","USER_ROLE").
		anyRequest().fullyAuthenticated().and().httpBasic();
	}

	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
}
