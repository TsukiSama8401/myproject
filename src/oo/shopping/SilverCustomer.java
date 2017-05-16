package oo.shopping;

public class SilverCustomer extends Customer {
	
	public SilverCustomer(int price){
		super(price);
		this.pay = price * 9 / 10;
	}
	
	public void print(){
		System.out.println(pay + "\t");
	}

}

