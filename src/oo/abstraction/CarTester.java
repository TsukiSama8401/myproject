package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", "Altis", 1800);
		System.out.println(c1.brand + "," + c1.cc + "," + c1.name );
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA","ZEE",2000);
	}

}
