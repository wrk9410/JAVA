import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JButton button = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		
		/*getContentPane().생략 가능*/setLayout(new FlowLayout());
		/*getContentPane().*/add(button);
		add(button2);
		
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
		
	}

}
