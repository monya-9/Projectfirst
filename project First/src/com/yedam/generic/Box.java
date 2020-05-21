package com.yedam.generic;

public class Box<T> { // 실행하는 시점에 타입을 정해줌 예) T > Apple로 바꿔주기 등
	T object; //T 타입을 정하지 않음, 타입 파라메타 영어 대문자 한자 D, K, B, A, 등 다 가능
	void set(T obgect) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
}
