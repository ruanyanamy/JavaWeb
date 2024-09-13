package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();    //沒有泛型可以加入各種類型的資料
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Cherry");       //重複仍然會加入
		fruits.add("Strawberry");
		fruits.add("Pineapple");    //同Cherry
		fruits.add("Cherry");
		
		System.out.println(fruits);
		Collections.sort(fruits);   //List要排序 -> Collections.sort
		System.out.println(fruits);
		System.out.println("======================");
		for (int i=0;i<fruits.size();i++) {
			String fruit = fruits.get(i);
			System.out.println("Name: "+fruit+", Lenght: "+fruit.length());
		}
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
