package com.systex.main;

public class TryMultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer:
		for (int i = 1;i <= 9;i++) {
			Inner:
			for (int j = 1; j<= 9;j++) {
				System.out.print(i+"*"+j+"="+(i*j<10?" ":"")+i*j+" ");
				if (i==j) {
					System.out.println();
					continue Outer;
				}
			}
			System.out.println();
		}
	}

}
