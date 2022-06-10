package com.javainuse.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.springbootsecurity.model.Login;


@Repository
public interface LoginDao extends JpaRepository<Login, Long> {
	Login findByUsername(String username);

}