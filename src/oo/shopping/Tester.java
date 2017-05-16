package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("應負金額" + "\t" + "回饋金");
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
		
//		for(int i = 0 ; i < list.size() ; i++){
//		Customer Customer = list.get(i);
		for(Customer Customer : list){
		if(Customer instanceof SilverCustomer && !(Customer instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer SilverCustomer = (SilverCustomer)Customer;
			} 
			Customer.print();
		}

	}

}
