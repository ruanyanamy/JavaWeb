package com.systex.main;

import java.util.Objects;
import java.util.Comparator;

public class MyDate {
	private int Day;
	private int Month;
	private int Year;
	
	public static final Comparator<MyDate> WHOLE_COMP = new Comparator<MyDate>() {
		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if (o1.getYear() > o2.getYear()) {
				return 1;
			}else if (o1.getYear() < o2.getYear()) {
				return -1;
			}else {
				return MONTH_COMP.compare(o1 , o2);
			}		
		}
	};
	
	public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {	
		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if (o1.getMonth()>o2.getMonth()) {
				return 1;
			}else if (o1.getMonth()<o2.getMonth()) {
				return -1;
			}else {
				return DAY_COMP.compare(o1, o2);
			}
		}
	};
	
	
	public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {		
		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if (o1.getDay() > o2.getDay()) {
				return 1;
			}else if (o1.getDay() < o2.getDay()) {
				return -1;
			}else {
				return 0;
			}
		}
	};
	
	public MyDate() {
		super();
	}
	public MyDate(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
	@Override
	public String toString() {
		return "MyDate: "+Year+" / "+Month+" / "+Day;
	}
	
}