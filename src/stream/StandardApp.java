/*Ű���忡�� ���ڸ� �Է¹޾Ƽ�, ���Ϸ� �����غ���*/
package stream;

import java.io.IOException;
import java.io.InputStream;

public class StandardApp {

	public static void main(String[] args) {
		/*
		 * Ű����� �ý��ۿ� �����Ҷ�����
		 * �̹� ��Ʈ���� �����ϱ� ������
		 * �����ڰ� ���Ҷ� �����ϰ� �ݴ� �����
		 * �ƴϴ�...�׸��� ���ݱ��� ����Ϳ�
		 * ����Ҷ� ����ؿԴ� System.out ��ü��
		 *��� ��ü�� OutputStream ���� ��� 
		 *��½�Ʈ���� �ֻ��� Ŭ��������..
		 * */
		InputStream is=System.in;
		try {
			while(true) {
				//read() �޼���� �Է��� �Ͼ��
				//���� �����¿� �ִ�...
				int data=is.read();
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("�Ƴ�");
	}
}


