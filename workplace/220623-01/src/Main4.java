import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
		private JButton btnEnable;
		private JButton btnDisable;
		private List<JButton> list;

		public Main4() {
			super("버튼 활성화 테스트~");
			JPanel pnl = new JPanel();
			btnEnable = new JButton("활성화");
			btnDisable = new JButton("비활성화");
			JButton btnNotShown = new JButton("보이나??");
			
			btnEnable.addActionListener(this);
			btnDisable.addActionListener(this);
			
//			btnDisable.setEnabled(false); // 비활성화만 됨
			btnNotShown.setVisible(false); // 아예 보이지 않음
			
			pnl.add(btnEnable);
			pnl.add(btnDisable);
			pnl.add(btnNotShown);
			
			for (int i = 1; i <= 5; i++) {
				JButton btn = new 
			}
			
			add(pnl);
			
			setSize(new Dimension(500, 500));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnEnable) {
				for (JButton btn : list) {
					btn.setEnabled(true);
				}
			} else {
				for (JButton btn : list) {
					btn.setEnabled(false);
				}
			}
			
		}





		
		
		
		
//		MAIN
		public static void main(String[] args) {
			new Main4().setVisible(true);
			
			
	}
}
