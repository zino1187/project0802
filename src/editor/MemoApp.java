package editor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoApp extends JFrame{
	JMenuBar bar; //메뉴가 얹혀질 막대기
	JMenu[] menu=new JMenu[5];
	JMenuItem item_open, item_exit;
	JTextArea area;
	JScrollPane scroll;
	
	public MemoApp() {
		bar = new JMenuBar();
		menu[0] = new JMenu("파일");
		menu[1] = new JMenu("편집");
		menu[2] = new JMenu("서식");
		menu[3] = new JMenu("보기");
		menu[4] = new JMenu("도움말");
		item_open = new JMenuItem("파일열기");
		item_exit=new JMenuItem("종료");
		area = new JTextArea();
		scroll = new JScrollPane(area);
	
		//조립시작
		
		//메뉴아이템들을 메뉴에 부착하자 
		menu[0].add(item_open);
		menu[0].add(item_exit);
		
		//바에 메뉴들 붙이기
		for(int i=0;i<menu.length;i++) {
			bar.add(menu[i]);
		}
		//바를 프레임에 붙이자,,, 주의 bar는 특별하기 때문에
		//윈도우 레이아웃과 독립적으로 언제나 위에 붙는다
		setJMenuBar(bar);
		//프레임의 센터에 스크롤 부착 
		add(scroll,BorderLayout.CENTER); //CENTER 는 디폴트 이므로 명시생략
		setVisible(true);
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MemoApp();

	}

}



