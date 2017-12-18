package com.moujib.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class User implements Serializable {
	
	@Id
	private int id;
	
	private String username;
	
	private String password;
	
	private String mail;
	
	@OneToMany
	private List<Comment> comments;
	
	@OneToMany
	private List<Critic> critics;
	
	@OneToMany
	private List<Game> favorites;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Critic> getCritics() {
		return critics;
	}

	public void setCritics(List<Critic> critics) {
		this.critics = critics;
	}

	public List<Game> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Game> favorites) {
		this.favorites = favorites;
	}
	
	

}
