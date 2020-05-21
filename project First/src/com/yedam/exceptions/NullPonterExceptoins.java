package com.yedam.exceptions;

public class NullPonterExceptoins {
	public static void main(String[] args) {
		String str = null;
		try {
		System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("null 값 참조");
		}
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료.");
	}
}
