package com.project.credit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.credit.models.PersonCredit;
import com.project.credit.services.PersonCreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonCreditController {
	
	@Autowired
	private PersonCreditService service;
	
	@GetMapping
	public Flux<PersonCredit> findAllCredits(){
		
		return service.findAllCredits();
		
	}
	
	@GetMapping("/credit/{id}")
	public Mono<PersonCredit> findById(@PathVariable("id") String id) {
		
		return service.findById(id);
	}
	
	@PostMapping("/createcredit")
	public Mono<PersonCredit> createPersonCredit(@RequestBody PersonCredit personcredit){
			
		return service.createCredit(personcredit);
		
	}
	
	@PutMapping("/credit/{id}/pay")
	public Mono<PersonCredit> payCreditQuote(@PathVariable String id, @RequestBody PersonCredit personcredit){
		
		return service.payCreditQuote(id, personcredit);
		
	}
	

}
