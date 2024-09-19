package com.systex.util;

public class MyMath {
	public static double average(double... numbers) {  //其實可以接受傳進來的參數是double的相容型別,他會自己promote
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	}
}
