package DAO;

import java.sql.Connection;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Giaovien;

public class GiaovienDAO implements DAOInterface<Giaovien>{

	public static GiaovienDAO getInstance() {
		return new GiaovienDAO();
	}
	
	public int insert(Giaovien t) {
		
		
		
		
		return 0;
	}

	@Override
	public int update(Giaovien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Giaovien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Giaovien> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Giaovien selectById(Giaovien t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Giaovien> selectByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

}
