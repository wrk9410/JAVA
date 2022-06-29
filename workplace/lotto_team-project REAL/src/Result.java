import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;

public class Result extends JFrame {
	public Result() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로또결과");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(250, 4, 83, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("★이번주 당첨번호★");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(216, 31, 154, 25);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(3, 66, 460, 68);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("11");
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 10, 54, 50);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(357, 14, 45, 44);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("11");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_1.setBounds(71, 10, 54, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("11");
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_2.setBounds(130, 10, 54, 50);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("11");
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_3.setBounds(190, 10, 54, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("11");
		btnNewButton_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_4.setBounds(250, 10, 54, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("11");
		btnNewButton_5.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_5.setBounds(309, 10, 54, 50);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("11");
		btnNewButton_6.setMargin(new Insets(2, 0, 0, 0));
		btnNewButton_6.setFont(new Font("굴림", Font.BOLD, 19));
		btnNewButton_6.setBounds(394, 10, 54, 50);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("다시하기");
		btnNewButton_8.setBounds(467, 67, 97, 68);
		getContentPane().add(btnNewButton_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(453, 143, 124, 357);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("당첨");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		lblNewLabel_3.setBounds(28, 26, 57, 41);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("=================");
		lblNewLabel_4.setBounds(0, 73, 121, 15);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("낙첨");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.RED);
		lblNewLabel_3_1.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(29, 98, 57, 41);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("=================");
		lblNewLabel_4_1.setBounds(0, 139, 121, 15);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("당첨");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.BLUE);
		lblNewLabel_3_2.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		lblNewLabel_3_2.setBounds(28, 164, 57, 41);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("================");
		lblNewLabel_4_2.setBounds(0, 211, 121, 15);
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("낙첨");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.RED);
		lblNewLabel_3_3.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		lblNewLabel_3_3.setBounds(28, 236, 57, 41);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("=================");
		lblNewLabel_4_3.setBounds(0, 281, 121, 15);
		panel_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("낙첨");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setForeground(Color.RED);
		lblNewLabel_3_4.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		lblNewLabel_3_4.setBounds(28, 306, 57, 41);
		panel_2.add(lblNewLabel_3_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(18, 139, 426, 357);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(97, 20, 327, 59);
		panel_3.add(panel_1);
		
		JButton btnNewButton_7 = new JButton("11");
		btnNewButton_7.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_7.setBounds(12, 10, 45, 40);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("22");
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setBounds(64, 10, 45, 40);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("33");
		btnNewButton_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1.setBounds(115, 10, 45, 40);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("44");
		btnNewButton_3_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1.setBounds(168, 10, 45, 40);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("55");
		btnNewButton_4_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1.setBounds(221, 10, 45, 40);
		panel_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("66");
		btnNewButton_5_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1.setBounds(273, 10, 45, 40);
		panel_1.add(btnNewButton_5_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(97, 89, 327, 59);
		panel_3.add(panel_1_1);
		
		JButton btnNewButton_7_1 = new JButton("11");
		btnNewButton_7_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_7_1.setBounds(12, 10, 45, 40);
		panel_1_1.add(btnNewButton_7_1);
		
		JButton btnNewButton_1_1_1 = new JButton("22");
		btnNewButton_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1.setBounds(64, 10, 45, 40);
		panel_1_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("33");
		btnNewButton_2_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1_1.setBounds(115, 10, 45, 40);
		panel_1_1.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("44");
		btnNewButton_3_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1_1.setBounds(168, 10, 45, 40);
		panel_1_1.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_4_1_1 = new JButton("55");
		btnNewButton_4_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1_1.setBounds(221, 10, 45, 40);
		panel_1_1.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5_1_1 = new JButton("66");
		btnNewButton_5_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1_1.setBounds(273, 10, 45, 40);
		panel_1_1.add(btnNewButton_5_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(97, 158, 327, 59);
		panel_3.add(panel_1_2);
		
		JButton btnNewButton_7_2 = new JButton("11");
		btnNewButton_7_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_7_2.setBounds(12, 10, 45, 40);
		panel_1_2.add(btnNewButton_7_2);
		
		JButton btnNewButton_1_1_2 = new JButton("22");
		btnNewButton_1_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_2.setBounds(64, 10, 45, 40);
		panel_1_2.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_1_2 = new JButton("33");
		btnNewButton_2_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1_2.setBounds(115, 10, 45, 40);
		panel_1_2.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_3_1_2 = new JButton("44");
		btnNewButton_3_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1_2.setBounds(168, 10, 45, 40);
		panel_1_2.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_4_1_2 = new JButton("55");
		btnNewButton_4_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1_2.setBounds(221, 10, 45, 40);
		panel_1_2.add(btnNewButton_4_1_2);
		
		JButton btnNewButton_5_1_2 = new JButton("66");
		btnNewButton_5_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1_2.setBounds(273, 10, 45, 40);
		panel_1_2.add(btnNewButton_5_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(97, 230, 327, 59);
		panel_3.add(panel_1_3);
		
		JButton btnNewButton_7_3 = new JButton("11");
		btnNewButton_7_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_7_3.setBounds(12, 10, 45, 40);
		panel_1_3.add(btnNewButton_7_3);
		
		JButton btnNewButton_1_1_3 = new JButton("22");
		btnNewButton_1_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_3.setBounds(64, 10, 45, 40);
		panel_1_3.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_2_1_3 = new JButton("33");
		btnNewButton_2_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1_3.setBounds(115, 10, 45, 40);
		panel_1_3.add(btnNewButton_2_1_3);
		
		JButton btnNewButton_3_1_3 = new JButton("44");
		btnNewButton_3_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1_3.setBounds(168, 10, 45, 40);
		panel_1_3.add(btnNewButton_3_1_3);
		
		JButton btnNewButton_4_1_3 = new JButton("55");
		btnNewButton_4_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1_3.setBounds(221, 10, 45, 40);
		panel_1_3.add(btnNewButton_4_1_3);
		
		JButton btnNewButton_5_1_3 = new JButton("66");
		btnNewButton_5_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1_3.setBounds(273, 10, 45, 40);
		panel_1_3.add(btnNewButton_5_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(97, 299, 327, 59);
		panel_3.add(panel_1_4);
		
		JButton btnNewButton_7_4 = new JButton("11");
		btnNewButton_7_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_7_4.setBounds(12, 10, 45, 40);
		panel_1_4.add(btnNewButton_7_4);
		
		JButton btnNewButton_1_1_4 = new JButton("22");
		btnNewButton_1_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_4.setBounds(64, 10, 45, 40);
		panel_1_4.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_2_1_4 = new JButton("33");
		btnNewButton_2_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2_1_4.setBounds(115, 10, 45, 40);
		panel_1_4.add(btnNewButton_2_1_4);
		
		JButton btnNewButton_3_1_4 = new JButton("44");
		btnNewButton_3_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3_1_4.setBounds(168, 10, 45, 40);
		panel_1_4.add(btnNewButton_3_1_4);
		
		JButton btnNewButton_4_1_4 = new JButton("55");
		btnNewButton_4_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4_1_4.setBounds(221, 10, 45, 40);
		panel_1_4.add(btnNewButton_4_1_4);
		
		JButton btnNewButton_5_1_4 = new JButton("66");
		btnNewButton_5_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5_1_4.setBounds(273, 10, 45, 40);
		panel_1_4.add(btnNewButton_5_1_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 97, 357);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("게임1");
		lblNewLabel_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(12, 36, 73, 31);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("게임2");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
		lblNewLabel_5_1.setBounds(12, 104, 73, 31);
		panel_4.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("게임3");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
		lblNewLabel_5_2.setBounds(12, 173, 73, 31);
		panel_4.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("게임4");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
		lblNewLabel_5_3.setBounds(12, 244, 73, 31);
		panel_4.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("게임5");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
		lblNewLabel_5_4.setBounds(12, 310, 73, 31);
		panel_4.add(lblNewLabel_5_4);
		
		
		setSize(600, 550);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Result().setVisible(true);
	}
}
