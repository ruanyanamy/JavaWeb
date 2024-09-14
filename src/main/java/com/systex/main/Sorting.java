package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MyDate> DateGroup = new ArrayList<>();
		boolean isReverse = Boolean.parseBoolean(args[0]);		
		System.out.println("是否要倒序排日期? "+isReverse);
		
		DateGroup.add(new MyDate(5,9,2024));
		DateGroup.add(new MyDate(12,9,2024));
		DateGroup.add(new MyDate(10,8,2010));
		DateGroup.add(new MyDate(25,8,2010));
		DateGroup.add(new MyDate(1,9,2021));
		DateGroup.add(new MyDate(20,4,2026));
		DateGroup.add(new MyDate(16,1,2022));
		DateGroup.add(new MyDate(16,1,2023));
		
		System.out.println("============================");
		if (isReverse) {
			System.out.println("最新到最舊");
			Collections.sort(DateGroup , MyDate.WHOLE_COMP.reversed());
			DateGroup.forEach(d->System.out.println(d));
		}else {
			System.out.println("最舊到最新");
			Collections.sort(DateGroup , MyDate.WHOLE_COMP);
			DateGroup.forEach(d->System.out.println(d));
		}
		System.out.println("============================");
	}

}
