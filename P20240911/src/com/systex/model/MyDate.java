package com.systex.model;

import java.util.Objects;

public class MyDate {
	private int Day;
	private int Month;
	private int Year;
	
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
	
}
