package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.GiaoVienConTroler;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class AdminView extends JFrame {
	
	
	public static final long serialVersionUID = 1L;
	public JPanel contentPane, Menu ;
	public JTabbedPane tabbedPane;
	public JTable tableGV,tableHV;
	public JLabel lblNewLabel,lblNewLabel_1;
	public JButton btnGiaoVien,btnHocVien, btnLopHoc, btnBienLai, btnThemGV, btnSuaGV, btnXoaGV, btnHienThiGV, btnTimKiemGV;
	public JButton btnThemHV, btnSuaHV, btnXoaHV;
	public TextField txtNameGV; 
	public JTextField txtNhapMaGV;
	public JTextField txtNhapTenGV;
	public JTextField txtNhapNamSinhGV;
	public JTextField txtNhapChuyenMonGV;
	public JTextField txtNhapTrinhDoGV;
	public JTextField txtNhapSDTGV;
	public JTextField txtNhapMaHV;
	public JTextField txtNhapTenHV;
	public JTextField txtNhapNamSinhHV;
	public JTextField txtNhapSDTHV;
	public JComboBox cbbSapXepHV, cbbSapXepGV;
	
	
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminView frame = new AdminView();
//					frame.setLocationRelativeTo(null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	

public AdminView() {
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1524, 777);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	
	Menu = new JPanel();
	Menu.setBounds(0, 0, 195, 703);
	Menu.setLayout(null);
	Menu.setBackground(new Color(36, 0, 72));
	Menu.setPreferredSize(new Dimension(150,703));;
	contentPane.setLayout(null);
	contentPane.add(Menu);
	
	lblNewLabel = new JLabel("PTAN  ");
	lblNewLabel.setForeground(Color.WHITE);
	lblNewLabel.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 33));
	lblNewLabel.setBounds(10, 35, 146, 49);
	Menu.add(lblNewLabel);
	
	lblNewLabel_1 = new JLabel("Trung tâm dạy thêm");
	lblNewLabel_1.setForeground(Color.WHITE);
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	lblNewLabel_1.setBounds(20, 94, 124, 13);
	Menu.add(lblNewLabel_1);
	
	JSeparator separator = new JSeparator();
	separator.setForeground(Color.WHITE);
	separator.setBackground(Color.WHITE);
	separator.setBounds(10, 123, 162, 19);
	Menu.add(separator);
	
	JPanel panel_1 = new JPanel();
	panel_1.setLayout(null);
	panel_1.setBackground(new Color(51, 0, 102));
	panel_1.setBounds(0, 173, 195, 56);
	Menu.add(panel_1);
	
	btnGiaoVien = new JButton("Giáo viên");
	btnGiaoVien.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(0);
		}
	});
	btnGiaoVien.setForeground(Color.WHITE);
	btnGiaoVien.setFont(new Font("Segoe UI", Font.BOLD, 15));
	btnGiaoVien.setBackground(new Color(51, 0, 102));
	btnGiaoVien.setBounds(0, 0, 194, 56);
	panel_1.add(btnGiaoVien);
	
	JPanel panel_1_1 = new JPanel();
	panel_1_1.setLayout(null);
	panel_1_1.setBackground(new Color(36, 0, 72));
	panel_1_1.setBounds(0, 228, 195, 56);
	Menu.add(panel_1_1);
	
	btnHocVien = new JButton("Học viên");
	btnHocVien.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			tabbedPane.setSelectedIndex(1);
		}
	});
	btnHocVien.setForeground(Color.WHITE);
	btnHocVien.setFont(new Font("Segoe UI", Font.BOLD, 15));
	btnHocVien.setBackground(new Color(36, 0, 72));
	btnHocVien.setBounds(0, 0, 195, 56);
	panel_1_1.add(btnHocVien);
	
	JPanel panel_1_2 = new JPanel();
	panel_1_2.setLayout(null);
	panel_1_2.setBackground(new Color(51, 0, 102));
	panel_1_2.setBounds(0, 283, 195, 56);
	Menu.add(panel_1_2);
	
	btnLopHoc = new JButton("Lớp học");
	btnLopHoc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(2);
		}
	});
	btnLopHoc.setForeground(Color.WHITE);
	btnLopHoc.setFont(new Font("Segoe UI", Font.BOLD, 15));
	btnLopHoc.setBackground(new Color(51, 0, 120));
	btnLopHoc.setBounds(0, 0, 194, 56);
	panel_1_2.add(btnLopHoc);
	
	JPanel panel_1_1_1 = new JPanel();
	panel_1_1_1.setLayout(null);
	panel_1_1_1.setBackground(new Color(36, 0, 72));
	panel_1_1_1.setBounds(0, 338, 195, 56);
	Menu.add(panel_1_1_1);
	
	btnBienLai = new JButton("Biên lai");
	btnBienLai.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tabbedPane.setSelectedIndex(3);
		}
	});
	btnBienLai.setForeground(Color.WHITE);
	btnBienLai.setFont(new Font("Segoe UI", Font.BOLD, 15));
	btnBienLai.setBackground(new Color(36, 0, 72));
	btnBienLai.setBounds(0, 0, 196, 56);
	panel_1_1_1.add(btnBienLai);
	
	JPanel panel_6_1_1 = new JPanel();
	panel_6_1_1.setBackground(new Color(147, 0, 73));
	panel_6_1_1.setBounds(0, 675, 197, 33);
	Menu.add(panel_6_1_1);
	
	tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBounds(192, 0, 1308, 730);
	contentPane.add(tabbedPane);
	
	JPanel PanelGiaoVien = new JPanel();
	tabbedPane.addTab("New tab", null, PanelGiaoVien, null);
	PanelGiaoVien.setLayout(null);
	
	JPanel TieuDeGV = new JPanel();
	TieuDeGV.setBounds(0, 61, 988, 172);
	TieuDeGV.setBackground(new Color(135, 123, 191));
	PanelGiaoVien.add(TieuDeGV);
	
	btnThemGV = new JButton("Thêm mới");
	btnThemGV.setBounds(10, 121, 117, 32);
	btnThemGV.setForeground(Color.WHITE);
	btnThemGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnThemGV.setBackground(new Color(36, 0, 72));
	
	btnSuaGV = new JButton("Sửa");
	btnSuaGV.setBounds(137, 121, 71, 32);
	btnSuaGV.setForeground(Color.WHITE);
	btnSuaGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnSuaGV.setBackground(new Color(36, 0, 72));
	
	btnXoaGV = new JButton("Xóa");
	btnXoaGV.setBounds(218, 121, 71, 32);
	btnXoaGV.setForeground(Color.WHITE);
	btnXoaGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnXoaGV.setBackground(new Color(36, 0, 72));
	
	JLabel lblNewLabel_5_3 = new JLabel("Sắp xếp:");
	lblNewLabel_5_3.setBounds(317, 84, 71, 20);
	lblNewLabel_5_3.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
	
	btnHienThiGV = new JButton("Hiển thị");
	btnHienThiGV.setBounds(447, 121, 92, 32);
	btnHienThiGV.setForeground(Color.WHITE);
	btnHienThiGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnHienThiGV.setBackground(new Color(36, 0, 72));
	
	txtNameGV = new TextField();
	txtNameGV.setBounds(564, 128, 179, 21);
	
	JLabel lblNewLabel_5_2_1 = new JLabel("Họ tên:");
	lblNewLabel_5_2_1.setBounds(590, 84, 71, 20);
	lblNewLabel_5_2_1.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
	
	btnTimKiemGV = new JButton("Tìm kiếm");
	btnTimKiemGV.setBounds(762, 121, 92, 32);
	btnTimKiemGV.setForeground(Color.WHITE);
	btnTimKiemGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnTimKiemGV.setBackground(new Color(36, 0, 72));
	
	JLabel lblNewLabel_2 = new JLabel("Giáo viên");
	lblNewLabel_2.setBounds(337, 10, 189, 54);
	lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 40));
	lblNewLabel_2.setForeground(new Color(255, 255, 255));
	TieuDeGV.setLayout(null);
	TieuDeGV.add(btnThemGV);
	TieuDeGV.add(btnSuaGV);
	TieuDeGV.add(btnXoaGV);
	TieuDeGV.add(lblNewLabel_5_3);
	TieuDeGV.add(btnHienThiGV);
	TieuDeGV.add(txtNameGV);
	TieuDeGV.add(lblNewLabel_5_2_1);
	TieuDeGV.add(btnTimKiemGV);
	TieuDeGV.add(lblNewLabel_2);
	
	cbbSapXepGV = new JComboBox();
	cbbSapXepGV.setBounds(305, 121, 117, 32);
	TieuDeGV.add(cbbSapXepGV);

	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(82, 275, 815, 350);
	PanelGiaoVien.add(scrollPane);
	
	tableGV = new JTable();
	scrollPane.setViewportView(tableGV);
	tableGV.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"MaGV", "name", "namSinh", "gioiTinh", "chuyenMon", "trinhDo", "SDT" 
		}
	));
	
	JPanel panel = new JPanel();
	panel.setBackground(SystemColor.activeCaption);
	panel.setBounds(987, 0, 306, 693);
	PanelGiaoVien.add(panel);
	panel.setLayout(null);
	
	
	JLabel lblNewLabel_6 = new JLabel("MaGV");
	lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6.setBounds(23, 174, 64, 30);
	panel.add(lblNewLabel_6);
	
	JLabel lblNewLabel_6_1 = new JLabel("Name");
	lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1.setBounds(23, 243, 64, 22);
	panel.add(lblNewLabel_6_1);
	
	JLabel lblNewLabel_7 = new JLabel("THONG TIN GIAO VIEN");
	lblNewLabel_7.setForeground(new Color(128, 255, 255));
	lblNewLabel_7.setFont(new Font("Tahoma", Font.ITALIC, 28));
	lblNewLabel_7.setBounds(0, 31, 306, 93);
	panel.add(lblNewLabel_7);
	
	JLabel lblNewLabel_6_1_1 = new JLabel("NamSinh");
	lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_1.setBounds(23, 308, 79, 22);
	panel.add(lblNewLabel_6_1_1);
	
	JLabel lblNewLabel_6_1_2 = new JLabel("GioiTinh");
	lblNewLabel_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_2.setBounds(23, 376, 64, 22);
	panel.add(lblNewLabel_6_1_2);
	
	JLabel lblNewLabel_6_1_3 = new JLabel("ChuyenMon");
	lblNewLabel_6_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_3.setBounds(10, 441, 103, 22);
	panel.add(lblNewLabel_6_1_3);
	
	JLabel lblNewLabel_6_1_3_1 = new JLabel("TrinhDo");
	lblNewLabel_6_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_3_1.setBounds(23, 504, 64, 22);
	panel.add(lblNewLabel_6_1_3_1);
	
	JLabel lblNewLabel_6_1_3_2 = new JLabel("SDT");
	lblNewLabel_6_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_3_2.setBounds(23, 571, 64, 22);
	panel.add(lblNewLabel_6_1_3_2);
	
	txtNhapMaGV = new JTextField();
	txtNhapMaGV.setBounds(109, 174, 151, 30);
	panel.add(txtNhapMaGV);
	txtNhapMaGV.setColumns(10);
	
	txtNhapTenGV = new JTextField();
	txtNhapTenGV.setColumns(10);
	txtNhapTenGV.setBounds(109, 243, 151, 30);
	panel.add(txtNhapTenGV);
	
	txtNhapNamSinhGV = new JTextField();
	txtNhapNamSinhGV.setColumns(10);
	txtNhapNamSinhGV.setBounds(109, 308, 151, 30);
	panel.add(txtNhapNamSinhGV);
	
	txtNhapChuyenMonGV = new JTextField();
	txtNhapChuyenMonGV.setColumns(10);
	txtNhapChuyenMonGV.setBounds(109, 440, 151, 30);
	panel.add(txtNhapChuyenMonGV);
	
	txtNhapTrinhDoGV = new JTextField();
	txtNhapTrinhDoGV.setColumns(10);
	txtNhapTrinhDoGV.setBounds(109, 504, 151, 30);
	panel.add(txtNhapTrinhDoGV);
	
	txtNhapSDTGV = new JTextField();
	txtNhapSDTGV.setColumns(10);
	txtNhapSDTGV.setBounds(109, 570, 151, 30);
	panel.add(txtNhapSDTGV);
	
	
	
	JButton btnResetGV = new JButton("Reset");
	btnResetGV.setForeground(Color.WHITE);
	btnResetGV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnResetGV.setBackground(new Color(36, 0, 72));
	btnResetGV.setBounds(109, 630, 82, 40);
	panel.add(btnResetGV); 
	
	JRadioButton rdbtnMaleGV = new JRadioButton("Male");
	rdbtnMaleGV.setSelected(true);
	rdbtnMaleGV.setBounds(109, 374, 70, 30);
	panel.add(rdbtnMaleGV);
	
	JRadioButton rdbtnFemaleGV = new JRadioButton("Female");
	rdbtnFemaleGV.setBounds(197, 374, 70, 30);
	panel.add(rdbtnFemaleGV);
	
	ButtonGroup group = new ButtonGroup();
	group.add(rdbtnMaleGV);
	group.add(rdbtnFemaleGV);
	
	JPanel PanelHocVien = new JPanel();
	tabbedPane.addTab("New tab", null, PanelHocVien, null);
	PanelHocVien.setLayout(null);
	
	JPanel TieuDeHV = new JPanel();
	TieuDeHV.setBackground(new Color(135, 123, 191));
	TieuDeHV.setBounds(0, 98, 999, 182);
	PanelHocVien.add(TieuDeHV);
	TieuDeHV.setLayout(null);
	
	btnThemHV = new JButton("Thêm mới");
	btnThemHV.setForeground(Color.WHITE);
	btnThemHV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnThemHV.setBackground(new Color(36, 0, 72));
	btnThemHV.setBounds(10, 140, 117, 32);
	TieuDeHV.add(btnThemHV);
	
	btnSuaHV = new JButton("Sửa");
	btnSuaHV.setForeground(Color.WHITE);
	btnSuaHV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnSuaHV.setBackground(new Color(36, 0, 72));
	btnSuaHV.setBounds(137, 140, 71, 32);
	TieuDeHV.add(btnSuaHV);
	
	btnXoaHV = new JButton("Xóa");
	btnXoaHV.setForeground(Color.WHITE);
	btnXoaHV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnXoaHV.setBackground(new Color(36, 0, 72));
	btnXoaHV.setBounds(218, 140, 71, 32);
	TieuDeHV.add(btnXoaHV);
	
	JLabel lblNewLabel_5 = new JLabel("Sắp xếp:");
	lblNewLabel_5.setForeground(new Color(36, 0, 72));
	lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
	lblNewLabel_5.setBounds(317, 111, 71, 20);
	TieuDeHV.add(lblNewLabel_5);
	
	JButton btnNewButton_2_3 = new JButton("Hiển thị");
	btnNewButton_2_3.setForeground(Color.WHITE);
	btnNewButton_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_3.setBackground(new Color(36, 0, 72));
	btnNewButton_2_3.setBounds(429, 140, 92, 32);
	TieuDeHV.add(btnNewButton_2_3);
	
	TextField textField = new TextField();
	textField.setBounds(551, 140, 179, 32);
	TieuDeHV.add(textField);
	
	JLabel lblNewLabel_5_2 = new JLabel("Họ tên:");
	lblNewLabel_5_2.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
	lblNewLabel_5_2.setBounds(565, 111, 71, 20);
	TieuDeHV.add(lblNewLabel_5_2);
	
	JButton btnNewButton_2_4 = new JButton("Tìm kiếm");
	btnNewButton_2_4.setForeground(Color.WHITE);
	btnNewButton_2_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_4.setBackground(new Color(36, 0, 72));
	btnNewButton_2_4.setBounds(779, 140, 92, 32);
	TieuDeHV.add(btnNewButton_2_4);
	
	JLabel lblNewLabel_3 = new JLabel("Học viên");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblNewLabel_3.setBounds(399, 10, 150, 100);
	TieuDeHV.add(lblNewLabel_3);
	
	cbbSapXepHV = new JComboBox();
	cbbSapXepHV.setBounds(299, 140, 98, 32);
	TieuDeHV.add(cbbSapXepHV);
	
	JPanel panel_2 = new JPanel();
	panel_2.setLayout(null);
	panel_2.setBackground(SystemColor.activeCaption);
	panel_2.setBounds(997, -14, 306, 693);
	PanelHocVien.add(panel_2);
	
	
	JLabel lblNewLabel_6_2 = new JLabel("MaHV");
	lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_2.setBounds(23, 174, 64, 30);
	panel_2.add(lblNewLabel_6_2);
	
	JLabel lblNewLabel_6_1_4 = new JLabel("Name");
	lblNewLabel_6_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_4.setBounds(23, 243, 64, 22);
	panel_2.add(lblNewLabel_6_1_4);
	
	JLabel lblNewLabel_7_1 = new JLabel("THONG TIN HOC VIEN");
	lblNewLabel_7_1.setForeground(new Color(128, 255, 255));
	lblNewLabel_7_1.setFont(new Font("Tahoma", Font.ITALIC, 28));
	lblNewLabel_7_1.setBounds(0, 31, 306, 93);
	panel_2.add(lblNewLabel_7_1);
	
	JLabel lblNewLabel_6_1_1_1 = new JLabel("NamSinh");
	lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_1_1.setBounds(23, 308, 79, 22);
	panel_2.add(lblNewLabel_6_1_1_1);
	
	JLabel lblNewLabel_6_1_2_1 = new JLabel("GioiTinh");
	lblNewLabel_6_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_2_1.setBounds(23, 371, 64, 22);
	panel_2.add(lblNewLabel_6_1_2_1);
	
	JLabel lblNewLabel_6_1_3_1_1 = new JLabel("TinhTrang");
	lblNewLabel_6_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_3_1_1.setBounds(15, 512, 87, 22);
	panel_2.add(lblNewLabel_6_1_3_1_1);
	
	JLabel lblNewLabel_6_1_3_2_1 = new JLabel("SDT");
	lblNewLabel_6_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_6_1_3_2_1.setBounds(23, 436, 64, 22);
	panel_2.add(lblNewLabel_6_1_3_2_1);
	
	txtNhapMaHV = new JTextField();
	txtNhapMaHV.setColumns(10);
	txtNhapMaHV.setBounds(109, 174, 151, 30);
	panel_2.add(txtNhapMaHV);
	
	txtNhapTenHV = new JTextField();
	txtNhapTenHV.setColumns(10);
	txtNhapTenHV.setBounds(109, 243, 151, 30);
	panel_2.add(txtNhapTenHV);
	
	txtNhapNamSinhHV = new JTextField();
	txtNhapNamSinhHV.setColumns(10);
	txtNhapNamSinhHV.setBounds(109, 308, 151, 30);
	panel_2.add(txtNhapNamSinhHV);
	
	txtNhapSDTHV = new JTextField();
	txtNhapSDTHV.setColumns(10);
	txtNhapSDTHV.setBounds(109, 435, 151, 30);
	panel_2.add(txtNhapSDTHV);
	
	
	JButton btnResetHV = new JButton("Reset");
	btnResetHV.setForeground(Color.WHITE);
	btnResetHV.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnResetHV.setBackground(new Color(36, 0, 72));
	btnResetHV.setBounds(111, 630, 82, 40);
	panel_2.add(btnResetHV);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(112, 510, 148, 30);
	panel_2.add(comboBox);
	
	JRadioButton rdbtMaleHV = new JRadioButton("Male");
	rdbtMaleHV.setBounds(109, 371, 53, 25);
	panel_2.add(rdbtMaleHV);
	
	JRadioButton rdbtFemaleHV = new JRadioButton("Female");
	rdbtFemaleHV.setBounds(178, 371, 72, 25);
	panel_2.add(rdbtFemaleHV);
	
	ButtonGroup group1 = new ButtonGroup();
	group1.add(rdbtFemaleHV);
	group1.add(rdbtMaleHV);
	
	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(38, 320, 870, 319);
	PanelHocVien.add(scrollPane_1);
	
	tableHV = new JTable();
	scrollPane_1.setViewportView(tableHV);
	tableHV.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"maHV", "name", "namSinh", "gioiTinh", "SDT", "tinhTrang"
		}
	));
	
	JPanel PanelLopHoc = new JPanel();
	PanelLopHoc.setLayout(null);
	tabbedPane.addTab("New tab", null, PanelLopHoc, null);
	
	JPanel TieuDeLH = new JPanel();
	TieuDeLH.setBackground(new Color(135, 123, 191));
	TieuDeLH.setBounds(0, 78, 1069, 194);
	PanelLopHoc.add(TieuDeLH);
	TieuDeLH.setLayout(null);
	
	JButton btnNewButton_2_1_2 = new JButton("Thêm mới");
	btnNewButton_2_1_2.setBounds(10, 140, 117, 32);
	btnNewButton_2_1_2.setForeground(Color.WHITE);
	btnNewButton_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_1_2.setBackground(new Color(36, 0, 72));
	TieuDeLH.add(btnNewButton_2_1_2);
	
	JButton btnNewButton_2_6 = new JButton("Sửa");
	btnNewButton_2_6.setBounds(137, 140, 71, 32);
	btnNewButton_2_6.setForeground(Color.WHITE);
	btnNewButton_2_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_6.setBackground(new Color(36, 0, 72));
	TieuDeLH.add(btnNewButton_2_6);
	
	JButton btnNewButton_2_2_2 = new JButton("Xóa");
	btnNewButton_2_2_2.setBounds(218, 140, 71, 32);
	btnNewButton_2_2_2.setForeground(Color.WHITE);
	btnNewButton_2_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_2_2.setBackground(new Color(36, 0, 72));
	TieuDeLH.add(btnNewButton_2_2_2);
	
	Choice choice_3 = new Choice();
	choice_3.setBounds(306, 154, 92, 18);
	TieuDeLH.add(choice_3);
	
	JLabel lblNewLabel_5_4 = new JLabel("Sắp xếp:");
	lblNewLabel_5_4.setBounds(321, 128, 71, 20);
	lblNewLabel_5_4.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
	TieuDeLH.add(lblNewLabel_5_4);
	
	Choice choice_1_2 = new Choice();
	choice_1_2.setBounds(408, 154, 159, 18);
	TieuDeLH.add(choice_1_2);
	
	JLabel lblNewLabel_5_1_2 = new JLabel("Hiển thị theo danh sách lớp:");
	lblNewLabel_5_1_2.setBounds(409, 128, 196, 20);
	lblNewLabel_5_1_2.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_1_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
	TieuDeLH.add(lblNewLabel_5_1_2);
	
	JButton btnNewButton_2_3_2 = new JButton("Hiển thị");
	btnNewButton_2_3_2.setBounds(582, 140, 92, 32);
	btnNewButton_2_3_2.setForeground(Color.WHITE);
	btnNewButton_2_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_3_2.setBackground(new Color(36, 0, 72));
	TieuDeLH.add(btnNewButton_2_3_2);
	
	TextField textField_2 = new TextField();
	textField_2.setBounds(755, 151, 179, 21);
	TieuDeLH.add(textField_2);
	
	JLabel lblNewLabel_5_2_2 = new JLabel("Họ tên:");
	lblNewLabel_5_2_2.setBounds(755, 128, 71, 20);
	lblNewLabel_5_2_2.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_2_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
	TieuDeLH.add(lblNewLabel_5_2_2);
	
	JButton btnNewButton_2_4_2 = new JButton("Tìm kiếm");
	btnNewButton_2_4_2.setBounds(949, 140, 92, 32);
	btnNewButton_2_4_2.setForeground(Color.WHITE);
	btnNewButton_2_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_4_2.setBackground(new Color(36, 0, 72));
	TieuDeLH.add(btnNewButton_2_4_2);
	
	JLabel lblNewLabel_4 = new JLabel("Lớp học");
	lblNewLabel_4.setBounds(393, 31, 150, 100);
	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
	TieuDeLH.add(lblNewLabel_4);
	
	JPanel PanelBienLai = new JPanel();
	PanelBienLai.setLayout(null);
	tabbedPane.addTab("New tab", null, PanelBienLai, null);
	
	JPanel TieuDeBL = new JPanel();
	TieuDeBL.setLayout(null);
	TieuDeBL.setBackground(new Color(135, 123, 191));
	TieuDeBL.setBounds(0, 120, 1069, 193);
	PanelBienLai.add(TieuDeBL);
	
	JButton btnNewButton_2_1_2_1 = new JButton("Thêm mới");
	btnNewButton_2_1_2_1.setForeground(Color.WHITE);
	btnNewButton_2_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_1_2_1.setBackground(new Color(36, 0, 72));
	btnNewButton_2_1_2_1.setBounds(10, 140, 117, 32);
	TieuDeBL.add(btnNewButton_2_1_2_1);
	
	JButton btnNewButton_2_6_1 = new JButton("Sửa");
	btnNewButton_2_6_1.setForeground(Color.WHITE);
	btnNewButton_2_6_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_6_1.setBackground(new Color(36, 0, 72));
	btnNewButton_2_6_1.setBounds(137, 140, 71, 32);
	TieuDeBL.add(btnNewButton_2_6_1);
	
	JButton btnNewButton_2_2_2_1 = new JButton("Xóa");
	btnNewButton_2_2_2_1.setForeground(Color.WHITE);
	btnNewButton_2_2_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_2_2_1.setBackground(new Color(36, 0, 72));
	btnNewButton_2_2_2_1.setBounds(218, 140, 71, 32);
	TieuDeBL.add(btnNewButton_2_2_2_1);
	
	Choice choice_3_1 = new Choice();
	choice_3_1.setBounds(306, 154, 92, 18);
	TieuDeBL.add(choice_3_1);
	
	JLabel lblNewLabel_5_4_1 = new JLabel("Sắp xếp:");
	lblNewLabel_5_4_1.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_4_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
	lblNewLabel_5_4_1.setBounds(321, 128, 71, 20);
	TieuDeBL.add(lblNewLabel_5_4_1);
	
	Choice choice_1_2_1 = new Choice();
	choice_1_2_1.setBounds(408, 154, 159, 18);
	TieuDeBL.add(choice_1_2_1);
	
	JLabel lblNewLabel_5_1_2_1 = new JLabel("Hiển thị theo danh sách lớp:");
	lblNewLabel_5_1_2_1.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
	lblNewLabel_5_1_2_1.setBounds(409, 128, 196, 20);
	TieuDeBL.add(lblNewLabel_5_1_2_1);
	
	JButton btnNewButton_2_3_2_1 = new JButton("Hiển thị");
	btnNewButton_2_3_2_1.setForeground(Color.WHITE);
	btnNewButton_2_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_3_2_1.setBackground(new Color(36, 0, 72));
	btnNewButton_2_3_2_1.setBounds(582, 140, 92, 32);
	TieuDeBL.add(btnNewButton_2_3_2_1);
	
	TextField textField_2_1 = new TextField();
	textField_2_1.setBounds(755, 151, 179, 21);
	TieuDeBL.add(textField_2_1);
	
	JLabel lblNewLabel_5_2_2_1 = new JLabel("Họ tên:");
	lblNewLabel_5_2_2_1.setForeground(new Color(36, 0, 72));
	lblNewLabel_5_2_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
	lblNewLabel_5_2_2_1.setBounds(755, 128, 71, 20);
	TieuDeBL.add(lblNewLabel_5_2_2_1);
	
	JButton btnNewButton_2_4_2_1 = new JButton("Tìm kiếm");
	btnNewButton_2_4_2_1.setForeground(Color.WHITE);
	btnNewButton_2_4_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	btnNewButton_2_4_2_1.setBackground(new Color(36, 0, 72));
	btnNewButton_2_4_2_1.setBounds(949, 140, 92, 32);
	TieuDeBL.add(btnNewButton_2_4_2_1);
	
	JLabel lblNewLabel_4_1 = new JLabel("Biên lai");
	lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblNewLabel_4_1.setBounds(419, 43, 150, 100);
	TieuDeBL.add(lblNewLabel_4_1);
	
	
	//SU lI SU KIEN
	
	ActionListener ac = new GiaoVienConTroler(this);
	btnHienThiGV.addActionListener(ac);
	
	this.setVisible(true);
	
}
	
	
}
