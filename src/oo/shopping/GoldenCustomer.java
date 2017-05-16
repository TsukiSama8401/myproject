package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	
	public void GoldenCustomer(int price){
		this.pay = price * 9 / 10;
		this.back = price * 5 / 100;
		System.out.println(pay + "\t" + back);
	}
	



}
