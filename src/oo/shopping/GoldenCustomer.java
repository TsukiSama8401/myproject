package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	
	float back;
	
	public GoldenCustomer(int price){
		this.price = price;
	}
	
	public void setBack(float b){
		back = b;
	}
	
	public float getBack(float b){
		return back = price * b;
	}
	public void print(){
		System.out.println("總金額:" + price + "\t" + "還原金:" + back);
	}

}
