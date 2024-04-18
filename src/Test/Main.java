package Test;

import java.sql.Connection;

import com.mysql.cj.jdbc.JdbcConnection;

import Database.JDBCUtil;

public class Main {
	public static void main(String[] args) {
		Connection cnn = JDBCUtil.getConnection();
		System.out.println(cnn);
		JDBCUtil.closeConnection(cnn);
	}
	
	
}
