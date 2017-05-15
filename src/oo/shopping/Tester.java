package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.Customer(6000);
		SilverCustomer s1 = new SilverCustomer();
		s1.SilverCustomer(8000);
		SilverCustomer s2 = new SilverCustomer();
		s2.SilverCustomer(10000);
		GoldenCustomer g1 = new GoldenCustomer();
		g1.SilverCustomer(30000);
		g1.Back(30000);
		Customer c2 = new Customer();
		c2.Customer(2000);
		GoldenCustomer g2 = new GoldenCustomer();
		g2.SilverCustomer(10000);
		g2.Back(10000);

	}

}
