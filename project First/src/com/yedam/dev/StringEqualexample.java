package com.yedam.dev;

class Student {
	String name;
}

public class StringEqualexample {
	public void mian(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.name = "Hong";
		st2.name = "Park";
		
		System.out.println(st1);
		System.out.println(st2);
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1 == str2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}
	}
}