package invoice;

import java.util.Scanner;

public class WINNING {

	public static void main(String[] args) {
		System.out.print("Please Enter Your Invoice Number:");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		String a = String.valueOf(s);
		a = a.substring(a.length()-3);
		int b = Integer.parseInt(a);
		switch(b){
		case 331:
			System.out.println("WINNING!");
			break;
		case 821:
			System.out.println("WINNING!");
			break;
		case 886:
			System.out.println("WINNING!");
			break;
		case 554:
			System.out.println("WINNING!");
			break;
		default:
			System.out.println("LOSING!");
			break;
		}

	}

}
