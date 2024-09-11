package com.systex.hr.model;

public class Secretary extends Employee {
	private String boss;
	
	public Secretary(String name, String telephone, String address, char gender, String boss) {
		super(name, telephone, address, gender);
		this.boss = boss;
	}

	public Secretary(String name, String telephone, String address, String boss) {
		super(name, telephone, address);
		this.boss = boss;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+"\t"+boss;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.2);
	}
	
	
}
