package editor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoApp extends JFrame{
	JMenuBar bar; //�޴��� ������ �����
	JMenu[] menu=new JMenu[5];
	JMenuItem item_open, item_exit;
	JTextArea area;
	JScrollPane scroll;
	
	public MemoApp() {
		bar = new JMenuBar();
		menu[0] = new JMenu("����");
		menu[1] = new JMenu("����");
		menu[2] = new JMenu("����");
		menu[3] = new JMenu("����");
		menu[4] = new JMenu("����");
		item_open = new JMenuItem("���Ͽ���");
		item_exit=new JMenuItem("����");
		area = new JTextArea();
		scroll = new JScrollPane(area);
	
		//��������
		
		//�޴������۵��� �޴��� �������� 
		menu[0].add(item_open);
		menu[0].add(item_exit);
		
		//�ٿ� �޴��� ���̱�
		for(int i=0;i<menu.length;i++) {
			bar.add(menu[i]);
		}
		//�ٸ� �����ӿ� ������,,, ���� bar�� Ư���ϱ� ������
		//������ ���̾ƿ��� ���������� ������ ���� �ٴ´�
		setJMenuBar(bar);
		//�������� ���Ϳ� ��ũ�� ���� 
		add(scroll,BorderLayout.CENTER); //CENTER �� ����Ʈ �̹Ƿ� ��û���
		setVisible(true);
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MemoApp();

	}

}



