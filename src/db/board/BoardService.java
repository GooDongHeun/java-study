package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {
	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("제목");
			while(rs.next()) {
				System.out.println(rs.getString("BI_TITLE"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title,"
				+ "bi_content, bi_credat, bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,TO_CHAR(SYSDATE, 'YYYYMMDD')"
				+ ",TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 게시물이 등록");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
}
	public void updateBoard() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
		String sql="update board_info \r\n" +
		"set bi_title=?, \r\n" +
		"bi_content=? \r\n" +
		"where bi_num=?";
		PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
		ps.setString(1,"제목");
		ps.setString(2,"내용");
		ps.setInt(3,4);
		
		int cnt = ps.executeUpdate();
		if(cnt==1) {
			System.out.println("정상적으로 업데이트 됨");
		} else {
			System.out.println("오류는 아닌데 업데이트는 안됨!");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBCon.close();
	}
	}


	public void deleteBoard(int num) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
		String sql = "delete from board_info where bi_num=?";
		PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
		ps.setInt(1, num);
		int cnt = ps.executeUpdate();
		if(cnt==1) {
			System.out.println("삭제 잘됨");
		} else {
			System.out.println("어라? 없더라 이미");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
