/*package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.models.*;

@RepositoryRestResource(collectionResourceRel = "rubrika", path = "rubrika")
public interface RubrikaRepository extends PagingAndSortingRepository<Rubrika, Long> {

	List<Rubrika> findAll();

}
*/
package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.models.Rubrika;
 
public interface RubrikaRepository extends CrudRepository<Rubrika, Long>{
    List<Rubrika> findAll();
}
