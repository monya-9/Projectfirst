package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class Boardmain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceImpl();

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.목록 5.종룡");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("제목입력.");
				String title = scn.nextLine();
				System.out.println("내용입력.");
				String content = scn.nextLine();
				System.out.println("작성자입력.");
				String writer = scn.nextLine();
				Board board = new Board(title, content, writer);
				service.insetBoard(list, board);

				for (Board brd : list) {
					System.out.println(brd);
				}

			}
			scn.close();

			System.out.println("입력이 완료되었습니다.");


		}
	}

}
