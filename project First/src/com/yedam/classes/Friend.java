package com.yedam.classes;

public class Friend {
	public String name;
	public String tallNumber;
	
	public Friend(String name, String tallNumber) {
		this.name = name;
		this.tallNumber = tallNumber;
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTallNumber() {
		return tallNumber;
	}

	public void settallNumber(String tallNumber) {
		this.tallNumber = tallNumber;
	}


	public void showinfo() {
		System.out.println("이름: " + name + "전화번호: " + tallNumber);
	}
	
}
