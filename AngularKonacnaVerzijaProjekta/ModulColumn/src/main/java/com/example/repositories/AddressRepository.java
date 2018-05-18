package com.example.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Address;


 
/*public interface NovostRepository extends JpaRepository<Novost, Long>{
    List<Novost> findAll();
   /* @Query("SELECT r.rubrika_ime FROM Collumn r WHERE r.rubrika_novost.novostId = ?1")
    String findRubrikaByNovostId(Long novostId);
}*/
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
	
	Collection<Address> findAll();

}
