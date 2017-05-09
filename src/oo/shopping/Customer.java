package oo.shopping;

public class Customer {
	
	float price;
	
	public Customer(){
		
	}
	
	public Customer (float price){
		super();
		this.price = price;
	}
	
	public void print(){
		System.out.println("總金額:" + price);
	}

}
