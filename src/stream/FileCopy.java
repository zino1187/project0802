/*
���� Ŭ������ �������, ���ϴ� ������
�о���� ��, �� ������ ������ ���ϴ�
������ ����غ���!! = ����

����� ��� ������ �̷�� �ִ� ������ ����Ʈ 
������ �о�鿩 �������� �״�� �����ϴ� ����..
*/
package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy{
	int y;//��������� �����Ϸ��� ���� �ʱ�ȭ�ȴ�...
			//��, �����ڰ� ���ϴ� ��츸...
	public static void main(String[] args){
		//���������� �����Ϸ��� �ʱ�ȭ���� �ʴ´�!!
		int x=0;
		//�ڹ��� ������ �ƹ��� �ùٸ��� ������
		//����� �ܺ� ���ο� ���� ���α׷��� ������
		//����� ���� �ִ�..�̷��� ��� ���ܶ� �ϸ�
		//�ڹٿ����� ���� ������ ����ó���� �ݵ��
		//ó���ؾ� �������� �Ϸ�ȴ�..
		
		String path="E:/incubator/project0802/data/memo.txt";
		FileInputStream fis=null;
		FileOutputStream fos=null;		
		
		try{
			fis=new FileInputStream(path);
			System.out.println("���� ��Ʈ�� ���� ����!!");
			
			//1byte �� ����ϴ� ��Ʈ��!!
			//����̶�? �������� ���α׷����� �����Ͱ� �����°�
			//������½�Ʈ����, ������ ȣ��� ��(empty) ������ �����س���
			fos=new FileOutputStream("E:/incubator/project0802/data/memo_copy.txt");
			
			//��Ʈ���� ������ ������ �������, 1����Ʈ��
			//�� ���α׷����� �о�鿩 ����!!
			while(true){
				int data=fis.read(); //1byte ����
				if(data==-1)break;//�������� ���� ������ ����Ż��
				System.out.print(data);
				//�о���� ����Ʈ�� �ٽ� ������!!(���)
				fos.write(data);
			}
			// �� ����� ��Ʈ���� �ݱ� 
			
		}catch(FileNotFoundException e){
			//catch���� �μ��� ������ ��ü��
			//�ڹٰ���ӽ��� �ش� ���ܰ� �߻�������
			//�� ������ ��ü�� ����� �����ڿ���
			//������ �ذ��̴�..���� �����ڴ�
			//���ܿ� ���� ������ ���޹��� e ������
			//�̿��Ͽ� ó���ϸ� �ȴ�...
			e.printStackTrace();
			System.out.println("������ ã�� �� �����ϴ�..");
		}catch(IOException e){
			System.out.println("������ �д��� ������ �߻��߾��..");
		}finally {
			//�پ� ��Ʈ���̳� �����ͺ��̽��� ������ �ݾƾ� 
			//�ϹǷ� finally ������ ó���Ѵ�!!
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}



