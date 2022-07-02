
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lotto2 extends JPanel {
	private Lotto3 lt3 = new Lotto3();
	public static List<RoundedButton> btnlist = new ArrayList<>();
	public static RoundedButton[] regNums = new RoundedButton[6];
	public static boolean editState = false;
	public static int editNum = -1;
	public int gameNum;
	public int selectState = 0; // 0수동 1자동 2반자동

	public Lotto3 getLt3() {
		return lt3;
	}

	// 해당 숫자가 oneGame에 있는지 없는지 t/f
	private boolean isDupli(int num) {
		for (int i = 0; i < 6; i++) {
			if (Lotto_info.oneGame[i] == num) {
				return true;
			}
		}
		return false;
	}

	// 들어갈 자리 파라미터로 받아서 난수 1~45 중 하나 중복체크 후 oneGame에 넣고 1~45 비활성화
	private void autoGetNum(int index) {
		Random random = new Random();
		int randomNum;
		do { // ★중복이면 또 한번 난수 받아야함~!!
			randomNum = ((random.nextInt(45)) + 1);
		} while (isDupli(randomNum));
		Lotto_info.oneGame[index] = randomNum; // 무조건 새로운 수로 난수 받아서 넣음
		disable(randomNum);
	}

	// int값 받아서 1~45에서 비활성화
	public static void disable(int num) {
		for (RoundedButton btn : btnlist) { // 그 난수 1~45에서 찾아 비활성화 시킴
			if (btn.getText().equals(String.valueOf(num))) {
				btn.setEnabled(false);
			}
		}
	}

	// 라벨에 상태 출력
	public void setLbl(int index) {
		JLabel lbl = lt3.getlblByIndex(index);
		if (selectState == 0) {
			lbl.setText("수동");
		} else if (selectState == 1) {
			lbl.setText("자동");
		} else if (selectState == 2) {
			lbl.setText("반자동");
		}
	}

	// regNums ""로 초기화 (효)
	private void resetRegNums() {
		for (int i = 0; i < 6; i++) {
			regNums[i].setText("");
		}
	}

	// 1~45버튼 true로 초기화 (효)
	private void resetBtns() {
		for (RoundedButton btn : btnlist) {
			btn.setEnabled(true);
		}
	}

	public Lotto2() {
//		super("로또");
//
//		setSize(500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(false); // 창크기 조절 못하게

		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(box);

//		JPanel pnl = new JPanel();// 큰 패널
		JPanel pnl2 = new JPanel();// 로또 입력 패널
		JPanel pnl3 = new JPanel();// 1~45 패널
		JPanel pnl4 = new JPanel();// 자동,반자동,등록 패널

		RoundedButton regNum1 = new RoundedButton(); // 뽑은 로또 번호 보여주기1
		regNum1.setBounds(45, 39, 50, 50);
		RoundedButton regNum2 = new RoundedButton(); // 뽑은 로또 번호 보여주기2
		regNum2.setBounds(112, 39, 50, 50);
		RoundedButton regNum3 = new RoundedButton(); // 뽑은 로또 번호 보여주기3
		regNum3.setBounds(179, 39, 50, 50);
		RoundedButton regNum4 = new RoundedButton(); // 뽑은 로또 번호 보여주기4
		regNum4.setBounds(246, 39, 50, 50);
		RoundedButton regNum5 = new RoundedButton(); // 뽑은 로또 번호 보여주기5
		regNum5.setBounds(313, 39, 50, 50);
		RoundedButton regNum6 = new RoundedButton(); // 뽑은 로또 번호 보여주기6
		regNum6.setBounds(380, 39, 50, 50);

		regNums[0] = regNum1; // 뽑은 로또 번호 보여주는 버튼을 배열에 담아놓기
		regNums[1] = regNum2;
		regNums[2] = regNum3;
		regNums[3] = regNum4;
		regNums[4] = regNum5;
		regNums[5] = regNum6;

		regNum1.setActionCommand("0"); // regNum.getText()는 들어있는 숫자
		regNum2.setActionCommand("1"); // regNum.getActionCommand()는 해당 인덱스
		regNum3.setActionCommand("2");
		regNum4.setActionCommand("3");
		regNum5.setActionCommand("4");
		regNum6.setActionCommand("5");

		// 1~45누르면 regNum으로 보내는 action (효)
		ActionListener pushNum = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int indexNum = Lotto_info.findIndexNum(); // 이거 돌려서 indexNum 원하는 값으로 집어넣은 후에
				if (indexNum != -1) { // 6칸 꽉차서 -1이 반환되지 않을 때
					((AbstractButton) e.getSource()).setEnabled(false); // 버튼 비활성화 만들고
					Lotto_info.oneGame[indexNum] = Integer.valueOf(((AbstractButton) e.getSource()).getText()); // 버튼에적힌숫자를
																												// oneGame[indexNum]에넣음
					regNums[indexNum].setText(((AbstractButton) e.getSource()).getText()); // 버튼에 적힌 숫자를
																							// regNums[indexNum]에 넣음
//					System.out.println(Arrays.toString(Lotto_info.oneGame)); //oneGame에 잘 들어가는지 확인용
				} else { // 6칸이 꽉차서 -1이 반환될 때
					JOptionPane.showMessageDialog(Lotto2.this, "꽉찼다~");
				}

			}
		};

		// 1~45버튼에 action달기 (소)
		for (int i = 1; i <= 45; i++) {
			RoundedButton numBox = new RoundedButton(String.valueOf(i));
			RoundedButton a = new RoundedButton(String.valueOf(i));
			a.bgSetter(new Color(255, 182, 53));
			a.fSetter(new Color(0, 0, 0));
			numBox = a;
			pnl3.add(numBox); // 1~45번 번호
			btnlist.add(numBox);
			numBox.addActionListener(pushNum);
		}

		// regNum을 누르면 수정하는 action (효)
		ActionListener pushRegNum = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (RoundedButton a : btnlist) { // 공란 만들기 전에 regNum에 있던 숫자찾아서 1~45에서 비활성화 풀기
					if (((AbstractButton) e.getSource()).getText().equals(a.getText())) {
						a.setEnabled(true);
						break;
					}
				}
				((AbstractButton) e.getSource()).setText(""); // 누른 regNum 공란처리
				int index = Integer.valueOf(e.getActionCommand());
				Lotto_info.oneGame[index] = 0;
			}
		};

		// regNum에 action달기 (효)
		regNum1.addActionListener(pushRegNum);
		regNum2.addActionListener(pushRegNum);
		regNum3.addActionListener(pushRegNum);
		regNum4.addActionListener(pushRegNum);
		regNum5.addActionListener(pushRegNum);
		regNum6.addActionListener(pushRegNum);

		// RoundedButton 위치, 크기조절 (소)
		RoundedButton btnAuto = new RoundedButton("자동");
		btnAuto.bgSetter(new Color(255, 255, 224));
		btnAuto.fSetter(new Color(0, 0, 0));
		btnAuto.setBounds(82, 5, 81, 36);
		RoundedButton btnSAuto = new RoundedButton("반자동");
		btnSAuto.bgSetter(new Color(255, 255, 224));
		btnSAuto.fSetter(new Color(0, 0, 0));
		btnSAuto.setBounds(194, 5, 87, 36);
		RoundedButton btnEnter = new RoundedButton("등록");
		btnEnter.bgSetter(new Color(255, 255, 224));
		btnEnter.fSetter(new Color(0, 0, 0));
		btnEnter.setBounds(315, 5, 95, 36);

		// 자동btn에 action달기 (효)
		btnAuto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0; // 0이면 자동 돌고, 1이면 자동 안돔
				if (!Lotto_info.isArrEmpty(Lotto_info.oneGame)) { // oneGame이 비어있지 않은 상태에서 자동으로 돌리면 안내창 생성
					result = JOptionPane.showConfirmDialog(Lotto2.this, "이미 입력한 번호가 지워지고 모든 번호가 자동으로 부여됩니다\n진행하시겠습니까?",
							"자동확인", JOptionPane.YES_NO_OPTION);
//					System.out.println(result); // yes=0, no=1
				}
				if (result == 0) {
					Lotto_info.resetOneGame(); // oneGame비우고
					resetRegNums(); // regNum도 비우고
					resetBtns(); // btns도 다 활성화
					for (int i = 0; i < 6; i++) {
						autoGetNum(i); // oneGame 1~6까지 전부 자동으로 부여 <- 6번만 돌려도 되는게, 메소드 안에서 중복이면 계속 난수생성함. 1~45비활성화
					}
					Lotto_info.arrToButton(Lotto_info.oneGame, regNums);// oneGame을 regNum에다 출력
					if (editState) { // 수정을 통해 넘어온 애라는 소리~!
						gameNum = editNum; // 몇번째 게임인지 인덱스 구하기
					} else {
						gameNum = Lotto_info.findGameNum();
					}
					selectState = 1;
				}
			}
		});

		// 반자동btn에 action달기 (효)
		btnSAuto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Lotto_info.isArrEmpty(Lotto_info.oneGame)) { // 이게 true일때는(싹다 비워져 있을 때) 자동버튼 누르라고 안내
					JOptionPane.showMessageDialog(Lotto2.this, "자동버튼을 이용하세요");
				} else {
					int index = Lotto_info.findIndexNum(); // for문의 시작점만 findIndexNum()로 찾은 인덱스 넣어주면 됨
					if (index != -1) { // 빈공간 존재
						do {
							autoGetNum(index); // 들어갈 자리 파라미터로 받아서 난수 1~45 중 하나 중복체크 후 oneGame에 넣고, 해당 번호 비활성화
							index = Lotto_info.findIndexNum();
						} while (index != -1);
					} else { // -1일때(빈공간 없는데 반자동 돌릴 때) 상황
						JOptionPane.showMessageDialog(Lotto2.this, "이미 모든 번호를 선택하셨습니다");
					}
					Lotto_info.arrToButton(Lotto_info.oneGame, regNums);// oneGame을 regNum에다 출력

					if (editState) { // 수정을 통해 넘어온 애라는 소리~!
						gameNum = editNum; // 몇번째 게임인지 인덱스 구하기

					} else {
						gameNum = Lotto_info.findGameNum();
					}
					selectState = 2;
				}
			}
		});

		// 등록하기btn에 action달기 (효)
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Lotto_info.checkOneGame()) { // oneGame 값 확인 후 다 차있는지 확인 true면 중괄호 안으로
//					lt3.setVisible(true);
					Arrays.sort(Lotto_info.oneGame);

					boolean goStop = true;
					if (editState) { // 수정을 통해 넘어온 애라는 소리~!
						gameNum = editNum; // 몇번째 게임인지 인덱스 구하기
						lt3.getPnlByIndex(gameNum).setBackground(new Color(240, 240, 240));// pnl색상 원상복귀
						editState = false; // 등록하기 눌러야만 수정모드에서 빠져나옴
					} else {
						gameNum = Lotto_info.findGameNum(); // 몇번째 게임인지 인덱스 구하기
						if (gameNum == -1) {
							goStop = false;
							JOptionPane.showMessageDialog(Lotto2.this, "더이상 게임을 구매하실 수 없습니다");
						}
					}
					if (goStop) {
						Lotto_info.oneGameToAllGame(gameNum); // allGame 인덱스에 oneGame넣기
						Lotto_info.arrToButton(Lotto_info.oneGame, lt3.getBtnsByIndex(gameNum));// oneGame을 lt3의 해당게임
																								// btns에 넣기
						setLbl(gameNum);
					}
					Lotto_info.resetOneGame(); // oneGame 초기화
					resetBtns();// 1~45버튼 다 활성화
					resetRegNums(); // regNum도 초기화
					selectState = 0; // 자동 반자동 수동도 수동으로 초기화
				} else {
					JOptionPane.showMessageDialog(Lotto2.this, "숫자 6개를 선택한 후 등록해주세요");
				}
			}
		});

//		pnl.setLayout(box);
		pnl2.setLayout(null);
		pnl2.add(regNum1);
		pnl2.add(regNum2);
		pnl2.add(regNum3);
		pnl2.add(regNum4);
		pnl2.add(regNum5);
		pnl2.add(regNum6);
		pnl4.setLayout(null);
		pnl4.add(btnAuto);
		pnl4.add(btnSAuto);
		pnl4.add(btnEnter);

		add(pnl2);
		add(pnl3);
		add(pnl4);

		// JLabel을 통해 도움말 보기 생성
		JLabel lblNewLabel = new JLabel("※ 도움말 보기");
		lblNewLabel.setBounds(401, 108, 81, 36);
		pnl4.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() { // 도움말 누르면 dialogㅗ 뜸(소)

			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Lotto2.this,
						" \n 자동: 6개의 번호가 랜덤으로 뽑힙니다.\n 반자동: 원하는 개수를 선택 후 남은 칸을 랜덤 숫자로 채워드립니다. \n 바꾸고자하는 번호를 누르면 수정할 수 있습니다.\n");

			}
		});
	}

	public static void main(String[] args) {
		new Lotto2().setVisible(true);
	}
}
