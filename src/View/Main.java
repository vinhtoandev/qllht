package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.List;
import java.awt.Button;
import java.awt.TextField;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Quản lí trung tâm học thêm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1352, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 0, 72));
		panel.setBounds(0, 0, 254, 708);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PTAN  ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 33));
		lblNewLabel.setBounds(35, 58, 146, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trung tâm dạy thêm");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(73, 100, 124, 13);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(35, 123, 189, 19);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 102));
		panel_1.setBounds(0, 173, 254, 56);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Giáo viên");
		btnNewButton.setBackground(new Color(51, 0, 120));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 254, 56);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(36, 0, 72));
		panel_1_1.setBounds(0, 228, 254, 56);
		panel.add(panel_1_1);
		
		JButton btnHcVin = new JButton("Học viên");
		btnHcVin.setForeground(new Color(255, 255, 255));
		btnHcVin.setBackground(new Color(36, 0, 72));
		btnHcVin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnHcVin.setBounds(0, 0, 254, 56);
		panel_1_1.add(btnHcVin);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(51, 0, 102));
		panel_1_2.setBounds(0, 283, 254, 56);
		panel.add(panel_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Lớp học");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(51, 0, 120));
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(0, 0, 254, 56);
		panel_1_2.add(btnNewButton_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(36, 0, 72));
		panel_1_1_1.setBounds(0, 338, 254, 56);
		panel.add(panel_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Biên lai");
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(new Color(36, 0, 72));
		btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(0, 0, 254, 56);
		panel_1_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(new Color(147, 0, 73));
		panel_6_1_1.setBounds(0, 675, 254, 33);
		panel.add(panel_6_1_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(254, 0, 1090, 84);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Quản lý");
		lblNewLabel_3.setForeground(new Color(36, 0, 72));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_3.setBounds(677, 0, 100, 84);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(147, 0, 73));
		panel_6.setBounds(966, 0, 50, 84);
		panel_2.add(panel_6);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(135, 123, 191));
		panel_3.setBounds(254, 84, 1090, 182);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Thông tin Học Viên");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_4.setBounds(306, 10, 262, 32);
		panel_3.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2.setBackground(new Color(36, 0, 72));
		btnNewButton_2.setBounds(150, 121, 71, 32);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Thêm mới");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2_1.setBackground(new Color(36, 0, 72));
		btnNewButton_2_1.setBounds(23, 121, 117, 32);
		panel_3.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Xóa");
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2_2.setBackground(new Color(36, 0, 72));
		btnNewButton_2_2.setBounds(231, 121, 71, 32);
		panel_3.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("Sắp xếp:");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(36, 0, 72));
		lblNewLabel_5.setBounds(334, 109, 71, 20);
		panel_3.add(lblNewLabel_5);
		
		Choice choice = new Choice();
		choice.setBounds(319, 135, 92, 18);
		panel_3.add(choice);
		
		JLabel lblNewLabel_5_1 = new JLabel("Hiển thị theo danh sách lớp:");
		lblNewLabel_5_1.setForeground(new Color(36, 0, 72));
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(422, 109, 196, 20);
		panel_3.add(lblNewLabel_5_1);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(421, 135, 159, 18);
		panel_3.add(choice_1);
		
		JButton btnNewButton_2_3 = new JButton("Hiển thị");
		btnNewButton_2_3.setForeground(Color.WHITE);
		btnNewButton_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2_3.setBackground(new Color(36, 0, 72));
		btnNewButton_2_3.setBounds(595, 121, 92, 32);
		panel_3.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("Họ tên:");
		lblNewLabel_5_2.setForeground(new Color(36, 0, 72));
		lblNewLabel_5_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_5_2.setBounds(768, 109, 71, 20);
		panel_3.add(lblNewLabel_5_2);
		
		TextField textField = new TextField();
		textField.setBounds(768, 132, 179, 21);
		panel_3.add(textField);
		
		JButton btnNewButton_2_4 = new JButton("Tìm kiếm");
		btnNewButton_2_4.setForeground(Color.WHITE);
		btnNewButton_2_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2_4.setBackground(new Color(36, 0, 72));
		btnNewButton_2_4.setBounds(962, 121, 92, 32);
		panel_3.add(btnNewButton_2_4);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(254, 265, 1090, 263);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(147, 0, 73));
		panel_6_1.setBounds(66, 0, 47, 263);
		panel_4.add(panel_6_1);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(135, 123, 191));
		panel_5.setBounds(253, 528, 1091, 180);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_2_1_1 = new JButton("In Danh Sách");
		btnNewButton_2_1_1.setBounds(904, 127, 129, 29);
		btnNewButton_2_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_2_1_1.setBackground(new Color(36, 0, 72));
		panel_5.add(btnNewButton_2_1_1);
	}
}