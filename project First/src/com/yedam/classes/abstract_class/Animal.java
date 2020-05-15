package com.yedam.classes.abstract_class;
//추상 클래스()
public class Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상 메소드
}
