package com.yedam.classes;

public class People2 {
	public static void main(String[] args) {
		People stu = new People();
		stu.ca = "낮잠";
		stu.xr = "게임";
		stu.qkf = 230;
		stu.wlq();
		stu.shf("놀이공원에 ");
		
		System.out.println("취미는: " + stu.ca + ", 특기는: " + stu.xr + ", 신발 사이즈는: " + stu.qkf);
	}
}
