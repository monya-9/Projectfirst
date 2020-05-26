package com.yedam.collection.list;

import java.util.List;

public interface BoardService2 {
	void insetBoard(Board board); // 입력
	void updateBoard(Board board); // 수정
	void deleteBoard(String title); // 삭제
	void showBoard();// 목록
}
