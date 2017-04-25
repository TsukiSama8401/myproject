package oo.mid;

public class MealTester {

	public static void main(String[] args) {
		Meal m1 = new Meal("big mac", 39 ,"fried chicken", 25 ,"cola", 15);
		int sum;
		sum = m1.mp + m1.ap + m1.dp;
		System.out.println(sum);
	}

}
