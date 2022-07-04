import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lotto3 extends JPanel {
	private RoundedButton[] btns1 = new RoundedButton[6];
	private RoundedButton[] btns2 = new RoundedButton[6];
	private RoundedButton[] btns3 = new RoundedButton[6];
	private RoundedButton[] btns4 = new RoundedButton[6];
	private RoundedButton[] btns5 = new RoundedButton[6];
	private JLabel[] lbls = new JLabel[5];
	private JPanel[] pnls = new JPanel[5];
	public RoundedButton btn;

	// index를 파라미터로 받아서, 해당 게임의 pnl로 반환하는 메소드
	public JPanel getPnlByIndex(int index) {
		return pnls[index];
	}

	// index를 파라미터로 받아서, 해당 게임의 lbl로 반환하는 메소드
	public JLabel getlblByIndex(int index) {
		return lbls[index];
	}

	// index를 파라미터로 받아서, 해당 게임의 btns[]로 반환하는 메소드
	public RoundedButton[] getBtnsByIndex(int index) {
		if (index == 0) {
			return btns1;
		} else if (index == 1) {
			return btns2;
		} else if (index == 2) {
			return btns3;
		} else if (index == 3) {
			return btns4;
		} else {
			return btns5;
		}
	}

	// 선택한 패널의 allGame인덱스 알아내기 <- 패널끼리의 동일이 뭔지 알 수가 없어서 pnls에 담아놓고도 못씀,,,
	public int getIndexByPnl(JPanel pnl) {
		if (pnl.getName().equals("pnl1")) {
			return 0;
		} else if (pnl.getName().equals("pnl2")) {
			return 1;
		} else if (pnl.getName().equals("pnl3")) {
			return 2;
		} else if (pnl.getName().equals("pnl4")) {
			return 3;
		} else {
			return 4;
		}
	}

	public Lotto3() {
		setLayout(null);
//		setSize(500,500);

		JLabel lbl = new JLabel("내가 뽑은 번호");
		lbl.setFont(new Font("한컴 훈민정음 가로쓰기", Font.BOLD, 18));
		lbl.setBounds(155, 15, 143, 23);
		add(lbl);

		// 패널 5개 생성
		for (int i = 0; i < 5; i++) {
			JPanel pnl = new JPanel();
			add(pnl);
			pnl.setLayout(null);
			pnls[i] = pnl;
		}
		pnls[0].setBounds(12, 54, 421, 60);
		pnls[1].setBounds(12, 124, 421, 60);
		pnls[2].setBounds(12, 194, 421, 60);
		pnls[3].setBounds(12, 264, 421, 60);
		pnls[4].setBounds(12, 334, 421, 60);

		// 패널에 이름붙이기 <-인덱스 알아낼때 씀
		pnls[0].setName("pnl1");
		pnls[1].setName("pnl2");
		pnls[2].setName("pnl3");
		pnls[3].setName("pnl4");
		pnls[4].setName("pnl5");

		JLabel lbl1 = new JLabel("세트 1");
		lbl1.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 12));
		lbl1.setBounds(12, 22, 46, 15);
		pnls[0].add(lbl1);

		for (int i = 0; i < 6; i++) {
			RoundedButton btn = new RoundedButton("");
			btns1[i] = btn;
			btn.setMargin(new Insets(2, 2, 2, 2));
			pnls[0].add(btn);
		}

		btns1[0].setBounds(109, 10, 40, 40);
		btns1[1].setBounds(161, 10, 40, 40);
		btns1[2].setBounds(213, 10, 40, 40);
		btns1[3].setBounds(265, 10, 40, 40);
		btns1[4].setBounds(317, 10, 40, 40);
		btns1[5].setBounds(369, 10, 40, 40);

		JLabel lbl1_1 = new JLabel();
		lbl1_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lbl1_1.setBounds(60, 22, 37, 15);
		pnls[0].add(lbl1_1);
		lbls[0] = lbl1_1;
		// 여기까지 게임1==============================

		JLabel lbl2 = new JLabel("세트 2");
		lbl2.setBounds(12, 23, 36, 15);
		lbl2.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 12));
		pnls[1].add(lbl2);

		for (int i = 0; i < 6; i++) {
			RoundedButton btn = new RoundedButton("");
			btns2[i] = btn;
			btn.setMargin(new Insets(2, 2, 2, 2));
			pnls[1].add(btn);
		}

		btns2[0].setBounds(109, 10, 40, 40);
		btns2[1].setBounds(161, 10, 40, 40);
		btns2[2].setBounds(213, 10, 40, 40);
		btns2[3].setBounds(265, 10, 40, 40);
		btns2[4].setBounds(317, 10, 40, 40);
		btns2[5].setBounds(369, 10, 40, 40);

		JLabel lbl2_1 = new JLabel();
		lbl2_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lbl2_1.setBounds(60, 23, 37, 15);
		pnls[1].add(lbl2_1);
		lbls[1] = lbl2_1;
		// 여기까지 게임2===============================

		JLabel lbl3 = new JLabel("세트 3");
		lbl3.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 12));
		lbl3.setBounds(12, 20, 36, 15);
		pnls[2].add(lbl3);

		for (int i = 0; i < 6; i++) {
			RoundedButton btn = new RoundedButton("");
			btns3[i] = btn;
			btn.setMargin(new Insets(2, 2, 2, 2));
			pnls[2].add(btn);
		}

		btns3[0].setBounds(109, 10, 40, 40);
		btns3[1].setBounds(161, 10, 40, 40);
		btns3[2].setBounds(213, 10, 40, 40);
		btns3[3].setBounds(265, 10, 40, 40);
		btns3[4].setBounds(317, 10, 40, 40);
		btns3[5].setBounds(369, 10, 40, 40);

		JLabel lbl3_1 = new JLabel();
		lbl3_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lbl3_1.setBounds(60, 20, 37, 15);
		pnls[2].add(lbl3_1);
		lbls[2] = lbl3_1;
		// 여기까지 게임3==============================

		JLabel lbl4 = new JLabel("세트 4");
		lbl4.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 12));
		lbl4.setBounds(12, 20, 36, 15);
		pnls[3].add(lbl4);

		for (int i = 0; i < 6; i++) {
			RoundedButton btn = new RoundedButton("");
			btns4[i] = btn;
			btn.setMargin(new Insets(2, 2, 2, 2));
			pnls[3].add(btn);
		}

		btns4[0].setBounds(109, 10, 40, 40);
		btns4[1].setBounds(161, 10, 40, 40);
		btns4[2].setBounds(213, 10, 40, 40);
		btns4[3].setBounds(265, 10, 40, 40);
		btns4[4].setBounds(317, 10, 40, 40);
		btns4[5].setBounds(369, 10, 40, 40);

		JLabel lbl4_1 = new JLabel();
		lbl4_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lbl4_1.setBounds(60, 20, 37, 15);
		pnls[3].add(lbl4_1);
		lbls[3] = lbl4_1;
		// 여기까지 게임4==============================

		JLabel lbl5 = new JLabel("세트 5");
		lbl5.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 12));
		lbl5.setBounds(12, 20, 36, 15);
		pnls[4].add(lbl5);

		for (int i = 0; i < 6; i++) {
			RoundedButton btn = new RoundedButton("");
			btns5[i] = btn;
			btn.setMargin(new Insets(2, 2, 2, 2));
			pnls[4].add(btn);
		}

		btns5[0].setBounds(109, 10, 40, 40);
		btns5[1].setBounds(161, 10, 40, 40);
		btns5[2].setBounds(213, 10, 40, 40);
		btns5[3].setBounds(265, 10, 40, 40);
		btns5[4].setBounds(317, 10, 40, 40);
		btns5[5].setBounds(369, 10, 40, 40);

		JLabel lbl5_1 = new JLabel();
		lbl5_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lbl5_1.setBounds(60, 20, 37, 15);
		pnls[4].add(lbl5_1);
		lbls[4] = lbl5_1;
		// 여기까지 게임5==============================

		btn = new RoundedButton("결과확인");
		btn.setFont(new Font("한컴 훈민정음 가로쓰기", Font.PLAIN, 13));
		btn.bgSetter(new Color(255, 255, 224));
		btn.fSetter(new Color(0, 0, 0));
		btn.setBounds(168, 408, 97, 23);
		add(btn);

