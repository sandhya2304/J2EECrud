package com.sandy.model;

public class Employee
{
	
    private Long id;
    private String name;
    private String address;
    private String country;
    
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String name, String address, String country) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.country = country;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
    
    
	
	
}
