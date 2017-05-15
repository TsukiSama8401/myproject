package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	
	public void Back(int price){
		this.back = price * 5 / 100;
		System.out.println("回饋金:" + back);
	}


}
