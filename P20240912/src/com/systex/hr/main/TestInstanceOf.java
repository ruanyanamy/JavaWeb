package com.systex.hr.main;

import com.systex.hr.model.*;

public class TestInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		System.out.println(e instanceof Employee);  // -> true
		System.out.println(e instanceof Manager);   // -> false
		System.out.println(e instanceof Director);  // -> false
		System.out.println("========================");
		//相容型別的測試
		System.out.println(m instanceof Object);   // -> true
		System.out.println(m instanceof Employee); // -> true
		System.out.println(m instanceof Manager);  // -> true
		System.out.println(m instanceof Director); // -> false
		System.out.println("========================");
		System.out.println(d instanceof Employee); // -> true
		System.out.println(d instanceof Manager);  // -> true
		System.out.println(d instanceof Director); // -> true
		
		doStaff(d);
	}
	
	//判斷型別有繼承關係要先判斷子類別再判斷父類別
	public static void doStaff(Employee e) {
		if (e instanceof Manager) {   //應該要改成 e instanceof Director
			//這裡就被比對到了 , 就不會跑到下面的Director
			System.out.println("This employee is a manager");
		}else if (e instanceof Director) {  //應該要改成 e instanceof Manager
			System.out.println("This employee is a director");
			
		}
	}

}
