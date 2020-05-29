package com.yedam.morning;

import java.util.Random;
import java.util.Scanner;

public class Code20200529 {
	public static void main(String[] args) {
		int[] selectNumber = new int[3];
		int[] winningNumber = new int[3];
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		System.out.println("게임시작.");
		Random random = new Random();
		System.out.println("번호가 생성되었습니다.");

		boolean t = true;

		while (t) {

			for (int i = 0; i < 3; i++) {
				selectNumber[i] = random.nextInt(9) + 1;
			}
			if (selectNumber[0] != selectNumber[1] && selectNumber[0] != selectNumber[2]
					&& selectNumber[1] != selectNumber[2]) {
				t = false;
			}
		}
		t = true;

		while (true) {
			int strake = 0;
			int boll = 0;
			System.out.print("첫번째 번호 입력: ");
			winningNumber[0] = scn.nextInt();
			System.out.print("두번째 번호 입력: ");
			winningNumber[1] = scn.nextInt();
			System.out.print("세번째 번호 입력: ");
			winningNumber[2] = scn.nextInt();

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
					if (selectNumber[i] == winningNumber[j]) {
						if (i == j)
							strake++;
						else
							boll++;

					}
				}
			}
			System.out.println("strake : " + strake + " boll: " + boll);
			if (strake == 3)
				break;
		}
		System.out.println("게임이 끝났습니다.");

	}
}
