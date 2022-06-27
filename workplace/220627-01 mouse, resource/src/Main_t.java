import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main_t extends JFrame {
	public Main_t() {
		JPanel pnl = new JPanel();
		JPanel pnl_id = new JPanel();
		JPanel pnl_pass = new JPanel();
		JButton btn = new JButton();
		Toolkit kit = Toolkit.getDefaultToolkit();
		JTextField id = new JTextField(20);
		JTextField pass = new JTextField(20);
		JLabel lbl = new JLabel("ID ");
		JLabel lbl2 = new JLabel("이름 ");
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		
		
		pnl.setLayout(box);
		pnl.add(pnl_id);
		pnl.add(pnl_pass);
		pnl_id.add(lbl);
		pnl_id.add(id);
		pnl_pass.add(lbl2);
		pnl_pass.add(pass);
		
		add(pnl);
		
		pack();
		
//		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Main_t().setVisible(true);
	}
}
