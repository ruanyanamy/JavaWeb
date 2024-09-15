package com.systex.main;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int group = Integer.parseInt(args[0]);
		String[] temp = args[1].split(" ");
		Set<Integer> notpickNumber = new TreeSet<>();
		Set<Integer> pickNumberGroup = new TreeSet<>();
		int num;

		for (String x : temp) {
			notpickNumber.add(Integer.parseInt(x));
		}
		
		System.out.println("=============================");
		System.out.println("您選的樂透組數: "+group);
		System.out.println("您的樂透不會包含的號碼: "+notpickNumber);
		
		for (int i=0;i<group;i++) {
			while(pickNumberGroup.size()<6) {
				num = (int)(Math.random()*49)+1;
				if (!notpickNumber.contains(num)) {
					pickNumberGroup.add(num);
				}
			}
			System.out.println("您的第"+(i+1)+"組樂透號碼: "+pickNumberGroup);
			pickNumberGroup.clear();
		}
		
		System.out.println("=============================");
	}

}
