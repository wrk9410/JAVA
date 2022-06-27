import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame {
	
	public Main3() {
		JPanel pnl = new JPanel(null); // Panel은 안에 들어오는 컨퍼런트를 플로
		pnl.setPreferredSize(new Dimension(500, 500));

		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
				// 마우스가 버튼 안에 들어온 경우 X, Y좌표를 이동시켜 위치 변경
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 창 크기 고정을 위해 설정
		
	}

	public static void main(String[] args) {
		new Main3().setVisible(true);
	}

}
