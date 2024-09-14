package com.systex.main;

import com.systex.model.MyDate;

public class TestPassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = a;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("==============");
		b = 200;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("-----------------");
		
		MyDate d1 = new MyDate(10,9,2024);
		MyDate d2 = d1;
		System.out.println("d1= "+d1);
		System.out.println("d2= "+d2);
		System.out.println("==============");
		d2.setDay(25);
		d1.setMonth(12);
		System.out.println("d1= "+d1);
		System.out.println("d2= "+d2);
		System.out.println("==============");
		d2 = new MyDate(30,10,2024);
		System.out.println("d1= "+d1);
		System.out.println("d2= "+d2);
		System.out.println("==============");
	}

}
