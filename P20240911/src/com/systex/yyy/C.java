package com.systex.yyy;
import com.systex.xxx.A;

public class C extends A{
	
	public void methodC() {
		//A a = new A(); C已經繼承A所以不用再宣告物件 , A是C的父類別
		System.out.println(foo);
		play();
	}
}
