package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Hong");
		list.add(2, "Hong");
		list.add(2, "hwang"); // 인덱스값 2번에 젤 늦게들어가서 2번에 있는 다른애들을 한칸씩 밀어냄
		list.set(2, "Park"); // 치환 (2번자리 인덱스 덮어씌움)

		for (String str : list) {
			System.out.println(str.toString());
		}

		System.out.println(list.get(1));

		list.remove(4);
		System.out.println("after remove(4)");
		for (int i = 0; i< list.size(); i++) { 
			System.out.println(list.get(i).toString());
		}
	}
}
