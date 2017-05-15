package oo.shopping;

public class SilverCustomer extends Customer {
	
	public void SilverCustomer(int price){
		this.pay = price * 9 / 10;
		System.out.println("應付金額:" + pay);
	}

}

