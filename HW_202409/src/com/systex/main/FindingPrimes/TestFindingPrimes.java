package com.systex.main.FindingPrimes;

public class TestFindingPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		
		for (int i=2;i<=n;i++) {
			boolean isPrime = true;
			for (int j=2;j<i;j++) {
				if (i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}

}
