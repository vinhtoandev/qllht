package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import DAO.GiaovienDAO;
import Model.Giaovien;
import View.AdminView;


public class GiaoVienConTroler implements ActionListener{
	private AdminView adminview;
	
	public GiaoVienConTroler(AdminView adminview) {
		this.adminview = adminview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == adminview.btnHienThiGV) {
			ArrayList<Giaovien> list = GiaovienDAO.getInstance().selectAll();
			
			DefaultTableModel model = (DefaultTableModel) adminview.tableGV.getModel();
			for(Giaovien gv : list) {
				
				String gender ;
				if(gv.getGioiTinh() == true) gender = "Nam";
				else gender = "Nu";
				String[] row = {gv.getMaGV(), gv.getName(), gv.getNamSinh(), gender, gv.getChuyenMon(), gv.getTrinhDo(), String.valueOf(gv.getSDT())};
				model.addRow(row);
			}
			for(Giaovien gv :list) {
				System.out.println(gv.toString());
			}
			
		}
		
	}
}

