package com.yedam.generic;
class Apple {
	
}
class Orange {
	
}
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //<>안에 타입선언 해당 타입만 받을수있음
		box.set("Hello"); //박스 하나에 타입을 여러번 바꾸면 성능이 떨어짐
		String str = (String) box.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = (Apple) appleBox.get();
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		Orange orange = (Orange) orangeBox.get();
	}
}
