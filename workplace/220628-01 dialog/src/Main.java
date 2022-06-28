import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog /* JFrame과 생성자가 다름, 프레임과 다른 점은 최소화 버튼이 없음 */ {
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true);// 생성자 : '주요 창'을 참조받게 설정 할 수 있음, super(주요 창 참조변수, Modal 값 설정);
//		setModal(true); // '부가 창'이 켜져있을 때 '부가 창'외의 다른 것과 상호작용 불가하게 하는 명령어
		
//		getOwner(); // getter로 '주요 창'의 참조를 얻어낼 수 있음
		setTitle("부가 창"); // 부가적으로 뜨는 창을 dialog라고 부름
		
		tf = new JTextField(10); //Ctrl + 1 필드로 변경
		add(tf, "North");

		JButton btn = new JButton("다른 버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // setVisible(false)와 비슷
			}
		});

		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 부가 창만 닫게 설정하는 것, 이것을 적지 않아도 btn 액션 설정에서 한 것으로 가능
	}
	
	public String showDialog() {
		setVisible(true);
		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");

		JButton btn = new JButton("버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				new SubWindow(Main.this).setVisible(true); // SubWindow(주요창 class명)
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog(); // tf에 입력한 문자열을 가져오는 메소드를 '부가 창'에서 호출 후 result에 저장
				
				System.out.println("이 문장은 언제 호출될까?");
				// Modal 값이 true : '부가 창'이 열리고 나서 닫힐 때 출력
				// Modal 값이 flase : '부가 창'이 열릴 때 실행
				
				btn.setText(result);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼을 눌렀을 때 화면이 닫아지게 설정
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
