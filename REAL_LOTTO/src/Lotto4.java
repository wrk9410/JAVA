import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sun.xml.internal.ws.api.Component;

public class Lotto4 extends JDialog {
	private RoundedButton[] winningBtn = new RoundedButton[6]; // 당첨번호 출력 버튼 배열
	private JLabel[] resultLbl = new JLabel[5]; // 게임1~5 출력할 라벨 배열
	private JPanel[] game_btn = new JPanel[5]; // 게임 1~5 까지의 등록 번호 확인할 수 있는 버튼을 담을 패널 배열
	private RoundedButton[][] resultNum = new RoundedButton[5][6]; // 게임 1~5 까지의 등록 숫자 출력 버튼 이중 배열
	private RoundedButton bonus; // 보너스 번호 출력 버튼

	private JLabel[] winNbangLbl = new JLabel[5]; // 등수 출력 라벨 설정 (대수)
	private String[] winNbang = new String[5]; // 게임별 순위 텍스트 저장 배열
	private int forXset; // for문으로 버튼/라벨 생성 시 x(가로) 수정 (대수)
	private int forYset; // for문으로 버튼/라벨 생성 시 y(세로) 수정 (대수)

//	게임별로 몇 개가 맞았는지 확인해주는 메소드 (대수)
	public int[] allCheck(int[][] allGame) {
		int[] win = Lotto_info.winnigNum;
		int[] arr = new int[5];
		int[][] bonusEnbled = new int[5][2]; // 게임별로 보너스 번호가 있는 인덱스 저장을 위한 배열
//		이슈 : 3개와 4개가 맞을 경우 동일하게 3개만 나오는 이슈 발생
//		해결 : i < allGame.length를 win.length로 변경하여 해결
		for (int i = 0; i < win.length; i++) {
			for (int j = 0; j < 5; j++) {
				boolean bonus = false; // 한 게임 별로 보너스 번호가 있는지 확인
				for (int k = 0; k < 6; k++) {
					if (win[i] == allGame[j][k]) {
						arr[j] += 1;
						resultNum[j][k].setEnabled(true);
						resultNum[j][k].setBackground(Color.GREEN);
					} else if (allGame[j][k] == Lotto_info.bonus) {
						bonus = true; // 보너스 번호가 있을 시 참으로 설정
						bonusEnbled[j][0] = j;
						bonusEnbled[j][1] = k;
					} else if (allGame[j][k] == 0) { // allGame이 비어있는 index의 arr은 -1로 설정하여 미등록 상태 확인 용도
						arr[j] -= 1;
					}
					if (arr[j] == 5 && bonus == true) { // 5개만 맞고 보너스 번호가 있을 경우만 실행
						arr[j] += 2;
						int first = bonusEnbled[j][0];
						int second = bonusEnbled[j][1];
						resultNum[first][second].setEnabled(true); // 2등이 된 보너스 번호 버튼 활성화
					}
				}
			}
		}
		return arr;
	}

	// 게임순서에 따라 winNbang에 등수저장하는 메소드 (대수)
	public void winNbangLbl(int[] allCheck) {
		for (int i = 0; i < allCheck.length; i++) {
			switch (allCheck[i]) {
			case 0:
			case 1:
			case 2:
				winNbang[i] = "낙첨";
				break;
			case 3:
				winNbang[i] = "5등";
				Lotto_info.money += 5000;
				break;
			case 4:
				winNbang[i] = "4등";
				Lotto_info.money += 50000;
				break;
			case 5:
				winNbang[i] = "3등";
				Lotto_info.money += 1000000;
				break;
			case 6:
				winNbang[i] = "1등";
				Lotto_info.money += 10000000;
				break;
			case 7:
				winNbang[i] = "2등";
				Lotto_info.money += 5000000;
				break;
			default:
				winNbang[i] = "미등록";
			}
		}
	}

	// 게임별 당첨 등수 라벨 설정 메소드
	public void winNbangSetText() {
		for (int i = 0; i < winNbangLbl.length; i++) {
			winNbangLbl[i].setText(winNbang[i]);
			if (winNbang[i].equals("낙첨")) {
				winNbangLbl[i].setForeground(Color.BLUE);
			} else {
				winNbangLbl[i].setForeground(Color.RED);
			}
		}
	}

	// 게임별 등록한 번호 확인
	public void allGameInBtn() {
		for (int i = 0; i < resultNum.length; i++) {
			for (int j = 0; j < resultNum[i].length; j++) {
				if (Lotto_info.allGame[i][j] == 0) { // allGame에 값이 없을 경우 0 대신 미등록(빨간색) 글자 표시
					resultNum[i][j].setEnabled(false);
				} else {
					// allGame에 값이 있을 경우 해당 값으로 텍스트 설정
					resultNum[i][j].setText(Integer.toString(Lotto_info.allGame[i][j]));
				}
			}
		}
	}

