package ntu_63134463;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSlider;

public class AppTinhLichAm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtDuongLich;
	private JTextField edtAmLich;
	
	public AppTinhLichAm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Chuyển đổi năm Dương lịch qua năm Âm lịch");
		setBounds(100, 100, 774, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 770, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHUYỂN ĐỔI NĂM DƯƠNG LỊCH SANG ÂM LỊCH");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(-11, 0, 761, 156);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Năm Dương lịch: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(71, 210, 205, 33);
		contentPane.add(lblNewLabel_1);
		
		edtDuongLich = new JTextField();
		edtDuongLich.setHorizontalAlignment(SwingConstants.CENTER);
		edtDuongLich.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		edtDuongLich.setBounds(325, 194, 364, 49);
		contentPane.add(edtDuongLich);
		edtDuongLich.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Năm Âm lịch: ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(71, 399, 205, 33);
		contentPane.add(lblNewLabel_1_1);
		
		edtAmLich = new JTextField();
		edtAmLich.setHorizontalAlignment(SwingConstants.CENTER);
		edtAmLich.setEditable(false);
		edtAmLich.setEnabled(false);
		edtAmLich.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		edtAmLich.setBounds(325, 395, 364, 49);
		contentPane.add(edtAmLich);
		edtAmLich.setColumns(10);
		
		JButton btnExchange = new JButton("Chuyển đổi");
		btnExchange.setForeground(new Color(0, 0, 0));
		btnExchange.setBorder(null);
		btnExchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Hàm xử lý
				exchange();
			}
		});
		btnExchange.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExchange.setBounds(511, 302, 179, 45);
		contentPane.add(btnExchange);
		btnExchange.setBackground(Color.GREEN);
		
		JLabel lblNewLabel_2 = new JLabel("Được thực hiện bởi:  Lương Văn Linh");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(216, 524, 380, 40);
		contentPane.add(lblNewLabel_2);
		btnExchange.setVisible(true);
	}
	
	void exchange() {
		
		try {
			String can = "",chi = "", amlich = "";
			String strDuongLich = edtDuongLich.getText();
			int soNamDuong = Integer.parseInt(strDuongLich);
			if (soNamDuong <= 0) {
				 edtAmLich.setText("Năm bạn nhập không hợp lệ!");
			} else {
			switch (soNamDuong % 10) {
	        case 0: can = "Canh";
	            break;
	        case 1: can = "Tân";
	            break;
	        case 2: can = "Nhâm";
	            break;
	        case 3: can = "Quý";
	            break;
	        case 4: can = "Giáp";
	            break;
	        case 5: can = "Ất";
	            break;
	        case 6: can = "Bính";
	            break;
	        case 7: can = "Đinh";
	            break;
	        case 8: can = "Mậu";
	            break;
	        case 9: can = "Kỷ";
	            break;
	    }

	    switch (soNamDuong % 12) {
	        case 0: chi = "Thân";
	            break;
	        case 1: chi = "Dậu";
	            break;
	        case 2: chi = "Tuất";
	            break;
	        case 3: chi = "Hợi";
	            break;
	        case 4: chi = "Tý";
	            break;
	        case 5: chi = "Sửa";
	            break;
	        case 6: chi = "Dần";
	            break;
	        case 7: chi = "Mão";
	            break;
	        case 8: chi = "Thìn";
	            break;
	        case 9: chi = "Tỵ";
	            break;
	        case 10: chi = "Ngọ";
	            break;
	        case 11: chi = "Mùi";
	            break;
	    	}
	    amlich = can + " " + chi;
	    edtAmLich.setText(amlich);
			}
		
		} catch (Exception e) {
			edtAmLich.setText("Năm bạn nhập không hợp lệ!");
		}
}
}
