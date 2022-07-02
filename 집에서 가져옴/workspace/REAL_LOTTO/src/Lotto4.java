import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Lotto4 extends JFrame {
	private RoundedButton[][] resultNum = new RoundedButton[5][6]; // 설정 번호 출력할 버튼 이중 배열
	private JLabel[] resultLbl = new JLabel[5]; // 게임1~5 출력할 라벨 배열
	private RoundedButton[] winningBtn = new RoundedButton[6];
	private RoundedButton bonus;

	public Lotto4() {
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

		JPanel winningPnl = new JPanel();
		winningPnl.setBackground(Color.WHITE);
		winningPnl.setBounds(3, 66, 460, 68);
		getContentPane().add(winningPnl);
		winningPnl.setLayout(null);

		// 당첨번호 버튼 반복문으로 생성
		int w = 12;
		for (int i = 0; i < winningBtn.length; i++) {
			int a = Lotto_info.winnigNum[i];
			winningBtn[i] = new RoundedButton("" + a);
			winningBtn[i].setMargin(new Insets(0, 0, 0, 0));
			winningBtn[i].setForeground(Color.white);
			winningBtn[i].setFont(new Font("굴림", Font.BOLD, 21));
			winningBtn[i].setBackground(Color.BLACK);
			winningBtn[i].setBounds(w, 10, 54, 50);
			w += 60;
			winningPnl.add(winningBtn[i]);
		}
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(362, 14, 45, 44);
		winningPnl.add(lblNewLabel_2);
		// 보너스 번호 버튼 생성
		w += 30;
		int bonus1 = Lotto_info.bonus;
		bonus = new RoundedButton("" + bonus1);
		bonus.setMargin(new Insets(0, 0, 0, 0));
		bonus.setForeground(Color.white);
		bonus.setFont(new Font("굴림", Font.BOLD, 21));
		bonus.setBackground(Color.BLACK);
		bonus.setBounds(w, 10, 54, 50);
		winningPnl.add(bonus);

		RoundedButton btnNewButton_8 = new RoundedButton("다시하기");
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

		// 게임1 버튼 반복으로 작성
		JPanel game1_btn = new JPanel();
		game1_btn.setBackground(Color.WHITE);
		game1_btn.setLayout(null);
		game1_btn.setBounds(97, 20, 327, 59);
		panel_3.add(game1_btn);
		int a = 12;
		for (int i = 0; i < resultNum[0].length; i++) {
			resultNum[0][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[0][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[0][i].setBounds(a, 10, 45, 40);
			a += 52;
			game1_btn.add(resultNum[0][i]);
		}

		// 게임2 버튼 반복으로 작성
		JPanel game2_btn = new JPanel();
		game2_btn.setBackground(Color.WHITE);
		game2_btn.setLayout(null);
		game2_btn.setBounds(97, 89, 327, 59);
		panel_3.add(game2_btn);
		int b = 12;
		for (int i = 0; i < resultNum[1].length; i++) {
			resultNum[1][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[1][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[1][i].setBounds(b, 10, 45, 40);
			b += 52;
			game2_btn.add(resultNum[1][i]);
		}

		// 게임3 버튼 반복으로 작성
		JPanel game3_btn = new JPanel();
		game3_btn.setBackground(Color.WHITE);
		game3_btn.setLayout(null);
		game3_btn.setBounds(97, 158, 327, 59);
		panel_3.add(game3_btn);
		int c = 12;
		for (int i = 0; i < resultNum[2].length; i++) {
			resultNum[2][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[2][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[2][i].setBounds(c, 10, 45, 40);
			c += 52;
			game3_btn.add(resultNum[2][i]);
		}
		// 게임4 버튼 반복으로 작성
		JPanel game4_btn = new JPanel();
		game4_btn.setBackground(Color.WHITE);
		game4_btn.setLayout(null);
		game4_btn.setBounds(97, 230, 327, 59);
		panel_3.add(game4_btn);
		int d = 12;
		for (int i = 0; i < resultNum[3].length; i++) {
			resultNum[3][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[3][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[3][i].setBounds(d, 10, 45, 40);
			d += 52;
			game4_btn.add(resultNum[3][i]);
		}
		// 게임5 버튼 반복으로 작성
		JPanel game5_btn = new JPanel();
		game5_btn.setBackground(Color.WHITE);
		game5_btn.setLayout(null);
		game5_btn.setBounds(97, 299, 327, 59);
		panel_3.add(game5_btn);
		int e = 12;
		for (int i = 0; i < resultNum[4].length; i++) {
			resultNum[4][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[4][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[4][i].setBounds(e, 10, 45, 40);
			e += 52;
			game5_btn.add(resultNum[4][i]);
		}

		// 게임 1~5 라벨 반복 생성
		JPanel game_lbl = new JPanel();
		game_lbl.setBackground(Color.WHITE);
		game_lbl.setBounds(0, 0, 97, 357);
		panel_3.add(game_lbl);
		game_lbl.setLayout(null);
		int f = 33;
		for (int i = 0; i < resultLbl.length; i++) {
			resultLbl[i] = new JLabel("게임" + (i + 1));
			resultLbl[i].setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
			resultLbl[i].setHorizontalAlignment(SwingConstants.CENTER);
			resultLbl[i].setBounds(12, f, 73, 31);
			f += 70;
			game_lbl.add(resultLbl[i]);
		}

		setSize(600, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Lotto4().setVisible(true);
	}
}
