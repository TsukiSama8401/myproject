package oo.stati;

import java.util.ArrayList;

public class Tester {
	
	public static void main(String[]args){
		
		Student stu = new Student(99,89,66);
		System.out.println(stu);
		
		System.out.println(Student.pass);
		Student stu1 = new Student(79,84,53);
		Student stu2 = new Student(58,66,29);
		Student stu3 = new Student(88,99,85);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(66,87,66);
		GraduateStudent gstu2 = new GraduateStudent(78,89,60);
		gstu1.print();
		gstu2.print();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(79,84,53));
		list.add(new Student(58,66,29));
		list.add(new Student(88,99,85));
		list.add(new GraduateStudent(66,87,66));
		list.add(new GraduateStudent(78,89,66));
//		for(int i = 0 ; i < list.size() ; i++){
//			Student stu = list.get(i);
//			stu.print();
//		}
	}

}
