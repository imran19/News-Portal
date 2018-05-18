package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

@Entity
public class Komentar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//@ManyToOne
	//private Korisnik korisnik;
	
	@ManyToOne
	private Tema tema;
	
	private String komentar;
	private Date datumObjave;
	
	protected Komentar(){
	
	}
	
	public Komentar(long id, Tema tema, String komentar, Date datumObjave){
		this.id=id;
		this.tema=tema;
		this.komentar=komentar;
		this.datumObjave=datumObjave;
	}
	
	public long getId() {
		return id;
	}
	
	//public Korisnik getKorisnik() {
	//	return korisnik;
	//}
	
	//public void setKorisnik(Korisnik korisnik) {
	//	this.korisnik = korisnik;
	//}
	
	public Tema getTema() {
		return tema;
	}
	
	public void setTema(Tema tema) {
		this.tema = tema;
	}


	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}
	
	/*public Date getDatumObjave(){
		return datumObjave;
	}
	
	public void setDatumObjave(Date datumObjave) {
		this.datumObjave = datumObjave;
	}
	*/

	
}