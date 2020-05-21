package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
		if (m1.equals(m3)) {
			System.out.println("동등합니다.");
		} else {
			System.out.println("다릅니다.");
		}

		System.out.println(m1.toString());
		System.out.println(m1.hashCode() + ", " + m2.hashCode());
		if (m1 == m2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}

}
