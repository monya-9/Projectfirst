package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
		
		int[] intAry = {1,2,3,4,5};
		
		int [][] intAry2 = new int [5][];
		intAry2[0] = new int[] {1,2,3,4,5};
		intAry2[1] = new int[] {6,7,8,9,10};
		intAry2[2] = new int[] {11,12,13,14,15};
		intAry2[3] = new int[] {16,17,18,19,20};
		intAry2[4] = new int[] {21,22,23,24,25};
		
		for(int i=0;i<intAry2.length;i++) {  
			for(int j=0;j<intAry2[i].length;j++) {   
				System.out.print(intAry2[i][j]  + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		
int[] intAry3 = {1,2,3,4,5};
		
		int [][] intAry4 = new int [5][];
		intAry4[0] = new int[] {1,6,11,16,21};
		intAry4[1] = new int[] {2,7,12,17,22};
		intAry4[2] = new int[] {3,8,13,18,23};
		intAry4[3] = new int[] {4,9,14,19,24};
		intAry4[4] = new int[] {5,10,15,20,25};
		
		for(int i=0;i<intAry4.length;i++) {  
			for(int j=0;j<intAry4[i].length;j++) {   
				System.out.print(intAry4[i][j]  + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		int i;
		int j;
		for(i = 1; i<6; i++) {
			for(j = 1; j < 6; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
	} 
}
