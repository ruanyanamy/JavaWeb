package com.systex.service;
import com.systex.model.*;

public class Pass {
	public void changeIntValue(int Value) {
		Value = 500;
	}
	
	public void changeObjectREference(MyDate ref) {
		ref = new MyDate(25,12,2015);
	}
	
	public void changeObjectValue(MyDate ref) {
		ref.setDay(30);
		ref.setMonth(10);
	}
}
