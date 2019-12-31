package com.project.credit.services;

import com.project.credit.models.PersonCredit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonCreditService {

	public Flux<PersonCredit> findAllCredits();
	
	public Mono<PersonCredit> findById(String id);
	
	public Mono<PersonCredit> createCredit(PersonCredit credit);
	
	public Mono<PersonCredit> payCreditQuote(String id, PersonCredit personcredit);
	
	
	
	
	
}
