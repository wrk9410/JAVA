import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title); // 내 frame의 제목을 생성자로 수정 가능
		
//		상속을 받았기에 this.은 쓰지않아도 됨
		/*this.*/setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Main2 {
	public static void main(String[] args) {
			MyFrame frame = new MyFrame("나만의 프레임");
			frame.setVisible(true);
				
				
				
			// CLI
				
			// GUI
			// AWT / SWING
			// JavaFX
				// Android
				
				// SWING만 순수한 java코드로 만들 수 있음
				// java에 대한 객체소통을 SWING으로 복습 예정
				
				//창 만들기
//				JFrame frame = new JFrame()/*("제목입니다") 제목설정은 이렇게도 설정가능*/;
//				frame.setTitle("제목입니다"); // 제목 설정 메소드
//				
//				frame.getContentPane().add(new JLabel("Hello World")); // 창 내용 추가
//				
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				
//				frame.setSize(500, 500); // 창의 크기
//				frame.setVisible(true); // 창의 노출 여부
	}
}