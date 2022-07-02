import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Lotto4 extends JFrame {
	private RoundedButton[][] resultNum = new RoundedButton[5][6]; // 설정 번호 출력할 버튼 이중 배열
	private JLabel[] resultLbl = new JLabel[5]; // 게임1~5 출력할 라벨 배열
	private RoundedButton[] winningBtn = new RoundedButton[6];
	private RoundedButton bonus;

	private JLabel[] winNbangLbl = new JLabel[5]; // 등수 출력 라벨 설정 (대수)
//	private String[] winNbang = new String[5]; 작업중
	private int forXset; // for문으로 버튼/라벨 생성 시 x(가로) 수정 (대수)
	private int forYset; // for문으로 버튼/라벨 생성 시 y(세로) 수정 (대수)

//	게임별로 몇 개가 맞았는지 확인해주는 메소드 (대수)
	public int[] allCheck(int[][] allGame) {
		int[] win = Lotto_info.winnigNum;
		int[] arr = new int[5];
//		이슈 : 3개와 4개가 맞을 경우 동일하게 3개만 나오는 이슈 발생
//		해결 : i < allGame.length를 win.length로 변경하여 해결
		for (int i = 0; i < win.length; i++) {
			for (int j = 0; j < 5; j++) {
				boolean bonus = false; // 한 게임 별로 보너스 번호가 있는지 확인
				for (int k = 0; k < 6; k++) {
					if (win[i] == allGame[j][k]) {
						arr[j] += 1;
					} else if (allGame[j][k] == Lotto_info.bonus) {
						bonus = true; // 보너스 번호가 있을 시 참으로 설정
					}
					if (arr[j] == 5 && bonus == true) { // 5개만 맞고 보너스 번호가 있을 경우만 실행
						arr[j] += 2;
					}
				}
			}
		}
		return arr;
	}

//	public void winNbangLbl(int[] checkAll) { // 작업중 winNbangLbl로 보낼 문자열을 게임순서별로 등록 (대수)
//		for (int i = 0; i < checkAll.length; i++) {
//			switch (checkAll[i]) {
//			case 1:
//			case 2:
//				winNbang[i] = "낙첨";
//				break;
//			case 3:
//				winNbang[i] = "5등";
//				break;
//			case 4:
//				winNbang[i] = "4등";
//				break;
//			case 5:
//				winNbang[i] = "3등";
//				break;
//			case 6:
//				winNbang[i] = "1등";
//				break;
//			case 7:
//				winNbang[i] = "2등";
//				break;
//			default:
//				winNbang[i] = "낙첨";
//			}
//		}
//		System.out.println(Arrays.toString(checkAll));
//		System.out.println(Arrays.toString(winNbang));
//	}

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
		forXset = 12;
		for (int i = 0; i < winningBtn.length; i++) {
			int a = Lotto_info.winnigNum[i];
			winningBtn[i] = new RoundedButton("" + a);
			winningBtn[i].setMargin(new Insets(0, 0, 0, 0));
			winningBtn[i].setForeground(Color.white);
			winningBtn[i].setFont(new Font("굴림", Font.BOLD, 21));
			winningBtn[i].setBackground(Color.BLACK);
			winningBtn[i].setBounds(forXset, 10, 54, 50);
			forXset += 60;
			winningPnl.add(winningBtn[i]);
		}
		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(362, 14, 45, 44);
		winningPnl.add(lblNewLabel_2);

		// 보너스 번호 버튼 생성
		forXset += 30;
		int bonus1 = Lotto_info.bonus;
		bonus = new RoundedButton("" + bonus1);
		bonus.setMargin(new Insets(0, 0, 0, 0));
		bonus.setForeground(Color.white);
		bonus.setFont(new Font("굴림", Font.BOLD, 21));
		bonus.setBackground(Color.BLACK);
		bonus.setBounds(forXset, 10, 54, 50);
		winningPnl.add(bonus);

		RoundedButton btnNewButton_8 = new RoundedButton("다시하기");
		btnNewButton_8.setBounds(467, 67, 97, 68);
		getContentPane().add(btnNewButton_8);

//		당첨/낙첨 라벨 시작 (대수)
		JPanel winNbangPnl = new JPanel();
		winNbangPnl.setBackground(Color.WHITE);
		winNbangPnl.setBounds(453, 143, 124, 357);
		getContentPane().add(winNbangPnl);
		winNbangPnl.setLayout(null);

		forYset = 29;

		for (int i = 0; i < winNbangLbl.length; i++) {
			winNbangLbl[i] = new JLabel(/*작업중 winNbang[i]*/); // 등수별로 다른 text 설정
			winNbangLbl[i].setForeground(Color.BLACK);
			winNbangLbl[i].setHorizontalAlignment(SwingConstants.CENTER);
			winNbangLbl[i].setFont(new Font("휴먼매직체", Font.BOLD, 30));
			winNbangLbl[i].setBounds(28, forYset, 60, 40);
			forYset += 70;
			winNbangPnl.add(winNbangLbl[i]);
		}
//		당첨/낙첨 라벨 끝

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
		forXset = 12;
		for (int i = 0; i < resultNum[0].length; i++) {
			resultNum[0][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[0][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[0][i].setBounds(forXset, 10, 45, 40);
			forXset += 52;
			game1_btn.add(resultNum[0][i]);
		}

		// 게임2 버튼 반복으로 작성
		JPanel game2_btn = new JPanel();
		game2_btn.setBackground(Color.WHITE);
		game2_btn.setLayout(null);
		game2_btn.setBounds(97, 89, 327, 59);
		panel_3.add(game2_btn);
		forXset = 12;
		for (int i = 0; i < resultNum[1].length; i++) {
			resultNum[1][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[1][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[1][i].setBounds(forXset, 10, 45, 40);
			forXset += 52;
			game2_btn.add(resultNum[1][i]);
		}

		// 게임3 버튼 반복으로 작성
		JPanel game3_btn = new JPanel();
		game3_btn.setBackground(Color.WHITE);
		game3_btn.setLayout(null);
		game3_btn.setBounds(97, 158, 327, 59);
		panel_3.add(game3_btn);
		forXset = 12;
		for (int i = 0; i < resultNum[2].length; i++) {
			resultNum[2][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[2][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[2][i].setBounds(forXset, 10, 45, 40);
			forXset += 52;
			game3_btn.add(resultNum[2][i]);
		}
		// 게임4 버튼 반복으로 작성
		JPanel game4_btn = new JPanel();
		game4_btn.setBackground(Color.WHITE);
		game4_btn.setLayout(null);
		game4_btn.setBounds(97, 230, 327, 59);
		panel_3.add(game4_btn);
		forXset = 12;
		for (int i = 0; i < resultNum[3].length; i++) {
			resultNum[3][i] = new RoundedButton((i + 1) + "버튼");
			resultNum[3][i].setMargin(new Insets(0, 0, 0, 0));
			resultNum[3][i].setBounds(forXset, 10, 45, 40);
			forXset += 52;
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
		forYset = 33;
		for (int i = 0; i < resultLbl.length; i++) {
			resultLbl[i] = new JLabel("게임" + (i + 1));
			resultLbl[i].setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
			resultLbl[i].setHorizontalAlignment(SwingConstants.CENTER);
			resultLbl[i].setBounds(12, forYset, 73, 31);
			forYset += 70;
			game_lbl.add(resultLbl[i]);
		}

		setSize(600, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Lotto4().setVisible(true);
	}
}
