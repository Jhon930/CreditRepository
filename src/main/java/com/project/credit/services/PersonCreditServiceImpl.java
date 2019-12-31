package com.project.credit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.credit.models.PersonCredit;
import com.project.credit.repository.PersonCreditRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonCreditServiceImpl implements PersonCreditService{
	
	@Autowired
	private PersonCreditRepository repository;
	
	@Autowired
	private WebClient client;
	

	@Override
	public Flux<PersonCredit> findAllCredits() {
		// TODO Auto-generated method stub
		/*return client.get().accept(MediaType.APPLICATION_JSON_UTF8)
						   .exchange()
						   .flatMapMany(response -> response.bodyToFlux(PersonCredit.class));*/
		return repository.findAll();
	}

	@Override
	public Mono<PersonCredit> findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<PersonCredit> createCredit(PersonCredit credit) {
		// TODO Auto-generated method stub
		return repository.save(credit);
	}

	@Override
	public Mono<PersonCredit> payCreditQuote(String id, PersonCredit personcredit) {
		// TODO Auto-generated method stub
		return repository.findById(id).flatMap(p -> {
			p.setLastQuote(p.getLastQuote()+1);
			p.setNumQuotes(p.getNumQuotes()-1);
			return repository.save(p);
		});
	}

}
