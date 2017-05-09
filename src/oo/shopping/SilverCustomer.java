package oo.shopping;

public class SilverCustomer extends Customer {
	
	public SilverCustomer(){
		
	}
	
	
	public SilverCustomer(int price){
		this.price = price;
	}
	
	float discount;
	
	public void setDiscount(float d){
		discount = d;
	}
	
	public float getDiscount(float d){
		return discount = price * d;
	}
	
	public void print(){
		System.out.println("總金額:" + price);
	}

}
