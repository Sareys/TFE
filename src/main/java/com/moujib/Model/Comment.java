package com.moujib.Model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Comment implements Serializable {
	
	@Id
	private int id;
	
	@ManyToOne
	private Critic critic;
	
	@ManyToOne
	private User author;
	
	@ManyToOne
	private Game game;
	
	private String text;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Critic getCritic() {
		return critic;
	}

	public void setCritic(Critic critic) {
		this.critic = critic;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
