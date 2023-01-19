package com.esmt.m223isi.microservices.UserAuthentificationservice.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class User implements Serializable{

	@Id
	@Column(length=25)
	private int id;
	private String login;
	private String motDePasse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
}
