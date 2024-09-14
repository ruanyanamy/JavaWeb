package com.systex.model;

import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
	private int Day;
	private int Month;
	private int Year;
	
	//Anonymous Nested Class匿名的巢狀類別
	//比較子由他們來提供(?
	public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {	
		@Override
		public int compare(MyDate o1, MyDate o2) {
			// TODO Auto-generated method stub
			if (o1.getMonth()>o2.getMonth()) {
				return 1;
			}else if (o1.getMonth()<o2.getMonth()) {
				return -1;
			}else {
				return 0;
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
	;
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
		return "MyDate [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Day, Month, Year);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;  //參考型別的轉型 > 目的是為了要恢復該物件的完整功能
		return Day == other.Day && Month == other.Month && Year == other.Year;
	}
	
	@Override
	public int compareTo(MyDate o) {
		// TODO Auto-generated method stub
		if (this.Year > o.Year) {
			return 1;
		}else if (this.Year < o.Year) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
