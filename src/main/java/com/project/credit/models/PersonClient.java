package com.project.credit.models;

public class PersonClient {
	
	private String id;
	private String name;
	private String lastName;
	private String dni;

	public PersonClient(String id, String name, String lastName, String dni) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
