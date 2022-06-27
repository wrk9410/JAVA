import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {

	private int x, y;

	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");

		x = 100;
		y = 100;
//		lbl.getX();
		lbl.setBounds(x, y, 50, 50);
		pnl.add(lbl);

		add(pnl);

//		 키보드 입력으로 이벤트 발생
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter()/* 필요한 것만 빼서 Override할 때 Listener 대신 Adapter */ {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode(); // 문자 외의 누른 키의 code 확인 가능

				if (code == KeyEvent.VK_LEFT) { // KP_ : 키패드(숫자자판)
//					System.out.println("왼쪽 화살표 누름");
//					lbl.setLocation(x -= 10, y);

					x -= 5;
				} else if (code == KeyEvent.VK_RIGHT) {
//					lbl.setLocation(x += 10, y);
					x += 5;
				} else if (code == KeyEvent.VK_UP) {
//					lbl.setLocation(x, y -= 10);
					y -= 5;
				} else if (code == KeyEvent.VK_DOWN) {
//					lbl.setLocation(x, y += 10);
					y += 5;
				}
				lbl.setLocation(x, y);

//				char c = e.getKeyChar(); // 클릭한 문자 저장 (Ctrl 출력안됨)
//				lbl.setText(String.valueOf(c)); // 클릭한 문자 출력
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
