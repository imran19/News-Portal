package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Forum forum;
	
	private String ime;
	
	protected Tema(){
	}
	
	public Tema(long id, Forum forum, String ime){
		this.id=id;
		this.forum=forum;
		this.ime=ime;				
	}
	
	public long getId() {
		return id;
	}

	public Forum getForum() {
		return forum;
	}
	
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

}