package com.moujib.Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Game implements Serializable {
	
	@Id
	private int id;
	
	private String title;
	
	@OneToMany
	private List<Platform> platforms;
	
	@OneToMany
	private List<Critic> critics;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Platform> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platforms = platforms;
	}

	public List<Critic> getCritics() {
		return critics;
	}

	public void setCritics(List<Critic> critics) {
		this.critics = critics;
	}

	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	private Calendar releaseDate;

}
