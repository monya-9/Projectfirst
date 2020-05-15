package com.yedam.classes;

public class Company extends Friend {
	private String depatments;
	
	public Company(String name, String tallNumber, String depatments) {
		super(name, tallNumber);
		this.depatments = depatments;
	}

	public String getDepatments() {
		return depatments;
	}

	public void setDepatments(String depatments) {
		this.depatments = depatments;
	}
	public void showinfo() {
		System.out.println("이름: " + name + "전화번호: " + tallNumber + "부서: " + depatments);
	}
	
}
