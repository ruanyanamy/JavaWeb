package com.systex.main;
import com.systex.model.*;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.name = "張友福";
		emp1.title = "經理";
		emp1.department = "IT";
		emp1.salary = 85000;

		System.out.println(emp1);    //快捷鍵sout -> System.out.println
	}

}
