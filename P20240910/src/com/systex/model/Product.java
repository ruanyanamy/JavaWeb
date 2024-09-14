package com.systex.model;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;
	
	//Default Constructor預設建構子
    public Product() {
		super();
	}
	
    //Overloading
	public Product(int id, String name) {
		//int a = 100;不能出現這行程式碼，因為這昂程式碼是有效程式碼，不能在this(id,name,0,false,0)前面
		this(id,name,0,false,0);
	}
	
	//Overloading
	public Product(int id, String name, double unitPrice, boolean free, int stock) {
		//super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.free = free;
		this.stock = stock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		if (unitPrice >= 10) {
			this.unitPrice = unitPrice;
		}else {
			//throw new RuntimeException("Oops... price not correct");
			this.unitPrice = 10.0;
		}
	}


	public boolean isFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}


	public int getStock() {  //查詢庫存
		return stock;
	}


	public void incStock(int amount) {  //進貨
		this.stock += amount;
	}
	
	
	public void decStock(int amount) {  //出貨
		this.stock -= amount;
	}



	public String toString() {
		return id + "\t" + name +"\t" + unitPrice + "\t" 
			   + free + "\t" + stock;
	}
}
