
/*���Ϻ��� ����� GUI ������� �غ���!!*/
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
		bt_ori = new JButton("����ã��");
		t_target = new JTextField(20);
		bt_target = new JButton("����ã��");
		bt_copy= new JButton("�������");
		p_center = new JPanel();
		
		//�гο� ������Ʈ�� ���� 
		//gui - �����̳���(frame, panel)
		//        ��ġ5���� - BorderLayout
		//                        - FlowLayout
		//�Ϲ�������Ʈ
		p_center.add(t_ori);
		p_center.add(bt_ori);
		p_center.add(t_target);
		p_center.add(bt_target);
		
		this.add(p_center);//�������� center
		this.add(bt_copy,BorderLayout.SOUTH);//������ ����
		
		this.setVisible(true);
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		new GUICopy();
	}

}






