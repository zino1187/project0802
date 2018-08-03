/*
 * 1) 알맞는 리스너 선택 
 * 2) 그 리스너의 추상메서드 재정의
 * 3) 이벤트소스(이벤트를 일으킨 컴포넌트)와 리스너와 연결
 * */
package editor;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoApp extends JFrame implements ActionListener{
	JMenuBar bar; //메뉴가 얹혀질 막대기
	JMenu[] menu=new JMenu[5];
	JMenuItem item_open, item_exit;
	JTextArea area;
	JScrollPane scroll;
	JFileChooser chooser;
	public final static int WIDTH=600;
	
	//바이트기반의 파일만 전담하는 입력스트림 
	FileReader fis; 
	BufferedReader buffr;//단독으로 존재할수없다...
									//왜?? 기반 스트림에 덧씌우는스트림이므로
									//바이트 기반 스트림을 피할수는없다..
	
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
		chooser = new JFileChooser("E:/incubator/project0802/data");
	
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
		
		//리스너와 이벤트 소스 연결 
		item_open.addActionListener(this);//신경 연결!!
		
		setVisible(true);
		setSize(MemoApp.WIDTH,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MemoApp();

	}	
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 불렀어?");
		//파일을 지정하지말고, 탐색기로 선택해서 열자!!
		int result=chooser.showOpenDialog(this);
		System.out.println(result);
		
		//파일을 선택했다면...
		if(result ==JFileChooser.APPROVE_OPTION) {
			File file=chooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			
			//얻어진 경로를 이용하여 대상 파일에 빨대 꽂기!!
			try {
				fis = new FileReader(file);
				buffr = new BufferedReader(fis);
				
				System.out.println("스트림 생성 성공");
				int count=0;
				
				while(true) {
					String data=buffr.readLine();	
					count++;
					//읽어들인 데이터를 area에 반영하자!!
					//자바의 기본 자료형마다 1:1 대응되는 객체가 지원
					//되는데 이러한 클래스들을 가리켜 Wrapper 클래스
					//라 한다..
					//  int  --> Integer , byte --> Byte
					if(data==null)break; //읽을게 없다면 -1을 반환				
					area.append(data+"\n");
				}
				System.out.println("count="+count);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				System.out.println("파일을 찾을 수 없습니다");				
			} catch (IOException e1) {
				System.out.println("파일을 읽을 수 없습니다");
				e1.printStackTrace();
			}
			
		}
	}
}





