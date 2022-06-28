import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog {
	private boolean exit;

	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);

		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료"); // true일 경우
		JButton btnNo = new JButton("취소"); // false일 경우

		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
			}
		};

		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);

		pnl.add(btnYes);
		pnl.add(btnNo);

		add(pnl);
		setSize(250, 250);
	}

	public boolean showDialog() {
		setVisible(true);

		return exit;
	}
}

public class Main2 extends JFrame {
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				닫을려고 할 때
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				dialog.setVisible(true);

				int result = JOptionPane.showConfirmDialog(Main2.this
						, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION); // 확인할 수 있는 창													// 창
//				JOptionPane.showInputDialog(Main2.this, "입력창"); // 입력 할 수 있는 창

				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}

			}

//			@Override
//			public void windowOpened(WindowEvent e) {
////				새창이 열렸을 때
//				
//			}
//			@Override
//			public void windowIconified(WindowEvent e) {
//				
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//			@Override
//			public void windowDeactivated(WindowEvent e) {
////				창이 여러개 있을 때 focus가 어디에 있는지
//			}

//			@Override
//			public void windowClosed(WindowEvent e) {
////				닫혔을 때
//			}
//			@Override
//			public void windowActivated(WindowEvent e) {
//			
//			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 닫기 버튼을 누를 때 아무 일도 일어나지 않음
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
