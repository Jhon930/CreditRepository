package com.project.credit.models;

public class Client {
	
	private String id;
	private String name;
	private String lastName;
	private String dni;
	private String address;
	private String phoneNumber;
	private String clientType;

	public Client(String id, String name, String lastName, String dni, String address, String phoneNumber,
		String clientType) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.clientType = clientType;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
	
	

}
