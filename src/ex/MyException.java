package ex;
//java.lang 패키지는 언어사용시 기본이 되는 패키지라서
//명시하지 않는다... String, Object..
public class MyException {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String s="";
		
		try {
			arr[0]=1;
			arr[1]=3;
			arr[2]=7;
			arr[3]=8;
			arr[4]=9;
			arr[5]=10;//비정상 종료...
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();//개발자용..
			System.out.println("배열의 크기를 넘어섰네요..");
		}
	}

}
