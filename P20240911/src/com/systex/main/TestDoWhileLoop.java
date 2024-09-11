package com.systex.main;

public class TestDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		do {
			System.out.println("Loop "+i);
			i++;
		}while(i<0);                  //迴圈無論如何都會執行一次
		System.out.println("i= "+i);
	}

}
