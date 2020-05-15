package com.yedam.classes;

import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class FriendExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Friend[] friend = new Friend[100];
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.주소추가 2.주소목록 3.이름조회 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt(); scn.nextLine();
			if(menu==1) {
				System.out.println("1.친구 2.대학친구 3.회사친구");
				int submenu = scn.nextInt();
				System.out.println("이름입력:");
				String name = scn.nextLine();
				System.out.println("전화번호:");
				String tallNumber = scn.nextLine();
				
				break;
			}
		}
			System.out.println("주소가 추가되었습니다.");
			System.out.println("주소목록 선택");
			for(Friend fr : friend) {
				if(fr != null) {
					System.out.println("이름: " + fr.getName() + "전화번호: " + fr.getTallNumber());
				}
			}
			for(University un : University) {
				if(un != null) {
					System.out.println("이름: " + un.getName() + "전화번호: " + un.getTallNumber() + "전공: " + un.getMajor());
				}
			}
			for(Company co : Company) {
				if(co != null) {
					System.out.println("이름: " + co.getName() + "전화번호: " + co.getTallNumber() + "부서: " + co.getDepatments());
				}
		} else if (menu==3) {
			System.out.println("이름조회 선택");
			System.out.println("조회할 이름을 입력하세요.");
			String name = scn.nextLine();
			for()
			
		} else if (menu==4) {
			System.out.println("종료 선택.");
			break;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
