package com.systex.main;
import com.systex.model.MyDate;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d1 = new MyDate(11,9,2024);
		MyDate d2 = new MyDate(11,9,2024);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));  //MyDate有Override equals的method
	}

}
