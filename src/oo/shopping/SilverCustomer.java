package oo.shopping;

public class SilverCustomer extends Customer {
	
	public void SilverCustomer(int price){
		this.pay = price * 9 / 10;
		System.out.println(pay + "\t");
	}

}

