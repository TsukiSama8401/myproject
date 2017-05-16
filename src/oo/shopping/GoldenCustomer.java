package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	
	public GoldenCustomer(int price){
		super(price);
		this.pay = price * 9 / 10;
		this.back = price * 5 / 100;
	}
	
	public void print(){
		System.out.println(pay + "\t" + back);
	}


}
