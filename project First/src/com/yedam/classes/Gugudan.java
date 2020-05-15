package com.yedam.classes;

public class Gugudan {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i< 9; i++) {
			for (int j = 2; j<9; j++) {
				sum = i * j;
				System.out.print(i + "x" + j + "=" + sum + "\t");
			}
			System.out.println();
		}
	}
}