//		결과확인 버튼 클릭 시 결과 창으로 이동
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (Lotto_info.isArrsEmpty(Lotto_info.allGame)) {
//					JOptionPane.showMessageDialog(Lotto3.this, "게임을 구매하셔야 결과를 볼 것 아닙니까\n예?");
//				} else {
//					Lotto4 lt4 = new Lotto4();
//					lt4.winNbangLbl(lt4.allCheck(Lotto_info.allGame));
//					lt4.allGameInBtn();
//					lt4.winNbangSetText();
//					lt4.setVisible(true); // 여기서 새 인스턴스로 Lotto4만들어야 작성한 allGame값 받아옴 +)dialog한다음 madal하면 될듯
//					new Lotto23().setVisible(true);
//				}
//			}
//		});

		// 패널 선택하면 수정하게끔 하는 액션
		MouseListener editNum = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!Lotto2.editState) { // 이미 수정모드가 아닌 상태에서만 받을거임~
					JPanel editedPnl = (JPanel) e.getSource();
					int index = getIndexByPnl(editedPnl);
					RoundedButton[] editedBtns = getBtnsByIndex(index); // 해당패널->해당btns연결
					int[] arr = new int[6];
					Lotto_info.buttonToArr(editedBtns, arr); // 해당btns의 값들을 arr에 넣고
					if (!Lotto_info.isArrEmpty(arr)) { // 비어있지 않아야 중괄호 안으로 들어갈거임
						editedPnl.setBackground(new Color(255, 182, 53)); // 해당패널 하이라이트
						Lotto2.editState = true; // lotto2로 수정상태라는거 넘김
						Lotto2.editNum = index; // lotto2로 어떤패널이 수정인지 index넘김
						int result = 0;
						if (!Lotto_info.isArrEmpty(Lotto_info.oneGame)) { // regNum에 번호 들어있으면 (oneGame에 옮겨져있음)없어질 수도 있다는
																			// 안내창 소환
							result = JOptionPane.showConfirmDialog(Lotto3.this, "수정을 위해서는\n이미 입력한 번호가 지워집니다\n진행하시겠습니까?",
									"수정확인", JOptionPane.YES_NO_OPTION);
//						System.out.println(result); // yes=0, no=1
						}
						if (result == 0) {
							Lotto_info.resetOneGame(); // oneGame칸 비우고
							Lotto_info.buttonToArr(editedBtns, Lotto_info.oneGame); // y면, btn -> oneGame으로 옮기고
							for (int i = 0; i < 6; i++) {
								Lotto2.disable(Lotto_info.oneGame[i]);
							}
							Lotto_info.arrToButton(Lotto_info.oneGame, Lotto2.regNums); // oneGame을 regNum에 출력
						}
					} else {
						JOptionPane.showMessageDialog(Lotto3.this, "수정 할 게임이 없습니다");
					}
				} else {
					JOptionPane.showMessageDialog(Lotto3.this, "이미 수정중인 게임이 있습니다");
				}
			}
		};

		// 패널에 마우스 액션 더하기
		for (JPanel pnl : pnls) {
			pnl.addMouseListener(editNum);
		}
	}

	public static void main(String[] args) {
		new Lotto3().setVisible(true);
	}
}
