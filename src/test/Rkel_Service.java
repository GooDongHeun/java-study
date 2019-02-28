package test;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.board.DBCon;

public class Rkel_Service {
	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("현재 생성된 캐릭터");
			while(rs.next()) {
				System.out.println(rs.getString("BI_TITLE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void insertBoard(String charactersid, String power, String agility ) {
		String sql = "insert into board_info(bi_charactersid, bi_power,"
				+ " bi_agility";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, charactersid);
			ps.setString(2, power);
			ps.setString(3, agility);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("캐릭터 생성이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void deleteBoard(String charactersid) {

		}
	}

