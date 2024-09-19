package com.systex.hr.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int group = Integer.parseInt(args[0]);
		String[] temp = args[1].split(" ");
		List<Integer> notpickNumber = new ArrayList<>();
		int num;

		for (String x : temp) {
			notpickNumber.add(Integer.parseInt(x));
		}
		
		System.out.println("您的樂透組數: "+group);
		System.out.println("您的樂透不會包含的號碼: "+notpickNumber);
		
		Set<Integer> pickNumberGroup = new HashSet<>();
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
	}

}
