package com.systex.hr.model;

public class Accountant extends Employee {
	private String accountName;
	
	public Accountant(String name, String telephone, String address, char gender, String accountName) {
		super(name, telephone, address, gender);
		this.accountName = accountName;
	}

	public Accountant(String name, String telephone, String address, String accountName) {
		super(name, telephone, address);
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+accountName;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.2);
	}
	
	
}
