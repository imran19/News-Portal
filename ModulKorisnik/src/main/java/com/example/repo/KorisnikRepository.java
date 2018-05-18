package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.model.Korisnik;
 
public interface KorisnikRepository extends CrudRepository<Korisnik, Long>{
    List<Korisnik> findAll();
}