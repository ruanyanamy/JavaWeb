package com.systex.main;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int carModel = Integer.parseInt(args[0]);
		
		switch(carModel) {
			case 1 : 
				System.out.println("開天窗");
			case 2 :
				System.out.println("加空調");
			case 3 : 
				System.out.println("加音響");
			default : 
				System.out.println("加輪子");
				System.out.println("加引擎");
		}
	}

}
