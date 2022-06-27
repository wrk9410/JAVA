import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test1 extends JFrame {

	private String id1, pass1;

	public Test1() {
		CardLayout layout = new CardLayout();
		
//		로그인 전 패널
		JPanel pnl = new JPanel();
		JPanel pnl1 = new JPanel(); // 아이디 입력 패널
		JPanel pnl2 = new JPanel(); // 비밀번호 입력 패널
		JLabel lbl = new JLabel("ID ");
		JTextField id = new JTextField(20);
		JLabel lbl2 = new JLabel("PASS ");
		JPasswordField pass = new JPasswordField(20);
		JButton btn = new JButton("로그인");
		JButton btn_reg = new JButton("회원가입");
		
		JPanel pnl_all = new JPanel(layout);

		id1 = "green123";
		pass1 = "green1234";
		
//		로그인 전 패널
		// 아이디 입력
		pnl1.add(lbl);
		pnl1.add(id);
		// 비밀번호 입력
		pnl2.add(lbl2);
		pnl2.add(pass);
		pnl.add(pnl1);
		pnl.add(pnl2);
		// 로그인 버튼
		pnl.add(btn);
		// 회원가입 버튼
		pnl.add(btn_reg);
//		로그인 완료 후 패널
		JPanel pnl_done = new JPanel();
		JLabel lbl_done = new JLabel("로그인 완료");
		pnl_done.add(lbl_done);
//		회원가입 패널
		HashMap map = new HashMap();
		JPanel pnl_reg = new JPanel();
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		pnl_reg.setLayout(flow);
		
		JLabel lbl_reg = new JLabel("아이디 ");
		JTextField id_reg = new JTextField(10);
		JLabel lbl2_reg = new JLabel("비밀번호 ");
		JPasswordField pass_reg = new JPasswordField(10);
		JLabel lbl3_reg = new JLabel("비밀번호 확인 ");
		JPasswordField pass_reg2 = new JPasswordField(10);
		JButton btn2_reg = new JButton("가입완료");
		
		pnl_reg.add(lbl_reg);
		pnl_reg.add(id_reg);
		pnl_reg.add(lbl2_reg);
		pnl_reg.add(pass_reg);
		pnl_reg.add(lbl3_reg);
		pnl_reg.add(pass_reg2);
		pnl_reg.add(btn2_reg);
		
//		cardlayout
		pnl_all.add(pnl, "로그인 전");
		pnl_all.add(pnl_done, "로그인 완료");
		pnl_all.add(pnl_reg, "회원가입");
		
		

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals(id1) && pass.getText().equals(pass1)) {
					System.out.println("로그인 가능");
					layout.show(pnl_all, "로그인 완료");
				} else {
					System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				}
			}
		});
		
		btn_reg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.show(pnl_all, "회원가입");
			}
		});
		
		btn2_reg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (map.containsKey(id_reg.getText())) {
					System.out.println("중복된 아이디 입니다.");
				} else if (pass_reg.getText().equals(pass_reg2.getText())) {
					if (4 <= pass_reg.getText().length() && pass_reg.getText().length() <= 12) {
						map.put(id_reg.getText(), pass_reg.getText());
						layout.show(pnl_all, "로그인 전");
						id_reg.setText("");
						pass_reg.setText("");
						pass_reg2.setText("");
					} else {
						System.out.println("비밀번호 4자 이상, 12자 이하 입력");
						// 팝업으로 띄우기
					}
				} else {
					System.out.println("입력한 비번과 다릅니다.");
				}
			}
		});

		
		add(pnl_all);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		ActionListener act = new ActionListener() {
//		같은 ActionListener 참조로 다른 동작을 한 번에 가능하게 해줌
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (e.getActionCommand().equals("로그인")) {
//					System.out.println("로그인 커맨드");
//				}
//				if (e.getSource() == btn) {
//					System.out.println("로그인 버튼 참조");
//				} else {
//					System.out.println("회원가입");
//				}
//			}
//		};
//		btn.addActionListener(act);
//		btn2.addActionListener(act);
	}

	public static void main(String[] args) {
		new Test1().setVisible(true);
	}

}
