import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 감소 버튼

public class MyCounter2 extends JFrame implements ActionListener/*class를 만들지 않고도 이렇게 가능*/ {
	private int number = 0;
	private JButton btn, btn2;
	private JLabel lbl;
	
	public MyCounter2() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		lbl = new JLabel("0"); 
		btn = new JButton("증가");
		btn2 = new JButton("감소");
		
		btn.addActionListener(this);
		// 원래는 aListener의 참조를 넣어준 것이었음 -> aListener
		// implements 되어있으므로 자기 자신에 대한 참조를 알려주면 됨  -> this
		btn2.addActionListener(this);
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		ActionListener aListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				JButton btn = (JButton) e.getSource();
////				if (btn.getText().equals("증가")) {
////					
////				} else {
////					
////				}/*다운 캐스팅을 하여 각 버튼 별로 등록된 Text를 비교하여 확인*/
//				
////				if (e.getSource() == btn) {
////					number++;
////				} else {
////					number--;
////				}
//				
//				lbl.setText(String.valueOf(number));
//			}
//		};
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) { /*btn은 생성자 안에서만 존재하는 지역변수라서 컴파일에러, 지역을 만들기 위해서는  btn을 필드로 만들어야됨*/ 
			number++;
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
