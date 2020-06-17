package com.yedam.morning;

import java.util.Random;

public class Code20200617 {
	public static void main(String[] args) {
		int[] selectNumber = new int[10];	//배열갯수
		Random random = new Random();
		int[] chkArr = new int[10];	//숫자~까지

		for (int i = 0; i < 10; i++) {	//배열 갯수
			int n = random.nextInt(10) + 1;  //숫자~까지
			if (chkArr[n - 1] == 0) {
				chkArr[n - 1] = 1;
				selectNumber[i] = n;
			} else {
				i--;
			}
		}
		for (int i = 0; i < 10; i++) {	//배열갯수
			System.out.print(selectNumber[i] + " ");
		}

		if (true) {
			return;

		}
	}
}
