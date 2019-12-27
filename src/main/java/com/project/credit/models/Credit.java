package com.project.credit.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("credits")
public class Credit {
	
	@Id
	private String id;
	private BigDecimal capital;
	private BigDecimal quote;
	private String lastQuote;
	private int numQuotes;
	
	private Client client;
	private BigDecimal amount;
	
	public Credit() {
		
	}
	
	public Credit(String id, BigDecimal capital, BigDecimal quote, String lastQuote, int numQuotes,
			Client client, BigDecimal amount) {
		this.id = id;
		this.capital = capital;
		this.quote = quote;
		this.lastQuote = lastQuote;
		this.numQuotes = numQuotes;
		this.client = client;
		this.amount = amount;
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
	public String getLastQuote() {
		return lastQuote;
	}
	public void setLastQuote(String lastQuote) {
		this.lastQuote = lastQuote;
	}
	public int getNumQuotes() {
		return numQuotes;
	}
	public void setNumQuotes(int numQuotes) {
		this.numQuotes = numQuotes;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
}
