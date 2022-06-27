import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame {

	public Main2() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼입니다");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
//			MouseListener는 오버라이드를 여러개 해야하기 때문에 필요한 것만 가져올 경우 MouseAdapter 사용
			@Override
			public void mousePressed(MouseEvent e) {
//			Sorce > Override에서 원하는 것만 선택, 생성자는 삭제해도 됨
				System.out.println("마우스 Pressed");
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
