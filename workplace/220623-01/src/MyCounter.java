import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 감소 버튼

public class MyCounter extends JFrame {
	private int number = 0;
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0"); // JLabel : frame 내의 문자열 표현가능한 인스턴스
//		증가 버튼
		JButton btn = new JButton("증가");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number)); // String.valueOf(정수값 변수) : 정수값을 String으로 출력 시켜줌
				if (number == 10) {
					pnl.setBackground(Color.GREEN);
				}
			}
		});
//		감소 버튼
		JButton btn2 = new JButton("감소");
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number)); // String.valueOf(정수값 변수) : 정수값을 String으로 출력 시켜줌 
				if (number == 10) {
					pnl.setBackground(Color.BLACK);
				}
			}
		});
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(500, 500); // frame의 크기만 개발자들이 하고 나머지들의 크기는 자동으로 설정됨
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}

}
