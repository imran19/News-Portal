package com.example.repositories;

import java.util.List;

//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.models.Forum;


//@RepositoryRestResource(collectionResourceRel = "forum", path = "forum")
public interface ForumRepository extends CrudRepository<Forum, Long> {
 List<Forum> findAll();
}