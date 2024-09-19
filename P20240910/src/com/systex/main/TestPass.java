package com.systex.main;
import com.systex.service.Pass;
import com.systex.model.MyDate;

public class TestPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		Pass p = new Pass();
		p.changeIntValue(a);
		System.out.println("a= "+a);
		MyDate d = new MyDate(24,8,2015);
		p.changeObjectREference(d);
		System.out.println("d= "+d);
		p.changeObjectValue(d);
		System.out.println("d= "+d);
	}

}
