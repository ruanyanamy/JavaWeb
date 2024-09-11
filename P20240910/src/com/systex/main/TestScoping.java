package com.systex.main;

import com.systex.model.Scoping;

public class TestScoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Scoping.a);
			Scoping s1 = new Scoping();
			System.out.println(s1.b);
			Scoping s2 = new Scoping();
			System.out.println(s2.b);
			s2.b = 100;              //獨立的記憶體空間不會去影響s1
			System.out.println(s2.b); 
	}

}
