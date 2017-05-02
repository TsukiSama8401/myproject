package oo.stati;

public class Tester {
	
	public static void main(String[]args){
		System.out.println(Student.pass);
		Student stu1 = new Student(79,84,53);
		Student stu2 = new Student(58,66,29);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(68,85,89);
		gstu.print();
	}

}
