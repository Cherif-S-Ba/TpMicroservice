package com.esmt.m223isi.microservices.UserAuthentificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esmt.m223isi.microservices.UserAuthentificationservice.entity.User;


public interface UserRepository extends JpaRepository<User, String>{

}
