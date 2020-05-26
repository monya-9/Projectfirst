package com.yedam.lambda;
//class MyFuncClass implements MyFumctionalIntergace {

//	@Override
//	public void run() {
//		System.out.println("실행");
//	}
//}

public class LamdbExampl {
	public static void main(String[] args) {
		MyFumctionalIntergace fi = new MyFumctionalIntergace() {
			// 익명구현객체
			@Override
			public void run() {
				System.out.println("실행");
			}
		};
		fi.run();

		// 간단한 람다표현식. -> run() 메소드 구현하는 부분.
		MyFumctionalIntergace fi2 = () -> System.out.println("실행");
		fi2.run();

		// 2) 매개값이 있는 인터페이스
		MySumInterface si = (num1, num2) -> {
				int result = num1 + num2;
				System.out.println("두수의 합: " + result);
		};
		si.sum(10, 20);
		
		//3)변환값이 있는 매개값이 있는 인터페이스.
		MymultiIntergace mi = (num1, num2) -> {
			return num1 * num2;
		};
		
		int result = mi.multi(10,50);
		System.out.println("결과값은: " + result);
	}
}
