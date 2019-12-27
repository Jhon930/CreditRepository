package com.project.credit.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.project.credit.models.Credit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository  extends ReactiveMongoRepository<Credit, String>{

	 @Query(value="{'client.dni': ?0}")	
	 Flux<Credit> findByClientDni(String dni); 
	 
}
	
	

