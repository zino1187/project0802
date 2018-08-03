/*키보드에서 글자를 입력받아서, 파일로 저장해보자*/
package stream;

import java.io.IOException;
import java.io.InputStream;

public class StandardApp {

	public static void main(String[] args) {
		/*
		 * 키보드는 시스템에 장착할때부터
		 * 이미 스트림이 존재하기 때문에
		 * 개발자가 원할때 생성하고 닫는 대상이
		 * 아니다...그리고 지금까지 모니터에
		 * 출력할때 사용해왔던 System.out 객체는
		 *사실 정체가 OutputStream 으로 모든 
		 *출력스트림의 최상위 클래스였다..
		 * */
		InputStream is=System.in;
		try {
			while(true) {
				//read() 메서드는 입력이 일어날때
				//까지 대기상태에 있다...
				int data=is.read();
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("아녕");
	}
}


