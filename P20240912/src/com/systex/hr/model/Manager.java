package com.systex.hr.model;

public class Manager extends Employee {
	private String department;
	
	public Manager() {
		super();
	}

	public Manager(String name, String telephone, String address, char gender, String department) {
		super(name, telephone, address, gender);
		this.department = department;
	}

	public Manager(String name, String telephone, String address, String department) {
		super(name, telephone, address);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+department;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*3)+5000;
	}
	
	
}
