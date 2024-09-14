package com.systex.hr.model;

public class Employee {
	private String name;
	private String telephone;
	private String address;
	private char gender;
	
	private static final int BASE_SALARY = 35000;

	public Employee() {
		super();
	}

	public Employee(String name, String telephone, String address) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}

	public Employee(String name, String telephone, String address, char gender) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getInfo() {
		return name+"\t"+telephone+"\t"+address+"\t"+gender;
	}
	
	public int getSalary() {
		return BASE_SALARY;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
