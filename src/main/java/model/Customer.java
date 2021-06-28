package model;

import java.util.List;

public class Customer {

	private Long id;
	private String name;
	private String surname;
	private String email;
	private String phoneNr;
	private String address;
	private List<Customer> customers;

	public Customer() {

	}
	
	
	public Customer(Long id, String name, String surname, String email, String phoneNr, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNr = phoneNr;
		this.address = address;
	}
	
	public void listAdd(Long id, String name, String surname, String email, String phoneNr, String address) {
		customers.add(new Customer(id, name, surname, email, phoneNr, address));
	}
	
	public void listRemove(Long id) {
		customers.remove(id);
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}