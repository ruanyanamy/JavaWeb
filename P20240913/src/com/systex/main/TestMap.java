package com.systex.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String> fruits = new TreeMap<>();
		//LinkedHashMap會記住put進去的先後順序
		//TreeMap -> 排序
		
//		fruits.put(7,"Guava");
//		fruits.put(2,"Lemon");
//		fruits.put(4,"Watermelon");
//		fruits.put(1,"Pineapple");
//		fruits.put(6,"Coconut");
//		fruits.put(5,"Cherry");
//		fruits.put(3,"Strawberry");
		
		fruits.put("seven","Guava");
		fruits.put("two","Lemon");
		fruits.put("four","Watermelon");
		fruits.put("one","Pineapple");
		fruits.put("six","Coconut");
		fruits.put("five","Cherry");
		fruits.put("three","Strawberry");
		
		System.out.println(fruits);   //如果key是整數,跑出來的結果剛好會是排序的(純屬巧合!!)
		
//		fruits.put("six","Banana");
//		System.out.println(fruits);
		
		System.out.println("\n===========keyset==========");
		Set<String> keys = fruits.keySet();  //取得他所有的key
		for (String key : keys) {
			String value = fruits.get(key);
			System.out.println("key = "+key+", value = "+value+", length = "+value.length());
		}
		System.out.println("\n===========entry===========");
		for (Map.Entry<String, String> entry : fruits.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = "+key+", value = "+value+", length = "+value.length());
		}
		System.out.println("\n===========lambda==========");
		fruits.forEach((key , value)->System.out.println("key = "+key+", value = "+value+", length = "+value.length()));
	}

}
