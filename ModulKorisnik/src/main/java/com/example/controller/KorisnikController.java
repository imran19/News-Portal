package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.model.Korisnik;
import com.example.repo.KorisnikRepository;
 
@RestController
public class KorisnikController {
    @Autowired
    KorisnikRepository repository;
       
    @RequestMapping("/save")
    public String process(){
        repository.save(new Korisnik("Edin", "Omic"));
        repository.save(new Korisnik("Adnad", "Kicin"));
        repository.save(new Korisnik("Adna", "Alic"));
        repository.save(new Korisnik("Berina", "Sahinovic"));
        
        return "Done";
    }
       
       
    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
           
        for(Korisnik cust : repository.findAll()){
            result += "<div>" + cust.toString() + "</div>";
        }
           
        return result + "</html>";
    }
       
    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findOne(id).toString();
        return result;
    }
       
    /*@RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
        String result = "<html>";
           
        for(Korisnik cust: repository.findByLastName(lastName)){
            result += "<div>" + cust.toString() + "</div>"; 
        }
           
        return result + "</html>";
    }*/
}
