import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setActionCommand("임의의 커맨드"); // btn1은 "버튼1"이 아닌 "임의의 커맨드"를 보낸다.

		pnl.add(btn1);
		pnl.add(btn2);

		add(pnl);
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		};

		btn1.addActionListener(listener);
		btn2.addActionListener(listener);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}

}
