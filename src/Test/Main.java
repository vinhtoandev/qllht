package Test;

import java.sql.Connection;

import com.mysql.cj.jdbc.JdbcConnection;

import DAO.HocvienDAO;
import Database.JDBCUtil;
import Model.Hocvien;

public class Main {
	public static void main(String[] args) {
		Connection cnn = JDBCUtil.getConnection();
		Hocvien hv1 = new Hocvien("10004", "lvup", "2004-9-2", false, "0334896572", "active");
		HocvienDAO.getInstance().delete(hv1);
		JDBCUtil.closeConnection(cnn);
	}
	
	
}
