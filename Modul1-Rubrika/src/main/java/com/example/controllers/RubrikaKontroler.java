package com.example.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.*;
@RestController
public class RubrikaKontroler{
	private static  final String template="Ime rubrike, %s";
	private final AtomicLong counter=new AtomicLong();
	
	@RequestMapping("/rubrikaN")
	public Rubrika rubrika(@RequestParam(value="name", defaultValue="rubrika")String name){
		return new Rubrika(counter.incrementAndGet(), String.format(template, name));
	}
}