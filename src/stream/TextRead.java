/*
 * 지금까지 우리가 사용한 스트림은 1byte씩
 * 처리하는 기반이었다...그렇다면 지금 처리
 * 하려는 파일에 한글이 들어있을 경우
 * 어떻게 처리될지 보자...
 * 결론) 깨진다!!! 
 * 왜?) 한글은 2byte가 모여서 표현이되므로 
 *        그 일부인 1byte만을 읽어서 해석하려니깐
 * 해결책) 기존 바이트 기반 스트림을 문자기반스트
 * 			림으로 업그레이드 하면 된다...       
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
			System.out.println("read() 횟수는"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		//실행중인 프로그램에서 한글을 읽었을
		//때 어떻게 되나 보자!!
		new TextRead();
	}

}







