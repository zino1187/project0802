/*
���� Ŭ������ �������, ���ϴ� ������
�о���� ��, �� ������ ������ ���ϴ�
������ ����غ���!! = ����

����� ��� ������ �̷�� �ִ� ������ ����Ʈ 
������ �о�鿩 �������� �״�� �����ϴ� ����..
*/
package stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileCopy2{
	public static void main(String[] args){
		String path="E:/incubator/project0802/data/img1.png";

		try {
			FileInputStream fis=new FileInputStream(path);
			System.out.println("���� ��Ʈ�� ���� ����!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
