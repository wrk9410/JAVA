import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		MouseListener listener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				누른 상태에서 땔 경우 실행
				System.out.println("마우스 버튼을 땜");
			}

			@Override
			public void mousePressed(MouseEvent e) {
//				마우스를 누르고 있을 경우 지속 유지(실행)
				System.out.println("마우스 버튼을 누름");
			}
//			클릭의 경우 Pressed와 Relased 2개로 자주 씀
//			설정을 하지않을 경우 좌,우,중앙 클릭 상관없이 적용

			@Override
			public void mouseExited(MouseEvent e) {
//				올려둔 마우스가 빠져나갔는지 (OUT HOVER)
				System.out.println("EXIT!!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
//				마우스를 올려뒀는지(HOVER)
				System.out.println("ENTER!!");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
//				사용자 pc마다 클릭 판정을 내는 기준이 달라, Pressed와 Released를 설정하면 잘 안될 수도 있음
//				더블 클릭과 같은 여러번 클릭은 Clicked에서 설정

				switch (e.getButton()) { // 좌,우,중앙 설정 | 상수로 지정되어있음
				case MouseEvent.BUTTON1:
					System.out.println("1번");
					break;
				case MouseEvent.BUTTON2:
					System.out.println("2번");
					break;
				case MouseEvent.BUTTON3:
					System.out.println("3번");
					break;
				}
				// 좌클릭이 맞는지 확인(중앙, 우클릭도 확인 가능), 정확하게 좌,우,중앙 클릭 확인 가능
				System.out.println("왼쪽 버튼인가요? " + SwingUtilities.isLeftMouseButton(e));

				if (e.getClickCount() == 2) {
					System.out.println("더블 클릭!!");
				}
			}
		};

		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
//			마우스가 움직이는 좌표 확인
				System.out.println("마우스가 움직입니다~." + e.getX() + "," + e.getY());
			}

			@Override
			public void mouseDragged(MouseEvent e) {

			}
		};

		JPanel pnl = new JPanel();
		// Panel에 MouseListener 동작 설정하기
//		pnl.addMouseListener(listener);
		// Panel에 MouseMotionListener 동작 설정하기
		pnl.addMouseMotionListener(motion);

		add(pnl);

//		창 크기 및 기본 설정할 때 필수
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);

	}

}
