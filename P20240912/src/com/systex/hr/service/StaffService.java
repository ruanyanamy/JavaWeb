package com.systex.hr.service;

import com.systex.hr.model.Employee;

public class StaffService {
	
	public void generateReport(Employee[] staff) {
		for (Employee e : staff) {
			System.out.println(e.getInfo());
		}
	}
	
	public int calAllSalary(Employee[] staff) {
		int allSalary = 0;
		for (Employee e : staff) {		 //Polymorphism
 			allSalary += e.getSalary();  //VMI
		}
		return allSalary;
	}
}
