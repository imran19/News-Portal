package com.example.repositories;

import java.util.List;

//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.models.Forum;
import com.example.models.Tema;


//@RepositoryRestResource(collectionResourceRel = "tema", path = "tema")
public interface TemaRepository extends CrudRepository<Tema, Long> {
	List<Tema> findAll();
}