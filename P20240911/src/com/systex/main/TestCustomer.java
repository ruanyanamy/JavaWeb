package com.systex.main;
import java.util.GregorianCalendar;

import com.systex.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("A123456789","王大同","台北市大同區"
					  ,new GregorianCalendar(2008, 9, 11).getTime(),
					  'M',false,"wangdd@gmail.com");
		System.out.println(c1);
		
		Customer c2 = new Customer("A125456788","王小美","台北市松山區"
				  ,new GregorianCalendar(2025, 5, 18).getTime(),
				  'G',false,"pretty@gmail.com");
		System.out.println(c2);
	}

}
