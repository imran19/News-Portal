package com.example.controllers;

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


@RestController
@RequestMapping("/addresses")
public class AddressController {

	@Autowired
	private AddressRepository addressRepo;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Address>> getAddresses() {
		return new ResponseEntity<>(addressRepo.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Address> getAddress(@PathVariable long id) {
		Address address = addressRepo.findOne(id);

		if (address != null) {
			return new ResponseEntity<>(addressRepo.findOne(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addAddress(@RequestBody Address address) {
		return new ResponseEntity<>(addressRepo.save(address), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteAddress(@PathVariable long id) {
		addressRepo.delete(id);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
}
