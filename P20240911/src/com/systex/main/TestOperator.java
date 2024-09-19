package com.systex.main;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 1;
		byte b = 1;
		//byte c = a + b;  //type mismatch , a and b > int
		byte c = (byte)(a + b);  //要轉型(promote)就可以了
		
		int age = 50;
		System.out.println(age*365L*24*60*60*1000);  //這個結果會超出int的範圍 , promote要盡早
		
		//運算是由左到右取值
		System.out.println(111+222+333);
		System.out.println("111"+222+333);
		System.out.println(111+"222"+333);
		System.out.println(111+222+"333");
		
		int x = 5;
		int y = 5;
		int z = 5;
		
		if ((++x < 10) | (++y < 10) | (++z < 10)) { //&&是短路型 , 假設第一個是false(&&)後面就不判斷了
			System.out.println("Bingo!");			//||是短路型 , 假設第一個是true(||)後面就不判斷了
		} 
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		
		if ((++x > 10) & (++y > 10) & (++z > 10)) { //&不是短路型 , 有flase還是會判斷下去
			System.out.println("Bingo!");		    //|不是短路型 , 有true還是會判斷下去
		} 
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
	}

}
