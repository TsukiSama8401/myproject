package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	
	static{
		System.out.println("STSTIC!!!");
//		System.out.println(english);
		System.out.println(pass);
	}
	
	public Student(int english, int math, int chinese){
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public void print(){
		System.out.println();
	}

}
