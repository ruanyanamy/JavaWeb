package com.systex.model;

public class Scoping {
	public static int a;  //類別變數Class Variable(加上static)
	public        int b;  //成員變數(也稱為Member Variable、Attribute、Instance Variable、Field)
	
	public final int MYCOUNT = 100;  //常數(給值或是建構子來初始化|Compile-Time Constant)
	
	public void callMe(int c , int d) {
		
	}
	long g = 1234567890L;  //整數預設行別為int
	float h = 123.22f;    //浮點數預設型別為double
	
}
