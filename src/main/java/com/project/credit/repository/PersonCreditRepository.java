package com.project.credit.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.project.credit.models.PersonCredit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonCreditRepository  extends ReactiveMongoRepository<PersonCredit, String>{

	 @Query(value="{'client.dni': ?0}")	
	 Flux<PersonCredit> findByClientDni(String dni); 
	 
}
	
	

