package com.systex.main.Fibonacci;

public class TestFindingFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int n1 = 0 , n2 = 1 , count = 2;
		System.out.print(n1+","+n2);
		
		//0,1,1,2,3,5,8,13,21...
		for (int i=1;i<n;i++) {
			if (i == n1+n2) {
				System.out.print(","+i);
				n1 = n2;
				n2 = i;
				count += 1;
			}
		}
		System.out.println();
		System.out.println("小於"+n+"的Fibonacci數有"+count+"個");
	}

}
