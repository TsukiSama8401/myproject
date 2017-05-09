package oo.shopping;

public class SilverCustomer extends Customer {
	
	public SilverCustomer(){
		
	}
	
	
	public SilverCustomer(float price){
		this.price = price;
	}
	
	float discount = 0.9f;
	
	public void setDiscount(float d){
		discount = d;
	}
	
	public float getDiscount(float d){
		return price = price * d;
	}
	
	public void print(){
		System.out.println("總金額:" + price);
	}

}
