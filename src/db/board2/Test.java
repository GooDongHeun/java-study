package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class Test {
	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selectBoard();
	}
//		ConTest ct = new ConTest();
//		ct.call();
//		ct.close();
//		ConTest ct2 =  ct;
//		ct = null;
//		System.out.println(ct2);
}
