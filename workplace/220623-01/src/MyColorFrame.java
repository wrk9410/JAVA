import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener { // 추상적으로 ActionListener를 구현할 수 있다 
	@Override
	public void actionPerformed(ActionEvent e) {
		// 클릭을 할 때 동작할 것을 만드는 메소드
		System.out.println("사용자가 버튼을 클릭 했네요~");
	}
}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel(); // JPanel : 모양은 없지만 다른 컨퍼넌트를 보여주기 위한 것, 빈 판떼기로 생각
		pnl.setBackground(Color.RED); // 판떼기 안에 빨간색을 가득차서 설정
		
//		pnl.add(new JButton("컨테이너 안의 버튼")); // 버튼 클릭 시 이벤트라는 것이 발생
		
//		JButton btn = new JButton("컨테이너 안의 버튼");
//		MyActionListener listener = new MyActionListener();
//		btn.addActionListener(listener); // 클릭 시 콘솔출력
		
		JButton btn = new JButton("컨테이너 안의 버튼");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.BLUE);
			}
		});
		
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);

	}

}
