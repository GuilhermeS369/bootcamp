package com.alice.bcamp.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alice.bcamp.entities.Bcamp;
import com.alice.bcamp.entities.Curso;

@RestController
@RequestMapping(value ="/curso")
public class CursoResource {
	
	@GetMapping
	public ResponseEntity<Curso> find(){
		Curso curso = new Curso("Curso Java","Descrição ficticia", 8);
		return ResponseEntity.ok().body(curso);
	}
}
