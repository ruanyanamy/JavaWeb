package com.systex.hr.main;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String c = new String("Hello"); //物件生成在Heap裡面
		String d = new String("Hello"); //同上
		System.out.println(c==d);    	//記憶體位置不一樣
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		System.out.println("==================");
		StringBuilder sb = new StringBuilder("Hello");   //StringBuffer和StringBuilder的API完全一樣
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" World");
		System.out.println(sb);
		sb.append("How are you?");
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
	}

}
