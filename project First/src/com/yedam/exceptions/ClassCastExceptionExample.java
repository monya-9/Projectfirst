package com.yedam.exceptions;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {

			chageDog(dog);
		} catch (ClassCastException e) {
			System.out.println("변환불가.");
		}
		try {
			Animal cat = new Cat();
			chageDog(cat);
		} catch (ClassCastException e) {
			System.out.println("변환불가.");
		}
	}

	public static void chageDog(Animal animal) throws ClassCastException {
//		try {
//			if (animal instanceof Dog) {
		Dog dog = (Dog) animal;
		dog.sound();
//			} else {
//				System.out.println("변경할 수 없는 클래스입니다.");
//			}
//		} catch (ClassCastException e) {
//			System.out.println("형변환을 할 수 없습니다.");
//		}
	}
}
