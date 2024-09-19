package com.systex.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer {
	private String id;
	private String name;
	private String address;
	private Date birthDate;
	private char gender;
	private boolean married;
	private String email;
	
	public Customer() {
		//super();
	}
	
	public Customer(String id, String name) {
		//super();
		this(id , name , "");
	}
	
	public Customer(String id, String name, String address) {
		//super();
		this(id , name , address , new GregorianCalendar(2010, 0, 1).getTime() , 'U' , false , "");
	}
	
	public Customer(String id, String name, String address, Date birthDate, char gender, boolean married,
			String email) {
		//super();
		this.setId(id);
		this.setName(name);
		this.setAddress(address);
		this.setBirthDate(birthDate);
		this.setGender(gender);
		this.setMarried(married);
		this.setEmail(email);
	}
	
	public boolean checkId(String id) {   //驗證身份證字號
		return true;
	}
	
	public String getId() {
		return id;
	}
	
	public final void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public final void setAddress(String address) {
		this.address = address;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public final void setBirthDate(Date birthDate) {
		//生日要小於今天
		if (birthDate.before(new GregorianCalendar().getTime())) {
			this.birthDate = birthDate;
		}else {
			this.birthDate = new GregorianCalendar(2010, 0, 1).getTime();
		}
	}
	//new GregorianCalendar().getTime() > 今天的日期
	
	//Overloading
	public final void setBirthDate(String sDate) {
		try {  //怕parse出問題所以用try catch
			Date birth = SimpleDateFormat.getDateInstance().parse(sDate);
			this.setBirthDate(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public final void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}else {
			this.gender = 'U';
		}
	}
	
	public boolean isMarried() {
		return married;
	}
	
	public final void setMarried(boolean married) {
		this.married = married;
	}
	
	public String getEmail() {
		return email;
	}
	
	public final void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", married=" + married + ", email=" + email + "]";
	}
	
	
}
