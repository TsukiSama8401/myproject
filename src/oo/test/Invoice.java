package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
//		int m ;
//		Scanner scanner = new Scanner(System.in);
//		m = scanner.nextInt();
//		System.out.println("請輸入發票號碼:" + m);
		
		String s = "331";
		//
		String n = "948794331";
		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
		System.out.println(sub);
		
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");

	}

}
