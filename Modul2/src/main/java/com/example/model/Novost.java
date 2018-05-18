package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "novost")
public class Novost implements Serializable {
 
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "naslov")
    private String naslov;
 
    @Column(name = "tekst")
    private String tekst;
 
    public Novost() {
    }
    public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
    public Novost(String naslov, String tekst) {
        this.naslov = naslov;
        this.tekst = tekst;
    }
 
    @Override
    public String toString() {
        return String.format("Novost[id=%d, naslov='%s', tekst='%s']", id, naslov, tekst);
    }
}
