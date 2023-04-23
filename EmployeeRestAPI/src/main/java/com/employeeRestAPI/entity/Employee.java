package com.employeeRestAPI.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String email;
	private String country;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Employee(int id, String name, int salary, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.country = country;
	}
	
	public Employee() {
		super();
	}
	
	
}
