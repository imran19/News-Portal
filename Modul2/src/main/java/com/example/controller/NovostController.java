package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.model.Novost;
import com.example.repo.NovostRepository;
 
@RestController
public class NovostController {
    @Autowired
    NovostRepository repository;
       
    @RequestMapping("/save")
    public String process(){
        repository.save(new Novost("Jazz Fest", "Ovih dana..."));
        repository.save(new Novost("Licin", "Lijek protiv tahikardije.."));
        repository.save(new Novost("Panasonic", "Nova serija aparata.."));
        repository.save(new Novost("Samsung", "Novi galaxy model.."));
        repository.save(new Novost("KRKA", "Farmaceutska firma.."));
        return "Done";
    }
       
       
    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
           
        for(Novost cust : repository.findAll()){
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
           
        for(Novost cust: repository.findByLastName(lastName)){
            result += "<div>" + cust.toString() + "</div>"; 
        }
           
        return result + "</html>";
    }*/
}
