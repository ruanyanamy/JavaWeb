package com.systex.main;

import java.util.Arrays;

import com.systex.util.MyMath;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = {"Gary" , "Patty" , "Mary" , "Kevin" , "Louis"};
		int[] grades;
		grades = new int[] {98,88,75,66,100};  //先宣告後指派 -> new int[]不能省略
		
		System.out.println(Arrays.toString(friends));  //一維陣列 -> toString , 多維陣列 -> deepToString
		System.out.println(Arrays.toString(grades));
		System.out.println("==================");
		
		for (int i=0;i<friends.length;i++) {
			System.out.println(friends[i]);
		}
		System.out.println("==================");
		for (String friend : friends) {
			System.out.println(friend);
		}
		System.out.println("==================");
		
		int[][] numbers = {
				{99,98,95,88,79},
				{33,56,12,77},
				{88,99,70},
				{100,99,98,97,96,95},
				{88,56,44,79,12}
		};
		System.out.println(Arrays.deepToString(numbers));  //多維陣列print出裡面的內容 -> Arrays.deepToString
		
		System.out.println("--------- for ----------");
		for (int i=0;i<numbers.length;i++) {
			double avg = 0.0;
			for (int j=0;j<numbers[i].length;j++) {
				avg += numbers[i][j];
			}
			System.out.println(avg/numbers[i].length);
		}
		System.out.println("---------for each----------");
		for (int[] num1 : numbers) {
			double avg = 0.0;
			for (int num2 : num1) {
				avg += num2;
			}
			System.out.println(avg/num1.length);
		}
		
		String[] name = {"Gary" , "Patty" , "Mary" , "Kevin" , "Louis"};
		String[] newNames = {"a","b","c","d","e","f","g","h","i","j"};
		System.arraycopy(name, 0, newNames, 3, name.length);
		name = newNames;
		System.out.println(Arrays.toString(name));
		
		System.out.println("===========================");
		System.out.println(MyMath.average(1,2,3,4,5));
		System.out.println(MyMath.average(1,2,3,4,5,6,7,8,9,10));
		System.out.println(MyMath.average(1,2,3,4,5,12.345,'A'));
		System.out.println(MyMath.average());  //NaN(Not a Number) -> 0.0/0 and 0/0.0
	}

}
