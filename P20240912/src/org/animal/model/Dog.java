package org.animal.model;

public class Dog implements Animal , Pet , Worker{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪...");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	public void bar() {   //如果繼承帶有相同的方法簽章，java會把這些方法視為抽象，所以子類別要實作(bar()在Pet和Worker裡面都有)
		System.out.println("bar() implementation in Dog");
	}
	
	
	
	
}
