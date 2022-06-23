import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel(); // JPanel은 기본값이 Flow이다.
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER); // (기본 중앙 상단에 위치)버튼 위치 변경, FlowLayout.(붙히기 원하는 방향 입력)
//		pnl.setLayout(flow);
//		BorderLayout border = new BorderLayout(); // 버튼의 위치와 크기를 설정하는 것, 기본값: 패널을 가득채움
//		pnl.setLayout(border); // Layout을 보더로 주어 pnl.add(버튼참조변수명, "이동원하는방향")
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS); // X:가로, Y:세로
//		pnl.setLayout(box);
//		GridLayout grid = new GridLayout(2, 2); // 총 버튼 갯수에 맞게 정사각형으로 나눔
//		pnl.setLayout(grid);
//		pnl.setLayout(null);

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

		btn1.setLocation(10, 30); // 버튼 layout 수정 (x, y)
		btn1.setSize(200, 300);

		btn2.setBounds(220, 50, 90, 40); // 버튼 layout 수정 (x, y, withd, height)

		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
//		pnl.add(btn3, "South"); // 맨 마지막에 추가 시킨 것으로 적용됨(덮어씌워짐)

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main6().setVisible(true);
	}

}
