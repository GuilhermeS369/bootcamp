package com.alice.bcamp.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alice.bcamp.entities.Bcamp;

@RestController
@RequestMapping(value ="/bootcamp")
public class BcampResource {
	
	@GetMapping
	public ResponseEntity<Bcamp> findAll(){
		Bcamp bootcamp = new Bcamp("Spring","Um bootcamp do framework Spring",null,null);
		return ResponseEntity.ok().body(bootcamp);
	}
}
