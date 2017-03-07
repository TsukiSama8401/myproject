package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 1800, "Altis", "Sedan");
		System.out.println(c1.brand + "," + c1.cc + "," + c1.name + "," + c1.type);
	}

}
