import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Lotto23 extends JFrame {
	public Lotto2 lotto2;
	public Lotto3 lotto3;

	public Lotto23() {
		super("REAL LOTTO");
		lotto2 = new Lotto2();
		lotto3 = lotto2.getLt3();

		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, lotto2, lotto3);
		split.setDividerLocation(500);
		add(split);

		// lotto2의 돈벌러가기 버튼 액션 -> GetMoney로 연결
		lotto2.moneybtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GetMoney money = new GetMoney(Lotto23.this);
				money.setVisible(true);
			}
		});

		// lotto3의 결과보기버튼 액션 -> Lotto4로 연결
		lotto3.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Lotto_info.isArrsEmpty(Lotto_info.allGame)) {
					JOptionPane.showMessageDialog(lotto3, "게임을 구매하셔야 결과를 볼 것 아닙니까\n예?");
				} else {
					Lotto4 lt4 = new Lotto4(Lotto23.this);
					lt4.winNbangLbl(lt4.allCheck(Lotto_info.allGame));
					lt4.allGameInBtn();
					lt4.winNbangSetText();
					lt4.setVisible(true); // 여기서 새 인스턴스로 Lotto4만들어야 작성한 allGame값 받아옴
					lt4.plusMoney();
					// lt4 꺼진후의 흐름 (oneGame allGame 초기화 하고 넘어옴)
					dispose();
					new Lotto23().setVisible(true);
				}
			}
		});

		setResizable(false);
		setSize(1000, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 안먹네..?
	}

	public static void main(String[] args) {
		new Lotto23().setVisible(true);

	}
}
