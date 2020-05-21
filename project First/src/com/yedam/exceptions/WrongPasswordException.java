package com.yedam.exceptions;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		System.out.println("패스워드가 틀립니다.");
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
