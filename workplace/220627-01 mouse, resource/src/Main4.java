import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
//	export > Runnable JAR file > (경로선택) 으로 프로그램을 만들 수 있음. 단, 이미지와 같은 리소스(자원)은 위치가 중요하기에 같은 폴더에 있어야 함

	
	
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit(); // 이미지 파일을 쉽게 가져올 수 있음
		
		URL url = Main4.class.getClassLoader().getResource("image/7881630.png"); // .getResource("원하는파일명"); : 해당 경로를 찾을 수 있는 URL로 return
		Image image = kit.getImage(url);
		URL url2 = Main4.class.getClassLoader().getResource("image/7881621.png");
		Image image2 = kit.getImage(url2);
		// src 안에 사진을 넣고 위와 같은 작업을 하면 이미지 파일을 가져올 수 있음
		// 위의 작업은 src 폴더를 기반으로 확인 하는 것이라 현재 image 패키지에 리소스가 있으므로 컴파일에러, (패키지명)/(파일명)과 같이 /로 위치 설정 가능
		// src(소스 코드)와 source folder는 컴파일 시 같은 파일로 인식되어 같은 아이콘일 경우 위의 작업 그대로 사용해도 동일 적용
		
//		Image image = kit.getImage("7881630.png"); // .getImage("사진파일 이름 입력");
//		Image image2 = kit.getImage("7881621.png");
		
		JLabel lbl = new JLabel(new ImageIcon(image));
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
//				기존 등록해둔 사진 마우스 클릭 시 다른 사진 변경
//				클릭 시
				lbl.setIcon(new ImageIcon(image2));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
//				클릭 후 땔 시
				lbl.setIcon(new ImageIcon(image));
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

}
