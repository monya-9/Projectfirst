package com.yedam.dev;

public class ArrayEx {
	public static void main(String[] args) {
		int num1 = 100;
		String str1 = "Hello";
		
		int[] intAry = new int[5];
		intAry[0] = 10;
		intAry[1] = 20;
		System.out.println(intAry[0]);
		
		String[] strAry = {"Hello", "World", "nice", "10"};
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		for (String str : strAry) {
			System.out.println(str);
		}
		
		int result = sumAry(intAry);

			}
	
	public static double avgAry(double[] ary) {
		double sum = 0, avg = 0;
		for(int i=0;i<ary.length; i++) {
			sum += ary[i];
		}
		avg = sum / ary.length;
		return avg;
	}
	
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
