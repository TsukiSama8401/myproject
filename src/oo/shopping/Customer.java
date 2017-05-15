package oo.shopping;

public class Customer {
	
	int pay;
	int price;
	int back;
	
	public void Customer(int price){
		this.pay = price;
		System.out.println("應付金額:" + pay);
	}

}
