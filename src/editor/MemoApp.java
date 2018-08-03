/*
 * 1) �˸´� ������ ���� 
 * 2) �� �������� �߻�޼��� ������
 * 3) �̺�Ʈ�ҽ�(�̺�Ʈ�� ����Ų ������Ʈ)�� �����ʿ� ����
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
	JMenuBar bar; //�޴��� ������ �����
	JMenu[] menu=new JMenu[5];
	JMenuItem item_open, item_exit;
	JTextArea area;
	JScrollPane scroll;
	JFileChooser chooser;
	public final static int WIDTH=600;
	
	//����Ʈ����� ���ϸ� �����ϴ� �Է½�Ʈ�� 
	FileReader fis; 
	BufferedReader buffr;//�ܵ����� �����Ҽ�����...
									//��?? ��� ��Ʈ���� ������½�Ʈ���̹Ƿ�
									//����Ʈ ��� ��Ʈ���� ���Ҽ��¾���..
	
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
		chooser = new JFileChooser("E:/incubator/project0802/data");
	
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
		
		//�����ʿ� �̺�Ʈ �ҽ� ���� 
		item_open.addActionListener(this);//�Ű� ����!!
		
		setVisible(true);
		setSize(MemoApp.WIDTH,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MemoApp();

	}	
	public void actionPerformed(ActionEvent e) {
		System.out.println("�� �ҷ���?");
		//������ ������������, Ž����� �����ؼ� ����!!
		int result=chooser.showOpenDialog(this);
		System.out.println(result);
		
		//������ �����ߴٸ�...
		if(result ==JFileChooser.APPROVE_OPTION) {
			File file=chooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			
			//����� ��θ� �̿��Ͽ� ��� ���Ͽ� ���� �ȱ�!!
			try {
				fis = new FileReader(file);
				buffr = new BufferedReader(fis);
				
				System.out.println("��Ʈ�� ���� ����");
				int count=0;
				
				while(true) {
					String data=buffr.readLine();	
					count++;
					//�о���� �����͸� area�� �ݿ�����!!
					//�ڹ��� �⺻ �ڷ������� 1:1 �����Ǵ� ��ü�� ����
					//�Ǵµ� �̷��� Ŭ�������� ������ Wrapper Ŭ����
					//�� �Ѵ�..
					//  int  --> Integer , byte --> Byte
					if(data==null)break; //������ ���ٸ� -1�� ��ȯ				
					area.append(data+"\n");
				}
				System.out.println("count="+count);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				System.out.println("������ ã�� �� �����ϴ�");				
			} catch (IOException e1) {
				System.out.println("������ ���� �� �����ϴ�");
				e1.printStackTrace();
			}
			
		}
	}
}





