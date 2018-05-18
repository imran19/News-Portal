package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.model.Novost;
 
public interface NovostRepository extends CrudRepository<Novost, Long>{
    List<Novost> findAll();
}