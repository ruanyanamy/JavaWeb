package com.systex.hr.main;

import com.systex.hr.model.Account;
import static com.systex.hr.model.Account.*;
import static java.lang.Math.*;  //匯入Math的靜態成員

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		System.out.println(getInterestRate());  //因為line 4有匯入Account的靜態成員
		Account acct1 = new Account(100,500);
		System.out.println(getInterestRate());  //同line11
		Account acct2 = new Account(200,1000);
		System.out.println(getInterestRate());  //同line11
		
		setInterestRate(0.03);
		System.out.println(acct1.getInterestRate());
		System.out.println(acct2.getInterestRate());
		
		int r = 5;
		System.out.println(PI*pow(r, 2));  //Math.pow -> 數字,平方數
		long end = System.currentTimeMillis();
		System.out.println("Total process time = "+(end - start)+" ms.");
	}

}
