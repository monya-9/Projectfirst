package com.yedam.api;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//AutoUnBoxing
		Integer obj = 100;
		System.out.println("Balue: " + obj.intValue());
		
		//대입 시 자동 언박싱
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
