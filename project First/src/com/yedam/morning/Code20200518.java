package com.yedam.morning;

import java.util.Arrays;

public class Code20200518 {
	public static void main(String[] args) {
		int[] intAry = { 10, 8, 5, 3, 7, 1 };
		Arrays.sort(intAry);

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("=============");

		for (int i = 0; i < intAry.length; i++) {
			for (int j = i + 1; j < intAry.length; j++) {
				if (intAry[i] < intAry[j]) {
					int tmep = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = tmep;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
	}
}
