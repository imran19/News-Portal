package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forum {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String ime;
	
	protected Forum(){
	
	}
	
	public Forum(long id, String ime){
		this.id=id;
		this.ime=ime;
	}
	
	
	public long getId() {
		return id;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	


}