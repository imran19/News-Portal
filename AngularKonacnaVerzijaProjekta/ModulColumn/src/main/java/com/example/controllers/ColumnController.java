package com.example.controllers;

/*import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.*;
@RestController
public class RubrikaKontroler{
	private static  final String template="Ime rubrike, %s";
	private final AtomicLong counter=new AtomicLong();
	
	@RequestMapping("/rubrikaN")
	public Collumn rubrika(@RequestParam(value="name", defaultValue="rubrika")String name){
		return new Collumn(counter.incrementAndGet(), String.format(template, name));
	}
}*/
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Address;
import com.example.models.Collumn;
import com.example.repositories.AddressRepository;
import com.example.repositories.ColumnRepository;

@RestController
@RequestMapping("/columns")
public class ColumnController {

	@Autowired
	private ColumnRepository columnRepo;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Collumn>> getColumns() {
		return new ResponseEntity<>(columnRepo.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Collumn> getColumn(@PathVariable long id) {
		Collumn collumn = columnRepo.findOne(id);

		if (collumn != null) {
			return new ResponseEntity<>(columnRepo.findOne(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addColumn(@RequestBody Collumn collumn) {
		return new ResponseEntity<>(columnRepo.save(collumn), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteColumn(@PathVariable long id) {
		columnRepo.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}/addresses", method = RequestMethod.GET)
	public ResponseEntity<Collection<Address>> getColumnNews(@PathVariable long id) {
		Collumn collumn = columnRepo.findOne(id);

		if (collumn != null) {
			return new ResponseEntity<>(collumn.getAddresses(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	
	
}
