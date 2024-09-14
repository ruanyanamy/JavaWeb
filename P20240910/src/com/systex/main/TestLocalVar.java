package com.systex.main;

public class TestLocalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i , j = 0;
			if (j==0) {
				i = 1;
			}else {
				i = 2;
			}
			
			System.out.println("i= "+i); //邏輯的不完整性(上方還有else的可能性>加上else或是把else if改成else就好[應該要這樣做才合理])
	}

}
