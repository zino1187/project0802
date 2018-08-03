/*
현재 클래스를 실행시켜, 원하는 파일을
읽어들인 후, 그 파일의 내용을 원하는
목적에 출력해보자!! = 복사

복사란 대상 파일을 이루고 있는 수많은 바이트 
단위를 읽어들여 목적지에 그대로 복원하는 행위..
*/
package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy{
	int y;//멤버변수는 컴파일러에 의해 초기화된다...
			//단, 개발자가 안하는 경우만...
	public static void main(String[] args){
		//지역변수는 컴파일러가 초기화하지 않는다!!
		int x=0;
		//자바의 문법이 아무리 올바르다 할지라도
		//실행시 외부 요인에 의해 프로그램이 비정상
		//종료될 수도 있다..이러한 경우 예외라 하며
		//자바에서는 언어에서 지정한 예외처리를 반드시
		//처리해야 컴파일이 완료된다..
		
		String path="E:/incubator/project0802/data/memo.txt";
		FileInputStream fis=null;
		FileOutputStream fos=null;		
		
		try{
			fis=new FileInputStream(path);
			System.out.println("파일 스트림 생성 성공!!");
			
			//1byte 씩 출력하는 스트림!!
			//출력이란? 실행중인 프로그램에서 데이터가 나가는것
			//파일출력스트림은, 생성자 호출시 빈(empty) 파일을 생성해낸다
			fos=new FileOutputStream("E:/incubator/project0802/data/memo_copy.txt");
			
			//스트림을 생성한 파일을 대상으로, 1바이트씩
			//이 프로그램으로 읽어들여 오자!!
			while(true){
				int data=fis.read(); //1byte 읽음
				if(data==-1)break;//데이터의 끝은 만나면 루프탈출
				System.out.print(data);
				//읽어들인 바이트를 다시 내뱉자!!(출력)
				fos.write(data);
			}
			// 다 사용한 스트림을 닫기 
			
		}catch(FileNotFoundException e){
			//catch문에 인수로 지정한 객체는
			//자바가상머신이 해당 예외가 발생했을때
			//그 정보를 객체로 만들어 개발자에게
			//전달해 준것이다..따라서 개발자는
			//예외에 대한 정보를 전달받은 e 변수를
			//이용하여 처리하면 된다...
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다..");
		}catch(IOException e){
			System.out.println("파일을 읽던종 오류가 발생했어요..");
		}finally {
			//다쓴 스트림이나 데이터베이스는 무조건 닫아야 
			//하므로 finally 블럭에서 처리한다!!
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



