package com.systex.main;

public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//粗糙的try-catch處理方式是大範圍的
		//try {
			int sum = 0;
			for (String number : args) {
				//這是較精緻的try-catch處理方式(小範圍)
				try {
					sum  += Integer.parseInt(number);
				}catch(NumberFormatException e) {
					System.out.println("參數["+number+"]不正確,所以未加總");
				}
			}
			System.out.println("總和 = "+sum);
		//}catch(NumberFormatException e) {  //錯誤報告要寫清楚
		//	System.out.println("您輸入的部分資料可能不正確喔...請您再檢查一下><");
		//}
		System.out.println("感謝您使用本程式!");
	}

}
