package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Hocvien;


public class HocvienDAO implements DAOInterface<Hocvien>{
		
	public static HocvienDAO getInstance() {
		return new HocvienDAO();
	}

	@Override
	public int insert(Hocvien t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO hocvien " + 
					"VALUES ('" + t.getMaHV() + "', '" + t.getName() + "', '" + t.getNamSinh() + 
					"', " + t.isGioiTinh() + ", '" + t.getSdt() + "', '" + t.getTinhTrang() + "');"; 				
			int kq = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
			System.out.println("Co " + kq + " dong da thay doi");
			JDBCUtil.closeConnection(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Hocvien t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "UPDATE hocvien " + 
					"SET " + 
					" name = '" + t.getName() + "'," +
					" namSinh = '" + t.getNamSinh() + "'," +
					" gioiTinh = " + t.isGioiTinh() + "," +
					" SDT = '" + t.getSdt() + "'," +
					" tinhTrang = '" + t.getTinhTrang() + "' " +
					"WHERE maHV = '" + t.getMaHV() + "'";  				
			int kq = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
			System.out.println("Co " + kq + " dong da thay doi");
			JDBCUtil.closeConnection(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Hocvien t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "DELETE FROM hocvien " + 
					"WHERE ('" + t.getMaHV() + "', '" + t.getName() + "', '" + t.getNamSinh() + 
					"', " + t.isGioiTinh() + ", '" + t.getSdt() + "', '" + t.getTinhTrang() + "');"; 				
//			int kq = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
//			System.out.println("Co " + kq + " dong da thay doi");
			JDBCUtil.closeConnection(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Hocvien> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hocvien selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Hocvien> selectByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
