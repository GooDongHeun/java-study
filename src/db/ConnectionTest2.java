package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {
	private static int i;

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select BI_NUM, BI_TITLE, BI_CONTENT"
					+ " BI_CREDAT, BI_CRETIM, BI_CNT"
					+ " BI_ISACTIVE from board_info";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList = new ArrayList<>();
			while(rs.next()) {
				HashMap<String,String> row = new HashMap<>();
				String bititle = rs.getString("BI_TITLE");
				String biNum = rs.getString("bi_num");
				System.out.println("biNum : " + biNum);
				System.out.println("bititle : " + bititle);
				row.put("biNum",biNum);
				row.put("biTitle",bititle);
				row.put("biContent",rs.getString("BI_CONTENT"));
				row.put("biCredat",rs.getString("BI_CREDAT"));
				row.put("biCretim",rs.getString("BI_CRETIM"));
				row.put("biCnt",rs.getString("BI_CNT"));
				row.put("biIsactive",rs.getString("BI_ISACTIVE"));
			System.out.println(row);
			}
			for(int i=0;i<rowList.size();i++);
			System.out.println(rowList.get(i));
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
