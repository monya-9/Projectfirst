package com.yedam.collection.list;

import java.util.List;

public interface BoardService {
	void insetBoard(List<Board> list, Board board); //입력
	void updateBoard(List<Board> list, Board board); //수정
}
