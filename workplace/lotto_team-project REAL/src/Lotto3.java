import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lotto3 extends JFrame {
	public Lotto3() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 54, 421, 60);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("게임 1");
		lblNewLabel_1.setFont(new Font("궁서체", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(12, 22, 46, 15);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(109, 9, 40, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(161, 9, 40, 40);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(213, 9, 40, 40);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setBounds(265, 9, 40, 40);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setBounds(317, 9, 40, 40);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("");
		btnNewButton_1_5.setBounds(369, 9, 40, 40);
		panel.add(btnNewButton_1_5);
		
		JLabel lblNewLabel_2 = new JLabel("수동");
		lblNewLabel_2.setBounds(60, 22, 37, 15);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 124, 421, 60);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("게임 2");
		lblNewLabel_1_1.setBounds(12, 23, 36, 15);
		lblNewLabel_1_1.setFont(new Font("궁서체", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_6 = new JButton("");
		btnNewButton_1_6.setBounds(109, 10, 40, 40);
		panel_1.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBounds(161, 10, 40, 40);
		panel_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setBounds(213, 10, 40, 40);
		panel_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("");
		btnNewButton_1_3_1.setBounds(265, 10, 40, 40);
		panel_1.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_4_1 = new JButton("");
		btnNewButton_1_4_1.setBounds(317, 10, 40, 40);
		panel_1.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_5_1 = new JButton("");
		btnNewButton_1_5_1.setBounds(369, 10, 40, 40);
		panel_1.add(btnNewButton_1_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("반자동");
		lblNewLabel_2_1.setBounds(60, 23, 37, 15);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 194, 421, 60);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("게임 3");
		lblNewLabel_1_1_1.setFont(new Font("궁서체", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(12, 20, 36, 15);
		panel_2.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_7 = new JButton("");
		btnNewButton_1_7.setBounds(109, 10, 40, 40);
		panel_2.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setBounds(161, 10, 40, 40);
		panel_2.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("");
		btnNewButton_1_2_2.setBounds(213, 10, 40, 40);
		panel_2.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setBounds(265, 10, 40, 40);
		panel_2.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_4_2 = new JButton("");
		btnNewButton_1_4_2.setBounds(317, 10, 40, 40);
		panel_2.add(btnNewButton_1_4_2);
		
		JButton btnNewButton_1_5_2 = new JButton("");
		btnNewButton_1_5_2.setBounds(369, 10, 40, 40);
		panel_2.add(btnNewButton_1_5_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("자동");
		lblNewLabel_2_1_1.setBounds(60, 20, 37, 15);
		panel_2.add(lblNewLabel_2_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 264, 421, 60);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("게임 4");
		lblNewLabel_1_1_2.setFont(new Font("궁서체", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(12, 20, 36, 15);
		panel_3.add(lblNewLabel_1_1_2);
		
		JButton btnNewButton_1_8 = new JButton("");
		btnNewButton_1_8.setBounds(109, 10, 40, 40);
		panel_3.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_1_3 = new JButton("");
		btnNewButton_1_1_3.setBounds(161, 10, 40, 40);
		panel_3.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("");
		btnNewButton_1_2_3.setBounds(213, 10, 40, 40);
		panel_3.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_3_3 = new JButton("");
		btnNewButton_1_3_3.setBounds(265, 10, 40, 40);
		panel_3.add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_4_3 = new JButton("");
		btnNewButton_1_4_3.setBounds(317, 10, 40, 40);
		panel_3.add(btnNewButton_1_4_3);
		
		JButton btnNewButton_1_5_3 = new JButton("");
		btnNewButton_1_5_3.setBounds(369, 10, 40, 40);
		panel_3.add(btnNewButton_1_5_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("자동");
		lblNewLabel_2_1_2.setBounds(60, 20, 37, 15);
		panel_3.add(lblNewLabel_2_1_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 334, 421, 60);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("게임 5");
		lblNewLabel_1_1_3.setFont(new Font("궁서체", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(12, 20, 36, 15);
		panel_4.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton_1_9 = new JButton("");
		btnNewButton_1_9.setBounds(109, 10, 40, 40);
		panel_4.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_1_4 = new JButton("");
		btnNewButton_1_1_4.setBounds(161, 10, 40, 40);
		panel_4.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_2_4 = new JButton("");
		btnNewButton_1_2_4.setBounds(213, 10, 40, 40);
		panel_4.add(btnNewButton_1_2_4);
		
		JButton btnNewButton_1_3_4 = new JButton("");
		btnNewButton_1_3_4.setBounds(265, 10, 40, 40);
		panel_4.add(btnNewButton_1_3_4);
		
		JButton btnNewButton_1_4_4 = new JButton("");
		btnNewButton_1_4_4.setBounds(317, 10, 40, 40);
		panel_4.add(btnNewButton_1_4_4);
		
		JButton btnNewButton_1_5_4 = new JButton("");
		btnNewButton_1_5_4.setBounds(369, 10, 40, 40);
		panel_4.add(btnNewButton_1_5_4);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("수동");
		lblNewLabel_2_1_3.setBounds(60, 20, 37, 15);
		panel_4.add(lblNewLabel_2_1_3);
		
		JButton btnNewButton = new JButton("결과확인");
		btnNewButton.setBounds(161, 404, 97, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("등록완료된 게임목록");
		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 15));
		lblNewLabel.setBounds(143, 21, 155, 23);
		getContentPane().add(lblNewLabel);
		
		pack();
	}
	
	public static void main(String[] args) {
		new Lotto3().setVisible(true);
	}
}
