package com.yedam.classes.statics;

public class Account {
	private String ano;  //계좌번호
	private String owner; //예금주
	private int balance; //잔액
	
	public Account(String ano, String owner, int balance) {
		super(); //상위 클래스를 받아오는것 빼도상관없음.
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
