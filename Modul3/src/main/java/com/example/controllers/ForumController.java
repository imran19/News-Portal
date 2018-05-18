package com.example.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Komentar;
import com.example.repositories.KomentarRepository;

@RestController
@RequestMapping("forum")
public class ForumController {
	
	@Autowired
	KomentarRepository kr;
	
	private static final String template = "Autor ovog komentara je, %s";
	private final AtomicLong counter=new AtomicLong();
	
	/*@RequestMapping("/findbyid")
	public String fetchDataById(@RequestParam("id")long id){
		String result="<html>";
		for(Komentar kom: KomentarRepository.findById(id)){
			result +="<div>"+kom.toString() + "</div>";
		}
		return result+"</html";
	}*/
	
/*	@RequestMapping("/autor")
	public Komentar autor(@RequestParam(value="name", defaultValue="Someone")String name){
		return new Komentar(counter.incrementAndGet(), String.format(template, name));
	}*/
	
	/*@RequestMapping("/login")
	public String login(@RequestBody KorisnikLoginBody login) throws ServletException{
		
		Korisnik korisnik=kr.findUserByUsername(login.username);
		
		if(!checkPassword(login.password, korisnik.getPassword())) throw new ServletException("Netacna pristupna sifra");
		else return "some token";
	}
	
	
	@SuppressWarnings("unused")
	private static class KorisnikLoginBody{
		public String username;
		public String password;
	}*/
}
