package com.systex.main;

public class TestPrintLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = Integer.parseInt(args[0]);
		
		//Loop 1
		System.out.println("Loop 1");
		for (int i=0;i<len;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Loop 2
		System.out.println("Loop 2");
		for (int i=0;i<len;i++) {
			for (int j=len-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Loop 3
		System.out.println("Loop 3");
		for (int i=len;i>0;i--) {
			for (int j=1;j<=len;j++) {
				if (j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Loop 4
		System.out.println("Loop 4");
		int l1 = 0;
		for (int i=0;i<len;i++) {          
			for (int j=i+1;j<len;j++) {     
				System.out.print(" ");
			}
			for (int k=0;k<=l1;k++) {    
				System.out.print("*");
			}
			l1 += 2;
			System.out.println();
		}
		
		//Loop 5
		System.out.println("Loop 5");
		for (int i=0;i<len;i++) {
			for (int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for (int j=len-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Loop 6
		System.out.println("Loop 6");
		int l2 = 2*len-1;
		for (int i=0;i<len;i++) {
			for (int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<l2;j++) {
				System.out.print("*");
			}
			l2 -= 2;
			System.out.println();
		}
		
		//Loop 7
		System.out.println("Loop 7");
		int l3 = 0 , l4 = 2*len-1;
		for (int i=0;i<len-1;i++) {          
			for (int j=i;j<len-1;j++) {     
				System.out.print(" ");
			}
			for (int k=0;k<=l3;k++) {    
				System.out.print("*");
			}
			l3 += 2;
			System.out.println();
		}
		for (int i=0;i<len;i++) {
			for (int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<l4;j++) {
				System.out.print("*");
			}
			l4 -= 2;
			System.out.println();
		}
	}

}
