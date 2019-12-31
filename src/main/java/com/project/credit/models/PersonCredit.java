	package com.project.credit.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("personalcredits")
public class PersonCredit {
	
	@Id
	private String id;
	private BigDecimal capital;
	private BigDecimal quote;
	private int lastQuote;
	private int numQuotes;
	
	private PersonClient personClient;
	private String currency;
	
	public PersonCredit() {
		
	}
	
	public PersonCredit(String id, BigDecimal capital, BigDecimal quote, int lastQuote, int numQuotes,
			PersonClient personClient, String currency) {
		this.id = id;
		this.capital = capital;
		this.quote = quote;
		this.lastQuote = lastQuote;
		this.numQuotes = numQuotes;
		this.personClient = personClient;
		this.currency = currency;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getCapital() {
		return capital;
	}
	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}
	public BigDecimal getQuote() {
		return quote;
	}
	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}
	public int getLastQuote() {
		return lastQuote;
	}
	public void setLastQuote(int lastQuote) {
		this.lastQuote = lastQuote;
	}
	public int getNumQuotes() {
		return numQuotes;
	}
	public void setNumQuotes(int numQuotes) {
		this.numQuotes = numQuotes;
	}
	public PersonClient getPersonClient() {
		return personClient;
	}
	public void setPersonClient(PersonClient personClient) {
		this.personClient = personClient;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

}
