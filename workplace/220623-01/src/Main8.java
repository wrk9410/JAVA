import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8 extends JFrame {
	private int ans = 0;
	
	public Main8() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();

		GridLayout box = new GridLayout(2, 2);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		setTitle("퀴즈");
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		JLabel lbl = new JLabel("1 + 2 = ?");
		JTextField tf1 = new JTextField(20);
		JButton btn = new JButton("확인");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ans = tf1.getText();
				if(ans.equals("3")) {
					JOptionPane.showMessageDialog(Main8.this, "정답입니다!");
				} else {
					JOptionPane.showMessageDialog(Main8.this, "틀렸습니다!");
				}
			}
		});

		pnlTop.add(lbl);
		pnlBottom.add(tf1);
		pnlBottom.add(btn);

		add(pnlBox);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main8().setVisible(true);
	}

}
