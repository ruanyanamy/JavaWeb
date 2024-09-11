package com.systex.main;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Year = Integer.parseInt(args[0]);
		int Month = Integer.parseInt(args[1]);
		
		switch(Month) {
			default :
				System.out.println("只有12個月");
				break;
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println("有31天");
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				System.out.println("有30天");
				break;
			case 2 :
				if ((Year%4 == 0) & (Year%100 != 0) | (Year%400 == 0) ) {
					System.out.println("有29天"); 
				}
				else {
					System.out.println("有28天");
				}
		}
	}

}
