package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;

public class Tester {

	public static void main(String[] args) {
		Car c = new Car("XX","AA",2000);
		ArrayList a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, 885);
		System.out.println(a);

	}

}
