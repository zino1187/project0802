/*
현재 클래스를 실행시켜, 원하는 파일을
읽어들인 후, 그 파일의 내용을 원하는
목적에 출력해보자!! = 복사

복사란 대상 파일을 이루고 있는 수많은 바이트 
단위를 읽어들여 목적지에 그대로 복원하는 행위..
*/
package stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileCopy2{
	public static void main(String[] args){
		String path="E:/incubator/project0802/data/img1.png";

		try {
			FileInputStream fis=new FileInputStream(path);
			System.out.println("파일 스트림 생성 성공!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
