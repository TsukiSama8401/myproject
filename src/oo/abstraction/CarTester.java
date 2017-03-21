package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA", "Altis", 1800);
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA","WISH",2000);
		
		int[] n = new int[5];
		System.out.println(n[2]);
		
		Car[] cars = new Car[3];
		cars[0] = new Car("TOYOTA", "Altis", 1800);
		cars[1] = new Car("HONDA", "ACCORD", 2000);
		cars[2] = new Car("TOYOTA","WISH",2000);
		cars[0].id = 300;
		cars[1].id = 403;
		cars[2].id = 400;
		System.out.println(cars[0].name);
		for(int i=0;i<3;i++){
			System.out.println(cars[i].name);
		}
		
		class AA{
			
		}
		AA a = new AA();
	}

}
