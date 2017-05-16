package oo.shopping;

public class Customer {
	
	int pay;
	int price;
	int back;
	
	public Customer(int price){
		super();
		this.pay = price;
		
	}
	
	public void print(){
		System.out.println(pay + "\t");
	}

}
