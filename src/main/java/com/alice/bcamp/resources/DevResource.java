package com.alice.bcamp.resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alice.bcamp.entities.Bcamp;
import com.alice.bcamp.entities.Curso;
import com.alice.bcamp.entities.Dev;
import com.alice.bcamp.entities.Mentoria;

@RestController
@RequestMapping(value ="/dev")
public class DevResource {
	
	@GetMapping
	public ResponseEntity<Dev> find(){
		Curso curso = new Curso("Curso Java","Descrição fictícia", 8);
		
		Mentoria mentoria = new Mentoria("Mentoria de java", "Descrição fictícia", LocalDate.now());
		
		Bcamp bootcamp = new Bcamp();
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	    bootcamp.getConteudos().add(curso);
	    bootcamp.getConteudos().add(mentoria);
	    
	    Dev dev = new Dev();
	    dev.setNome("Luiz");
	    dev.inscreverBootcamp(bootcamp);
	    dev.progredir();
        dev.progredir();
	    
		return ResponseEntity.ok().body(dev);
	}
}
