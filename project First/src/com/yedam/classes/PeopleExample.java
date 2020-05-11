package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People p1 = new People();
		p1.ca = "낮잠";
		p1.xr = "게임";
		p1.qkf = 230;
		p1.wlq();
		p1.shf("놀이공원에 ");
		System.out.println("취미는: " + p1.ca + ", 특기는: " + p1.xr + ", 신발 사이즈는: " + p1.qkf);
		
		People p2 = new People();
		p2.ca = "노래하기";
		p2.xr = "청소";
		p2.qkf = 240;
		p2.wlq();
		p2.shf("워터파크에 ");
		System.out.println("취미는: " + p2.ca + ", 특기는: " + p2.xr + ", 신발 사이즈는: " + p2.qkf);
		
		People p3 = new People();
		p3.ca = "독서";
		p3.xr = "글쓰기";
		p3.qkf = 265;
		p3.wlq();
		p3.shf("동물원에 ");
		System.out.println("취미는: " + p3.ca + ", 특기는: " + p3.xr + ", 신발 사이즈는: " + p3.qkf);
	}
}
