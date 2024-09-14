package com.systex.xxx;

public class A {       //如果不宣告public就會變成default , 這時候C和D就會被受影響 , 因為它不在同一個package裡面 -> 套件的封裝
	public int foo = 100;
	
	public void play() {    //default預設的存取控制 , protected可以給其他套件的子類別 , public可以給所有存取控制
		System.out.println("play() in class A");
	}
	
	public void methodA() {
		System.out.println(foo);
		play();
	}
	
}
