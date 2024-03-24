package ntu_63134463;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppTinhLichAm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtDuongLich;
	private JTextField edtAmLich;
	
	public AppTinhLichAm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 0, 760, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHUYỂN ĐỔI NĂM DƯƠNG LỊCH SANG ÂM LỊCH");
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
		edtDuongLich.setBounds(325, 194, 364, 49);
		contentPane.add(edtDuongLich);
		edtDuongLich.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Năm Âm lịch: ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(71, 390, 205, 33);
		contentPane.add(lblNewLabel_1_1);
		
		edtAmLich = new JTextField();
		edtAmLich.setEditable(false);
		edtAmLich.setEnabled(false);
		edtAmLich.setBounds(325, 374, 364, 49);
		contentPane.add(edtAmLich);
		edtAmLich.setColumns(10);
		
		JButton btnNewButton = new JButton("Chuyển đổi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(510, 286, 179, 45);
		contentPane.add(btnNewButton);
		
	}
}
