package com.systex.hr.model;

public class Account {
	private static double interestRate;  //讓所有的物件去共用同一個資料 -> static
	private int balance;
	private final int MYCOUNT; //blank final instance variable(空白final實體變數)
	private static final int MYCONST2;
	
	static {      //有點像是類別的建構子(class constructor)幫類別的屬性初始化
		System.out.println("Hello static block...");
		//可能從資料庫讀取資料
		//可能從檔案讀取資料
		//bla bla bla...
		//
		//
		interestRate = 0.02;
		MYCONST2 = 500;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) { //static
		if (interestRate >= 0) {
			Account.interestRate = interestRate;
		}else {
			Account.interestRate = 0;
		}	
	}

	public Account(int balance , int x) {    //object constructor 一般是幫物件的成員初始化
		this.balance = balance;
		this.MYCOUNT = x;                    //建立不同Account可以設定不同常數值(這個常數稱為runtime時期的常數)
											 //透過建構子來指派常數
	}
	
	public int getBalance() {
		final int LOCAL_CONST;     //final區域變數
		LOCAL_CONST = 300;
		//LOCAL_CONST = 500;   //final指派之後就不能再改值
		System.out.println(LOCAL_CONST);
		return this.balance;
	}
	
	public void deposit(int amt) {
		this.balance += amt;
	}
	
	public void withdraw(int amt) {
		this.balance -= amt;
	}
}
