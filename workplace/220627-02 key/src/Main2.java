import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10); // 입력된 문자 자동 마스킹 처리

		JTextArea ta = new JTextArea(20, 20); // 여러줄의 텍스트를 입력 가능
		JScrollPane scrl = new JScrollPane(ta); // 스크롤 사용 가능한 컨퍼넌트 (JTextArea 참조변수)

		pnl.add(tf);
		pnl.add(pf);

		add(pnl);
		add(scrl, "South");
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				엔터 누를 때 이벤트 발생
				System.out.println("엔터 누름");
			}
		});

		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int id = e.getID(); // 글자 입력 여부 확인 가능
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);

	}

}
