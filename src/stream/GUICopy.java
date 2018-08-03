
/*파일복사 기능을 GUI 기반으로 해보자!!*/
package stream;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUICopy extends JFrame{
	JTextField t_ori;
	JButton bt_ori;
	JTextField t_target;
	JButton bt_target;
	JButton bt_copy;
	JPanel p_center;
	
	public GUICopy() {
		t_ori = new JTextField(20);
		bt_ori = new JButton("파일찾기");
		t_target = new JTextField(20);
		bt_target = new JButton("파일찾기");
		bt_copy= new JButton("복사실행");
		p_center = new JPanel();
		
		//패널에 컴포넌트를 부착 
		//gui - 컨테이너형(frame, panel)
		//        배치5가지 - BorderLayout
		//                        - FlowLayout
		//일반컴포넌트
		p_center.add(t_ori);
		p_center.add(bt_ori);
		p_center.add(t_target);
		p_center.add(bt_target);
		
		this.add(p_center);//윈도우의 center
		this.add(bt_copy,BorderLayout.SOUTH);//윈도우 남쪽
		
		this.setVisible(true);
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		new GUICopy();
	}

}






