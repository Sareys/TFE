package com.moujib.Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Platform implements Serializable {
	
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany
	private List<Game> games;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	private Calendar releaseDate;

}
