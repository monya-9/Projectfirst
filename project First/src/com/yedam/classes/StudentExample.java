package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");
		
		System.out.println("이름은: " + stu.name + " , 나이는: " + stu.age);
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age= 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		System.out.println("이름은: " + stu1.name + " , 나이는: " + stu1.age);
		stu.eat("사과");
		
		Student stu2 = new Student("Choi");
		stu2.age= 40;
		stu2.height = 168.4;
		stu2.weight = 60.5;
		System.out.println("이름은: " + stu2.name + " , 나이는: " + stu2.age);
		stu.eat("수박");
		
		int[] intary = new int[5];
		intary[0] = 10;
		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "choi"; 
		
		for(Student stud : s1) {
			System.out.println(stud.name + "/ " + stud.age);
		}
	}
}
