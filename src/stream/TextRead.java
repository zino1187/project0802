/*
 * ���ݱ��� �츮�� ����� ��Ʈ���� 1byte��
 * ó���ϴ� ����̾���...�׷��ٸ� ���� ó��
 * �Ϸ��� ���Ͽ� �ѱ��� ������� ���
 * ��� ó������ ����...
 * ���) ������!!! 
 * ��?) �ѱ��� 2byte�� �𿩼� ǥ���̵ǹǷ� 
 *        �� �Ϻ��� 1byte���� �о �ؼ��Ϸ��ϱ�
 * �ذ�å) ���� ����Ʈ ��� ��Ʈ���� ���ڱ�ݽ�Ʈ
 * 			������ ���׷��̵� �ϸ� �ȴ�...       
 * */
package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextRead {
	FileInputStream fis;//null
	FileReader reader;
	
	String ori="E:/incubator/project0802/data/memo2.txt";
	
	public TextRead() {
		try {
			//fis= new FileInputStream(ori);
			reader= new FileReader(ori);
			int count=0;
			while(true){
				int data=reader.read();
				count++;
				if(data==-1)break;
				System.out.print((char)data);
			}
			System.out.println("read() Ƚ����"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		//�������� ���α׷����� �ѱ��� �о���
		//�� ��� �ǳ� ����!!
		new TextRead();
	}

}







