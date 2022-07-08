import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Memo extends JFrame {
	public Memo() {
		getContentPane().setLayout(null);

		JFileChooser chooser = new JFileChooser();

		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 63, 360, 288);
		getContentPane().add(textArea);

		JButton btnOpen = new JButton("열기");
		btnOpen.setBounds(56, 20, 97, 23);
		getContentPane().add(btnOpen);

		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int open = chooser.showOpenDialog(null);
				if (open == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile(); // 열기창에서 선택한 경로를 가져와줌
//					System.out.println(file);
//					String open1 = file.getAbsolutePath(); // file의 경로를 문자열로 받음
					
					BufferedReader br = null;

					try {
						br = new BufferedReader(new FileReader(file));

						String line;
						while ((line = br.readLine()) != null) { // 반환이 null일 경우 br의 끝까지 설정
							textArea.setText(line); // 1번째 줄 가져오고 2번째 줄로 덮어쓰고 3번째 줄로 덮어써서 마지막 줄만 나옴
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						if (br != null) {
							try {
								br.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				}
			}
		});

		JButton btnSave = new JButton("저장");
		btnSave.setBounds(222, 20, 97, 23);
		getContentPane().add(btnSave);

//		btnSave.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int save = chooser.showSaveDialog(null);
//				if (save == JFileChooser.APPROVE_OPTION) {
//					
//				}
//			}
//		});

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}
}
