package com.yedam.exceptions;

public class NullPonterExceptoins {
	public static void main(String[] args) {
		String str = null;
			System.out.println(str.toString());
			
			try {
				Class.forName("java.lang.String2");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}



		System.out.println("프로그램 종료.");
	}
}
