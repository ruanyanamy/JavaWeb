package com.systex.main.FindingPrimes;

public class TestFindingPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int count = 0;
		
		for (int i=2;i<=n;i++) {
			boolean x = true;
			for (int j=2;j<i;j++) {
				if (i%j==0) {
					x = false;
					break;
				}
			}
			if(x) {
				count += 1;
				System.out.println(i);
			}
		}
		System.out.println("小於"+n+"的質數有"+count+"個");
	}

}
