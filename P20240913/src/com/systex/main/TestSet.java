package com.systex.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> fruits = new TreeSet<>();  //LinkedHashSet是有序的 , TreeSet是會排序的set(預設升冪)
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		System.out.println(fruits.descendingSet());
		
		//set沒有序沒有get
//		System.out.println("======================");
//		for (int i=0;i<fruits.size();i++) {
//			String fruit = (String)fruits.get(i);
//			System.out.println("Name: "+fruit+", Lenght: "+fruit.length());
//		}
		System.out.println("======================");
		//Iterator
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String fruit = it.next();
			System.out.println("Name: "+fruit+", Lenght: "+fruit.length());
		}
		System.out.println("======================");
		//for each
		for (String fruit :fruits) {    //for each搭配泛型比較方便
			System.out.println("Name: "+fruit+", Lenght: "+fruit.length());
		}
		System.out.println("======================");
		//lambda語法
		fruits.forEach(fruit->System.out.println("Name: "+fruit+", Lenght: "+fruit.length()));
	}

}
