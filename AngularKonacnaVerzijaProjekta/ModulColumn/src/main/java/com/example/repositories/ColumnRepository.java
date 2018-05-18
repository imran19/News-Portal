/*package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.models.*;

@RepositoryRestResource(collectionResourceRel = "rubrika", path = "rubrika")
public interface RubrikaRepository extends PagingAndSortingRepository<Collumn, Long> {

	List<Collumn> findAll();

}
*/
package com.example.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Collumn;




@Repository
public interface ColumnRepository extends CrudRepository<Collumn, Long> {
	
	Collection<Collumn> findAll();

}

