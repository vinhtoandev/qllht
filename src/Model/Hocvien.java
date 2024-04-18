package Model;

import java.sql.Date;

public class Hocvien {
	private String maHV;
	private String name;
	private Date namSinh;
	private boolean gioiTinh;
	private String sdt;
	private String tinhTrang;
	
	public String getMaHV() {
		return maHV;
	}
	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
