package com.yedam.classes;

public class University extends Friend {
	private String major;
	
	public University(String name, String tallNumber, String major) {
		super(name, tallNumber);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showinfo() {
		System.out.println("이름: " + name + "전화번호: " + tallNumber + "전공: " + major);
	}
	
}
