package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "korisnik")
public class Korisnik implements Serializable {
 
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "ime")
    private String ime;
 
    @Column(name = "prezime")
    private String prezime;
 
    public Korisnik() {
    }
    public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
 
    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
 
    @Override
    public String toString() {
        return String.format("Korisnik[id=%d, ime='%s', prezime='%s']", id, ime, prezime);
    }
}
