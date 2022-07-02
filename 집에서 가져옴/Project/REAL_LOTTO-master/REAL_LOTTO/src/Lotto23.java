import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Lotto23 extends JFrame{
	public Lotto23() {
		super("REAL LOTTO");
		
		Lotto2 lotto2 = new Lotto2();
		Lotto3 lotto3 = lotto2.getLt3();
		
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, lotto2, lotto3);
		split.setDividerLocation(500);
		add(split);

		setResizable(false);
//		setLocationRelativeTo(null); // 안먹네..?
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 500);
	}
	public static void main(String[] args) {
		new Lotto23().setVisible(true);

	}
}