	// 당첨 횟수 및 총 당첨 금액 확인 문구
	public void plusMoney() {
		boolean[] rank = new boolean[5];
		String text = "";
		int money = 0;
		int a = 0;

		for (int i = 0; i < winNbang.length; i++) {
			a++;
			if (winNbang[i].equals("1등")) {
				rank[0] = true;
				money += 10000000;
			} else if (winNbang[i].equals("2등")) {
				rank[1] = true;
				money += 5000000;
			} else if (winNbang[i].equals("3등")) {
				rank[2] = true;
				money += 3000000;
			} else if (winNbang[i].equals("4등")) {
				rank[3] = true;
				money += 50000;
			} else if (winNbang[i].equals("5등")) {
				rank[4] = true;
				money += 5000;
			} else {
				rank[i] = false;
				a--;
			}
		}
		for (int i = 0; i < winNbang.length; i++) {
			if (rank[i] == true) {
				text += (i + 1) + "등 당첨\n";
			} else if (a == 0 && i == 4) {
				text = "다음 기회에...\n";
			}
		}
		text += "총 당첨금: " + money + "원";
		JOptionPane.showMessageDialog(this, text);
	}

	public Lotto4(JFrame owner) {
		setModal(true);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JLabel title = new JLabel("로또결과");
		title.setForeground(Color.RED);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("굴림", Font.BOLD, 18));
		title.setBounds(250, 4, 83, 31);
		getContentPane().add(title);

		JLabel title2 = new JLabel("★이번주 당첨번호★");
		title2.setFont(new Font("굴림", Font.PLAIN, 15));
		title2.setHorizontalAlignment(SwingConstants.CENTER);
		title2.setBounds(216, 31, 154, 25);
		getContentPane().add(title2);

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
		JLabel plus_lbl = new JLabel("+");
		plus_lbl.setFont(new Font("굴림", Font.PLAIN, 35));
		plus_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		plus_lbl.setBounds(362, 14, 45, 44);
		winningPnl.add(plus_lbl);

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

		RoundedButton restart = new RoundedButton("다시하기");
		restart.setBounds(467, 67, 97, 68);
		getContentPane().add(restart);

		// 다시하기 클릭 액션 설정
		restart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Lotto_info.resetGame();
				dispose();
			}
		});

//		당첨/낙첨 라벨 시작 (대수)
		JPanel winNbangPnl = new JPanel();
		winNbangPnl.setBackground(Color.WHITE);
		winNbangPnl.setBounds(440, 143, 124, 357);
		getContentPane().add(winNbangPnl);
		winNbangPnl.setLayout(null);

		forYset = 29;
		for (int i = 0; i < winNbangLbl.length; i++) {
			winNbangLbl[i] = new JLabel();
			winNbangLbl[i].setForeground(Color.BLACK);
			winNbangLbl[i].setHorizontalAlignment(SwingConstants.CENTER);
			winNbangLbl[i].setFont(new Font("휴먼매직체", Font.BOLD, 30));
			winNbangLbl[i].setBounds(28, forYset, 80, 40);
			forYset += 70;
			winNbangPnl.add(winNbangLbl[i]);
		}
//		당첨/낙첨 라벨 끝

//		게임1~5, 1~5 개별 등록번호 라벨, 버튼 넣어두는 패널
		JPanel gameAll_pnl = new JPanel();
		gameAll_pnl.setBackground(Color.WHITE);
		gameAll_pnl.setBounds(18, 139, 426, 357);
		getContentPane().add(gameAll_pnl);
		gameAll_pnl.setLayout(null);

		// 등록한 게임별 로또번호 출력할 버튼 반복 생성
		forXset = 12;
		forYset = 20;
		for (int i = 0; i < resultNum.length; i++) {
			game_btn[i] = new JPanel();
			game_btn[i].setBackground(Color.WHITE);
			game_btn[i].setLayout(null);
			game_btn[i].setBounds(97, forYset, 327, 59);
			gameAll_pnl.add(game_btn[i]);
			for (int j = 0; j < resultNum[i].length; j++) {
				resultNum[i][j] = new RoundedButton();
				resultNum[i][j].setMargin(new Insets(0, 0, 0, 0));
				resultNum[i][j].setBounds(forXset, 10, 48, 50);
				resultNum[i][j].setEnabled(false);
				forXset += 52;
				game_btn[i].add(resultNum[i][j]);
			}
			forXset = 12;
			forYset += 70;
		}

		// 게임 1~5 라벨 반복 생성
		JPanel game_pnl = new JPanel();
		game_pnl.setBackground(Color.WHITE);
		game_pnl.setBounds(0, 0, 97, 357);
		gameAll_pnl.add(game_pnl);
		game_pnl.setLayout(null);

		forYset = 33;
		for (int i = 0; i < resultLbl.length; i++) {
			resultLbl[i] = new JLabel("게임" + (i + 1));
			resultLbl[i].setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 21));
			resultLbl[i].setHorizontalAlignment(SwingConstants.CENTER);
			resultLbl[i].setBounds(12, forYset, 73, 31);
			forYset += 70;
			game_pnl.add(resultLbl[i]);
		}

//		닫기 버튼 클릭 시 프로그램 전체 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int answer = JOptionPane.showConfirmDialog(Lotto4.this, "정말 종료하시겠습니까?", "confirm",
						JOptionPane.YES_NO_OPTION); // 프로그램 닫기 여부 확인
				if (answer == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else { // YES가 아닐 경우 실행
					JOptionPane.showMessageDialog(Lotto4.this, "종료를 취소합니다.");
				}
			}
		});

		setSize(600, 550);
		setLocationRelativeTo(owner);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
//		new Lotto4().setVisible(true);
	}
}
