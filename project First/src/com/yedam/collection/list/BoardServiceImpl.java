package com.yedam.collection.list;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Override
	public void insetBoard(List<Board> list, Board board) {
		list.add(board);
		
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {
		list.add(board);
		
	}

}
