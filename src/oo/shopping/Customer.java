package oo.shopping;

public class Customer {
	
	int price;
	
	public Customer(){
		
	}
	
	public Customer (int price){
		super();
		this.price = price;
	}
	
	public void print(){
		System.out.println("總金額:" + price);
	}

}
