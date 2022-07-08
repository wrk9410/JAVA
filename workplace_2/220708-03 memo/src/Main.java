import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class Main {

	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser(); // 파일 선택하는 다이얼로그 역할을 해준다고 하심
//		chooser.showOpenDialog(null); // 1.'열기' 창 띄어줌
//
//		FileFilter filter = new FileFilter() {
//
//			@Override
//			public String getDescription() {
//				return "텍스트 파일";
//			}
//
//			@Override
//			public boolean accept(File f) {
//				if (f.isDirectory()) {
//					return true;
//				}
//				return f.getName().endsWith(".txt");
//			}
//		};
//		chooser.setFileFilter(filter);
//		chooser.showOpenDialog(null);

		int result = chooser.showSaveDialog(null); // 2.'저장' 창 띄어줌
		if (result == JFileChooser.APPROVE_OPTION) {
//			System.out.println("저장 버튼 눌렀을 때"); // 열기/저장 버튼의 경우 0을 반환, 취소/닫기의 경우 1을 반환
			
			File file = chooser.getSelectedFile();
			System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath()); // 저장 버튼 눌렀을 때 선택한 파일을 알려줌
		}
	}

}
