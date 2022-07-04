import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chunsik extends JDialog  {
	int num1;
	int num2;
	int result = 0;

	ImageIcon img = new ImageIcon("REAL_LOTTO/images/춘식17.png");
	ImageIcon img22 = new ImageIcon("REAL_LOTTO/images/춘식18.png");
	ImageIcon img33 = new ImageIcon("REAL_LOTTO/images/춘식19.png");

	Map<Integer, ImageIcon> pic1 = new HashMap<>();
	Map<Integer, ImageIcon> pic2 = new HashMap<>();
	
	public Chunsik(JDialog owner) {
		setModal(true); //★부가창이 켜져있는 동안에는 다른창과는 상호작용 할 수 없게끔 막아둠 -> ★super(frame이름(주요창), 모달값t/f);라는 JDialog의 생성자로도 가능
		setTitle("춘식이 찾기"); //JDialog는 super로 제목 받는게 아니라 setTitle로 ㄱㄱ
		
		setSize(400, 284);

		JPanel pnl = new JPanel(); // 큰패널
		getContentPane().add(pnl);
		pnl.setLayout(null);

		JPanel lftPnl = new JPanel();
		lftPnl.setBackground(new Color(250, 250, 210));
		lftPnl.setBounds(12, 10, 141, 222);
		pnl.add(lftPnl);
		lftPnl.setLayout(null);
		JLabel lftlbl = new JLabel("오늘의 춘식");
		lftlbl.setFont(new Font("휴먼엑스포", Font.PLAIN, 14));
		lftlbl.setBounds(30, 153, 83, 38);
		lftPnl.add(lftlbl);

		JLabel lftlbl2 = new JLabel("  Click ");
		lftlbl2.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		lftlbl2.setBounds(36, 53, 65, 65);
		lftPnl.add(lftlbl2);

		JPanel topPnl = new JPanel();
		topPnl.setBackground(new Color(250, 250, 210));
		topPnl.setBounds(165, 10, 207, 222);
		pnl.add(topPnl);
		topPnl.setLayout(null);

		JLabel toplbl1 = new JLabel("     1");
		toplbl1.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		toplbl1.setBounds(44, 47, 55, 55);
		topPnl.add(toplbl1);

		JLabel toplbl2 = new JLabel("    2");
		toplbl2.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		toplbl2.setBounds(111, 47, 55, 55);
		topPnl.add(toplbl2);

		JLabel toplbl3 = new JLabel("     3");
		toplbl3.setBounds(22, 112, 55, 55);
		toplbl3.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		topPnl.add(toplbl3);

		JLabel toplbl4 = new JLabel("    4");
		toplbl4.setBounds(79, 112, 55, 55);
		toplbl4.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		topPnl.add(toplbl4);

		JLabel toplbl5 = new JLabel("    5");
		toplbl5.setBounds(140, 112, 55, 55);
		toplbl5.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		topPnl.add(toplbl5);

		JLabel lblNewLabel = new JLabel("오늘의 춘식이가 3개 나오면 당첨!");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		lblNewLabel.setBounds(22, 177, 201, 38);
		topPnl.add(lblNewLabel);

		lftlbl2.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {

				if (count == 0) {
					pic1.put(1, img);
					pic1.put(2, img22);
					pic1.put(3, img33);
					Random random = new Random();
					num1 = random.nextInt(3) + 1;
					count++;
					ImageIcon icon = pic1.get(num1);
					lftlbl2.setIcon(icon);
				}
			}
		});

		toplbl1.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (num1 == 1 || num1 == 2 || num1 == 3) { // 춘식이 있을때
					if (count == 0) {
						pic2.put(1, img);
						pic2.put(2, img22);
						pic2.put(3, img33);
						Random random = new Random();
						num2 = random.nextInt(3) + 1;
						count++;
						ImageIcon icon = pic2.get(num2);
						toplbl1.setIcon(icon);
						if (num1 == num2) {
							result++;
						}
					}
				} else {
					JOptionPane.showMessageDialog(Chunsik.this, "오늘의 춘식이를 확인해주세요"); // 춘식이 없을
				}

			}
		});
		toplbl2.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (num1 == 1 || num1 == 2 || num1 == 3) {
					if (count == 0) {
						pic2.put(1, img);
						pic2.put(2, img22);
						pic2.put(3, img33);
						Random random = new Random();
						num2 = random.nextInt(3) + 1;
						count++;
						ImageIcon icon = pic2.get(num2);
						toplbl2.setIcon(icon);
						if (num1 == num2) {
							result++;
						}
					}
				} else {
					JOptionPane.showMessageDialog(Chunsik.this, "오늘의 춘식이를 확인해주세요");
				}

			}
		});
		toplbl3.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (num1 == 1 || num1 == 2 || num1 == 3) { // 오늘의 춘식이 있을때
					if (count == 0) {
						pic2.put(1, img);
						pic2.put(2, img22);
						pic2.put(3, img33);
						Random random = new Random();
						num2 = random.nextInt(3) + 1;
						count++;
						ImageIcon icon = pic2.get(num2);
						toplbl3.setIcon(icon);
						if (num1 == num2) {
							result++;
						}
					}
				} else {
					JOptionPane.showMessageDialog(Chunsik.this, "오늘의 춘식이를 확인해주세요"); // 오늘의 춘식이 없을때
				}

			}
		});
		toplbl4.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (num1 == 1 || num1 == 2 || num1 == 3) {
					if (count == 0) {
						pic2.put(1, img);
						pic2.put(2, img22);
						pic2.put(3, img33);
						Random random = new Random();
						num2 = random.nextInt(3) + 1;
						count++;
						ImageIcon icon = pic2.get(num2);
						toplbl4.setIcon(icon);
						if (num1 == num2) {
							result++;

						}
					}
				} else {
					JOptionPane.showMessageDialog(Chunsik.this, "오늘의 춘식이를 확인해주세요");
				}

			}
		});
		toplbl5.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (num1 == 1 || num1 == 2 || num1 == 3) {
					if (count == 0) {
						pic2.put(1, img);
						pic2.put(2, img22);
						pic2.put(3, img33);
						Random random = new Random();
						num2 = random.nextInt(3) + 1;
						count++;
						ImageIcon icon = pic2.get(num2);
						toplbl5.setIcon(icon);
						if (num1 == num2) {
							result++;
						}
						if (result == 3) {
							JOptionPane.showMessageDialog(Chunsik.this, "축 ★ 당첨 ★ 하\n3000원이 충전됩니다");
							Lotto_info.money += 3000;
							dispose();
						} else {
							JOptionPane.showMessageDialog(Chunsik.this, "깡 ~\n다음기회에..");
							dispose();
						}
					}
				} else {
					JOptionPane.showMessageDialog(Chunsik.this, "오늘의 춘식이를 확인해주세요");
				}

			}

		});
		setLocationRelativeTo(owner);
	}

	public static void main(String[] args) {
//		new Chunsik().setVisible(true);
	}
}
